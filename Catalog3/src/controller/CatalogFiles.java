package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatalogFiles {

	// HELPER FUNCTIONS
	
	public static boolean fileExistsReadableAndNotDir(String path) {
		File file = getFile(path);
		return file.exists() && file.canRead() && !file.isDirectory();
	}
	
	public static boolean dirExistsReadableAndNotFile(String path) {
		File file = getFile(path);
		return file.exists() && file.canRead() && file.isDirectory();
	}
	
	public static File getFile(String path) {
		return new File (path);
	}
	
	public static String getFileNameNoExtension(File file) {
		int period = file.getName().lastIndexOf(".");
		return period > 0 ? file.getName().substring(0, period) : file.getName();
	}
	
	public static String getFullPath(File file) {
	    	String absolutePath = file.getAbsolutePath();
	    	return absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
	}
	
	public static String getFullPathName(File file) {
	    	return file.getAbsolutePath();
	}
	
	public static String getFileName(File file) {
	    return file.getName();
	}


	public static String getFileExtension(File file) {
		int period = file.getName().lastIndexOf(".");
		return period > 0 ? file.getName().substring(file.getName().lastIndexOf(".")+1) : "";
	}
	
	public static String getFileType(File file) {
		return getFileExtension(file).equalsIgnoreCase("mp3") ? "Music" :
			getFileExtension(file).equalsIgnoreCase("jpg") || getFileExtension(file).equalsIgnoreCase("jpeg") ? "Image" : "Unknown";
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
	    	System.err.println(fromPath + " no existe, o no se pudo leer, o no es un directorio.");
	    	return false;
	    }
	    
	    if (toFile.isDirectory()) {
	        toFile = new File(toFile, fromFile.getName());
	    }

	    // handling of file that already exists (for example asking user to overwrite it)
	    if (toFile.exists()) {
		    
	    	if (!toFile.canWrite()) {
		    	System.err.println("No se pudo escribir al archivo destino: " + toPath);
		    	return false;
		    }
		    System.out.print("¿Sobreescribir archivo " + toFile.getName() + "? (Y/N): ");
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
				System.out.println("El archivo existente no sera sobreescrito.");
				return false;
	    	}
	    	else {
	    		String parent = toFile.getParent();
	    		if (parent == null) {
	    			parent = System.getProperty("user.dir");
	    		}
	    		File dir = new File(parent);
	    		if (!dir.exists()) {
	    			System.err.println("El directorio destino no existe: " + parent);
	    			return false;
	    		}
	    		if (dir.isFile()) {
	    			System.err.println("El destino no es un directorio: " + parent);
	    			return false;
	    		}
	    		if (!dir.canWrite()) {
	    			System.err.println("No se pudo escribir al directorio destino: " + parent);
	    			return false;
	    		}
	    	}
		}
	    
	    // actual copying of the file
	    Path from = Paths.get(fromFile.getAbsolutePath());
	    Path to   = Paths.get(toFile.getAbsolutePath());
	    
	    try {
		//replace existing file using java nio package
		System.out.println("Copying: "+from+" To: "+to);
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	   
//	    FileInputStream from = null;
//	    FileOutputStream to = null;
//	    try {
//	      from = new FileInputStream(fromFile);
//	      to = new FileOutputStream(toFile);
//	      byte[] buffer = new byte[4096];
//	      int bytesRead;
//	      while ((bytesRead = from.read(buffer)) != -1) {
//	        to.write(buffer, 0, bytesRead); // write
//	      }
//	    }
//	    catch (FileNotFoundException e) { e.printStackTrace(); return false;	}
//	    catch (IOException e) { e.printStackTrace(); return false; }
//	    finally {
//	    	if (from != null) {
//	    		try {
//	    			from.close();
//	    		}
//	    		catch (IOException e) { e.printStackTrace(); return false; }
//	    	}
//	    	if (to != null) {
//		        try {
//		          to.close();
//		        }
//		    	catch (IOException e) { e.printStackTrace(); return false; }
//	    	}
//	    }
	    return true;
	    
	}
	
	public boolean deleteFile(CatalogType delPath) {
		
	    File delFile = new File(delPath.getStrValue());
	    
	    // make sure the file or directory exists
	    if (!delFile.exists()) {
	    	System.err.println("El directorio: "+delPath + " no existe");
	    	return false;
	    }
	
	    // make sure we have permissions to write to a file
    	if (!delFile.canWrite()) {
	    	System.err.println("No se puede escribir al archivo destino: " + delPath);
	    	return false;
	    }
	
	    // if file is a directory, make sure it is empty
	    if (delFile.isDirectory()) {
	    	String[] files = delFile.list();
	    	if (files.length > 0) {
	    		System.err.println("El directorio no esta vacio: " + delPath);
	    		return false;
	    	}
	    }
	
	    return delFile.delete();

	}
	
	public boolean createFolder (CatalogType name, CatalogType path){
	    	boolean success = false;
	    	String filePath = path.getStrValue().concat("\\").concat(name.getStrValue());
	    	File file = new File (filePath);
	    	if(!file.exists()){
	    	    try {
	    		System.out.println("Creating: "+file.toPath());
			Files.createDirectory(file.toPath());
		    } catch (IOException e) {
			System.err.println("Error al crear el directorio!");
			e.printStackTrace();
		    }
	    	}
	    	return success;
	}

	public List<CatalogType> getFiles(CatalogType dirPath, String flag) {
		if (dirExistsReadableAndNotFile(dirPath.getStrValue())) {
			File dirFile = new File(dirPath.getStrValue());
			File[] files = dirFile.listFiles();
			ArrayList<CatalogType> result = new ArrayList<CatalogType>();
			for (int i = 0; i < files.length; i++) {
			    	if(!files[i].isDirectory())
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