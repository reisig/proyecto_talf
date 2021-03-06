import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CatalogFiles {

	// HELPER FUNCTIONS
	
	public static boolean fileExistsReadableAndNotDir(String path) {
		File file = getFile(path);
		return file.exists() && file.canRead() && file.isFile();
	}
	
	public static boolean dirExistsReadableAndNotFile(String path) {
		File file = getFile(path);
		return file.exists() && file.canRead() && file.isDirectory();
	}
	
	public static File getFile(String path) {
		return new File(path);
	}
	
	public static String getFileNameNoExtension(File file) {
		int period = file.getName().lastIndexOf(".");
		return period > 0 ? file.getName().substring(0, period) : file.getName();
	}

	public static String getFileExtension(File file) {
		int period = file.getName().lastIndexOf(".");
		return period > 0 ? file.getName().substring(file.getName().lastIndexOf(".")+1) : "";
	}
	
	public static String getFileType(File file) {
		return getFileExtension(file).equals("mp3") ? "Music" :
			getFileExtension(file).equals("jpg") || getFileExtension(file).equals("jpeg") ? "Image" : "Unknown";
	}
	
	public static boolean isImage(File file) {
		return getFileType(file).equals("Image");
	}
	
	public static boolean isMusic(File file) {
		return getFileType(file).equals("Music");
	}
	
	public static long getFileSize(File file) {
		return file.length();
	}
	
	public static String getFileModified(File file) {
		Date date = new Date(file.lastModified());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(date); 
	}
	
	// MAIN FILE MANIPULATION FUNCTIONS
	
	public boolean copyFile(CatalogType fromPath, CatalogType toPath) {
			
	    File fromFile = getFile(fromPath.getStrValue());
	    File toFile = getFile(toPath.getStrValue());
	    
	    // check if file to copy exists, if it's a file and if can be read
	    if (!fileExistsReadableAndNotDir(fromPath.getStrValue())) {
	    	System.err.println(fromPath + " does not exists or not readable or a directory.");
	    	return false;
	    }
	    
	    if (toFile.isDirectory()) {
	        toFile = new File(toFile, fromFile.getName());
	    }

	    // handling of file that already exists (for example asking user to overwrite it)
	    if (toFile.exists()) {
		    
	    	if (!toFile.canWrite()) {
		    	System.err.println("cannot write to destination file " + toPath);
		    	return false;
		    }
		    System.out.print("overwrite existing file " + toFile.getName() + "? (Y/N): ");
		    System.out.flush();
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String response = "";
			try {
				response = in.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			if (!response.toUpperCase().equals("Y")) {
				System.out.println("existing file will not be overwritten.");
				return false;
	    	}
	    	else {
	    		String parent = toFile.getParent();
	    		if (parent == null) {
	    			parent = System.getProperty("user.dir");
	    		}
	    		File dir = new File(parent);
	    		if (!dir.exists()) {
	    			System.err.println("destination directory does not exist " + parent);
	    			return false;
	    		}
	    		if (dir.isFile()) {
	    			System.err.println("destination is not a directory " + parent);
	    			return false;
	    		}
	    		if (!dir.canWrite()) {
	    			System.err.println("cannot write to destination directory " + parent);
	    			return false;
	    		}
	    	}
		}
	    
	    // actual copying of the file
	    FileInputStream from = null;
	    FileOutputStream to = null;
	    try {
	      from = new FileInputStream(fromFile);
	      to = new FileOutputStream(toFile);
	      byte[] buffer = new byte[4096];
	      int bytesRead;
	      while ((bytesRead = from.read(buffer)) != -1) {
	        to.write(buffer, 0, bytesRead); // write
	      }
	    }
	    catch (FileNotFoundException e) { e.printStackTrace(); return false;	}
	    catch (IOException e) { e.printStackTrace(); return false; }
	    finally {
	    	if (from != null) {
	    		try {
	    			from.close();
	    		}
	    		catch (IOException e) { e.printStackTrace(); return false; }
	    	}
	    	if (to != null) {
		        try {
		          to.close();
		        }
		    	catch (IOException e) { e.printStackTrace(); return false; }
	    	}
	    }
	    return true;
	    
	}
	
	public boolean deleteFile(CatalogType delPath) {
		
	    File delFile = new File(delPath.getStrValue());
	    
	    // make sure the file or directory exists
	    if (!delFile.exists()) {
	    	System.err.println(delPath + " does not exist");
	    	return false;
	    }
	
	    // make sure we have permissions to write to a file
    	if (!delFile.canWrite()) {
	    	System.err.println("cannot write to destination file " + delPath);
	    	return false;
	    }
	
	    // if file is a directory, make sure it is empty
	    if (delFile.isDirectory()) {
	    	String[] files = delFile.list();
	    	if (files.length > 0) {
	    		System.err.println("directory is not empty " + delPath);
	    		return false;
	    	}
	    }
	
	    return delFile.delete();

	}

	public List<CatalogType> getFiles(CatalogType dirPath, String flag) {
		if (dirExistsReadableAndNotFile(dirPath.getStrValue())) {
			File dirFile = new File(dirPath.getStrValue());
			File[] files = dirFile.listFiles();
			ArrayList<CatalogType> result = new ArrayList<CatalogType>();
			for (int i = 0; i < files.length; i++) {
				result.add(new CatalogType(files[i]));
				if (flag.equals("inside") && files[i].isDirectory()) { // go recursively through sub directories
					result.addAll(getFiles(new CatalogType(files[i].getAbsolutePath()), "inside"));
				}
			}
			return result;
		}
		return new ArrayList<CatalogType>(); // return empty list
	}
	
	public List<CatalogType> getFiles(CatalogType dirPath) {
		return getFiles(dirPath, "in"); // default to non-recursive
	}
	
	public boolean moveFile(CatalogType fromPath, CatalogType toPath) {
		return copyFile(fromPath, toPath) && deleteFile(fromPath);
	}

}