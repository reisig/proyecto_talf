package controller;
import java.io.*;
import java.text.*;
import java.util.*;

import com.drew.metadata.*;
import com.drew.imaging.jpeg.*;
import com.drew.metadata.exif.*;

public class CatalogImaging {
	
	public static String getCameraMake(File file) {
		Directory exifDirectory = getMetaDirectory(file);
		return exifDirectory != null ? exifDirectory.getString(ExifDirectory.TAG_MAKE) : "no camera make info";
	}
	
	public static String getCameraModel(File file) {
		Directory exifDirectory = getMetaDirectory(file);
		return exifDirectory != null ? exifDirectory.getString(ExifDirectory.TAG_MODEL) : "no camera model info";
	}
	
	public static String getDateTaken(File file) {
		Directory exifDirectory = getMetaDirectory(file);
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss"); // original format
			if (exifDirectory != null) {
				String dateStr = exifDirectory.getString(ExifDirectory.TAG_DATETIME_ORIGINAL);
				Date date = formatter.parse(dateStr);
				formatter =  new SimpleDateFormat("MM/dd/yyyy"); // desired format
				return formatter.format(date);
			}
			return "no date picture taken info";
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return "error occurred while getting the date";
	}
	
	public static String getWidth(File file) {
		Directory exifDirectory = getMetaDirectory(file);
		return exifDirectory != null ? exifDirectory.getString(ExifDirectory.TAG_EXIF_IMAGE_WIDTH) : "no width info";
	}
	
	public static String getHeight(File file) {
		Directory exifDirectory = getMetaDirectory(file);
		return exifDirectory != null ? exifDirectory.getString(ExifDirectory.TAG_EXIF_IMAGE_HEIGHT) : "no width info";
	}
	
	private static Directory getMetaDirectory(File file) {
		try {
			Metadata metadata = JpegMetadataReader.readMetadata(file);
			return metadata.getDirectory(ExifDirectory.class);
		}
		catch (JpegProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
