package controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CatalogType implements Comparable {

	private Object _value  = null;
	public static CatalogType VOID = new CatalogType(new Object());
	
	// CONSTRUCTORS
	
	public CatalogType() { }

	public CatalogType(Object value) {
		_value = value;
	}

	public CatalogType(String value, Boolean dir) {
	    if(value!=null){
		File file = new File(value);
		if(file.exists() && file.canRead() && !file.isHidden()){
		    if(dir){
			if(file.isDirectory())
			    _value = CatalogFiles.getFile(value); // change of plans, value is going to be a file
		    }else{
			if(file.isFile())
			    _value = CatalogFiles.getFile(value); // change of plans, value is going to be a file
		    }
			
		}else _value = value; // otherwise, it is just a string
	    }
	}
	
	public CatalogType(String value) {
	    if(value!=null){
		File file = new File(value);
		if(file.exists() && file.canRead() && !file.isHidden()){
		    	_value = CatalogFiles.getFile(value); // change of plans, value is going to be a file			
		}else _value = value; // otherwise, it is just a string
	    }
	}

	public CatalogType(int value) {
		_value = new Integer(value);
	}
	
	public CatalogType(boolean value) {
		_value = new Boolean(value);
	}
	
	// TYPE CHECKERS
	
	public boolean isInt() {
		return this.getValue() instanceof Integer;
	}
	
	public boolean isStr() {
		return this.getValue() instanceof Integer ;
	}
	
	public boolean isBool() {
		return this.getValue() instanceof Boolean;
	}
	
	public boolean isFile() {
		return this.getValue() instanceof File;
	}
	
	public boolean isDouble(){
	    	return this.getValue() instanceof Double;
	}
	
	public boolean isVoid(){
	    return (!isInt() && !isStr() && !isBool() && !isFile() && !isDouble());
	}
		
	// VALUE GETTERS
	
	public Object getValue() {
		return this._value instanceof CatalogType ? ((CatalogType)this._value).getValue() : this._value;
	}
	
	public int getIntValue() {
		return this.isInt() ? ((Integer)_value).intValue() : isNumber(this) ? Integer.parseInt(getStrValue()) : 0;
	}
	
	public String getStrValue() {
		return this.getValue() != null ? this.getValue().toString() : "0";
	}
	
	public Boolean getBoolValue() {
		return (Boolean)this.getValue();
	}
	
	public boolean isTrue() {
		return this.isBool() && (Boolean)this.getValue() == true;
	}
	
	public String toString() {
		return getStrValue();
	}
	
	public Double getDoubleValue() {
	    return this.isDouble() ? ((Double)_value).intValue() : isNumber(this) ? Double.parseDouble(getStrValue()) : 0;
	}
	
	public CatalogType getProperty(String propertyName) {
		if (this.isFile()) {
			File file = (File)this.getValue();
    			// general properties
    			if (propertyName.equals("Name")) {
    				return new CatalogType(CatalogFiles.getFileNameNoExtension(file));
    			}
    			else if (propertyName.equals("FullName")) {
				return new CatalogType(CatalogFiles.getFileName(file));
			}
    			else if (propertyName.equals("FullPath")) {
				return new CatalogType(CatalogFiles.getFullPathName(file));
			}
    			else if (propertyName.equals("Extension")) {
    				return new CatalogType(CatalogFiles.getFileExtension(file));
    			}
    			else if (propertyName.equals("Type")) {
    				return new CatalogType(CatalogFiles.getFileType(file));
    			}
    			else if (propertyName.equals("Size")) {
    				return new CatalogType(CatalogFiles.getFileSize(file));
    			}
    			else if (propertyName.equals("Modified")) {
    				return new CatalogType(CatalogFiles.getFileModified(file));
    			}
    			else if (propertyName.equals("Path")) {
				return new CatalogType(CatalogFiles.getFullPath(file));
			}
    			// image file properties
    			else if (propertyName.equals("Make")) {
    				return new CatalogType(CatalogFiles.isImage(file) ? CatalogImaging.getCameraMake(file) : "not an image");
    			}
    			else if (propertyName.equals("Model")) {
    				return new CatalogType(CatalogFiles.isImage(file) ? CatalogImaging.getCameraModel(file) : "not an image");
    			}
    			else if (propertyName.equals("Taken")) {
    				return new CatalogType(CatalogFiles.isImage(file) ? CatalogImaging.getDateTaken(file) : "not an image");
    			}
    			else if (propertyName.equals("Width")) {
    				return new CatalogType(CatalogFiles.isImage(file) ? CatalogImaging.getWidth(file) : "not an image");
    			}
    			else if (propertyName.equals("Height")) {
    				return new CatalogType(CatalogFiles.isImage(file) ? CatalogImaging.getHeight(file) : "not an image");
    			}
    			// music file properties
    			else if (propertyName.equals("Artist")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getArtist(file) : "not a music file");
    			}
    			else if (propertyName.equals("Album")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getAlbum(file) : "not a music file");
    			}
    			else if (propertyName.equals("Title")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getTitle(file) : "not a music file");
    			}
    			else if (propertyName.equals("Genre")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getGenre(file) : "not a music file");
    			}
    			else if (propertyName.equals("Year")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getYear(file) : "not a music file");
    			}
    			else if (propertyName.equals("Track")) {
    				return new CatalogType(CatalogFiles.isMusic(file) ? CatalogMusic.getTrack(file) : "not a music file");
    			}
    			return new CatalogType("Propiedad desconocida");
		}
		else { return new CatalogType("No es un archivo"); }
	}
	
	public CatalogType applyPattern(String pattern) {
		String result = "";
		if (isNumber(pattern)) { // SUBSTRING pattern
			int substr = Integer.parseInt(pattern);
			if (substr > 0) {
				result = this.getStrValue().substring(0, substr);
			}
			else {
				result = this.getStrValue().substring(this.getStrValue().length() + substr);
			}
		}
		else { // DATE pattern
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); // assume date is in this format
			try {
				Date date = formatter.parse(this.getStrValue());
				formatter = new SimpleDateFormat(pattern.replace("D", "d").replace("Y", "y"));
				result = formatter.format(date);
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return new CatalogType(result);
	}
	
	// COMPARISON FUNCTIONS
	
	public CatalogType lessThan(CatalogType obj) {
		return new CatalogType(this.isInt() && obj.isInt() && this.getIntValue() < obj.getIntValue());
	}
	
	public CatalogType lessThanOrEquals(CatalogType obj) {
		return new CatalogType(this.lessThan(obj).getBoolValue() || this.equals(obj).getBoolValue());
	}
	
	public CatalogType greaterThan(CatalogType obj) {
		return new CatalogType(this.isInt() && obj.isInt() && this.getIntValue() > obj.getIntValue());
	}
	
	public CatalogType greaterThanOrEquals(CatalogType obj) {
		return new CatalogType(this.greaterThan(obj).getBoolValue() || this.equals(obj).getBoolValue());
	}
	
	public CatalogType equals(CatalogType obj) {
		return new CatalogType(this.getValue().equals(obj.getValue()));
	}
	
	public CatalogType notEquals(CatalogType obj) {
		return new CatalogType(!this.getValue().equals(obj.getValue()));
	}
	
	// ARITHMETIC FUNCTIONS
	
	public CatalogType add(CatalogType obj) {
		
		if (isNumber(this) && isNumber(obj)) { // add two numbers
			return preservePadding(this.getIntValue() + obj.getIntValue(), obj);
		}
		else if (this.isInt() && obj.isStr()) { // Java concatenates strings and ints
			return new CatalogType(this.getIntValue() + obj.getStrValue());
		}
		else if (this.isStr() && obj.isInt()) { // Java concatenates strings and ints
			return new CatalogType(this.getStrValue() + obj.getIntValue());
		}
		else if (this.isStr() && obj.isStr()) { // Java concatenates strings
			return new CatalogType(this.getStrValue() + obj.getStrValue());
		}
		return new CatalogType(null);
	}
	
	public CatalogType subtract(CatalogType obj) {
		if (isNumber(this) && isNumber(obj)) { // subtract two numbers
			return preservePadding(this.getIntValue() - obj.getIntValue(), obj);
		}
		return new CatalogType(null);
	}
	
	public CatalogType multiply(CatalogType obj) {
		if (isNumber(this) && isNumber(obj)) { // multiply two numbers
			return preservePadding(this.getIntValue() * obj.getIntValue(), obj);
		}
		return new CatalogType(null);
	}
	
	public CatalogType divide(CatalogType obj) {
		if (isNumber(this) && isNumber(obj)) { // divide two numbers
			return preservePadding(this.getIntValue() / obj.getIntValue(), obj);
		}
		return new CatalogType(null);
	}
	
	// HELPER FUNCTIONS
	
	public static boolean isNumber(String str) {
		try { // check if the string parses to integer successfully
			Integer.parseInt(str);
		}
		catch (NumberFormatException nfe){
			return false; // failed, not a number
		}
		return true; // success, string is a number
	}
	
	public static boolean isNumber(CatalogType obj) {
		return obj.isInt() || isNumber(obj.getStrValue());
	}

	public static String padWithZeroes(int number, int width) {
		StringBuffer result = new StringBuffer(""); // add zeroes to the left of the number
		for (int j = 0; j < width-Integer.toString(number).length(); j++) {
			result.append("0"); // add as many zeroes as needed to make all numbers have same number of digits
		}
		result.append(Integer.toString(number));
		return result.toString();
	}
	
	private CatalogType preservePadding(int number, CatalogType obj) {
		if (number >= 0 && (this.getStrValue().startsWith("0") || obj.getStrValue().startsWith("0"))) {
			return new CatalogType(padWithZeroes(number, Math.max(this.getStrValue().length(), obj.getStrValue().length())));
		}
		return new CatalogType(number);
	}

	public int compareTo(Object o) {
		return this.getProperty("Name").compareTo(((CatalogType)o).getProperty("Name"));
	}
	
}
