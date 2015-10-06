package controller;

import java.io.*;
import java.text.*;
import java.util.*;

import org.xml.sax.SAXException;

public class CatalogImaging {
	
	public static String getCameraMake(File file) {
//		Metadata metadata = getMetaDirectory(file);
//		String make = metadata.get("File Modified Date");
//		String names[] = metadata.names();
//		for (String string : names) {
//		    System.out.println(string);
//		}
//		return make == null ?  "No camera make info" : make;
		      return null;
	}
	
	public static String getCameraModel(File file) {
//		Metadata metadata = getMetaDirectory(file);
//		String cameraModel = metadata.get("");
//		return cameraModel == null ?  "No camera model info" : cameraModel;
		      return null;
	}
	
	public static String getDateTaken(File file) {
//	    Metadata metadata = getMetaDirectory(file);
//	    String dateTaken = metadata.get("");
//	    return dateTaken == null ?  "No date taken info" : dateTaken;
	      return null;
	}
	
	public static String getWidth(File file) {
//	    Metadata metadata = getMetaDirectory(file);
//	    String width = metadata.get("Image Width");
//	    return width == null ?  "No width info" : width;
	      return null;
	}
	
	public static String getHeight(File file) {
//	    Metadata metadata = getMetaDirectory(file);
//	    String height = metadata.get("Image Height");
//	    return height == null ?  "No height info" : height;
	      return null;
	}
	
	public static File getMetaDirectory(File file ){
//	    //detecting the file type
//	      BodyContentHandler handler = new BodyContentHandler();
//	      Metadata metadata = new Metadata();
//	      FileInputStream inputstream = null;
//    	      try {
//    		inputstream = new FileInputStream(file);
//    	      } catch (FileNotFoundException e1) {
//    		e1.printStackTrace();
//    	      }
//    	      ParseContext pcontext = new ParseContext();
//	      
//	      //Jpeg Parse
//	      JpegParser  jpgParser = new JpegParser();
//	      
//	      try {
//		jpgParser.parse(inputstream, handler, metadata,pcontext);
//	      } catch (IOException | SAXException | TikaException e) {
//		e.printStackTrace();
//	      }
//	      return metadata;
	      return null;
	}
	
	
}
