package controller;
import java.io.*;
import java.util.*;

import org.farng.mp3.*;

public class CatalogMusic {

	public static String getArtist(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? mp3file.getID3v1Tag().getArtist() : "no Artist info";
	}
	
	public static String getAlbum(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? mp3file.getID3v2Tag().getAlbumTitle() : "no Album info";
	}
	
	public static String getTitle(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? mp3file.getID3v2Tag().getSongTitle() : "no Title info";
	}
	
	public static String getGenre(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? _genreMap.get(mp3file.getID3v1Tag().getSongGenre()) : "no Genre info";
	}
	
	public static String getYear(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? mp3file.getID3v2Tag().getYearReleased() : "no Year info";
	}
	
	public static String getTrack(File file) {
		MP3File mp3file = getMP3File(file);
		return mp3file != null ? mp3file.getID3v2Tag().getTrackNumberOnAlbum() : "no Track info";
	}
	
	public static MP3File getMP3File(File file) {
		try {
			return new MP3File(file);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (TagException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static HashMap<String, String> _genreMap;
	
	static {
		_genreMap = new HashMap<String, String>();
		_genreMap.put("0", "Blues");
		_genreMap.put("1", "Classic Rock");
		_genreMap.put("2", "Country");
		_genreMap.put("3", "Dance");
		_genreMap.put("4", "Disco");
		_genreMap.put("5", "Funk");
		_genreMap.put("6", "Grunge");
		_genreMap.put("7", "Hip-Hop");
		_genreMap.put("8", "Jazz");
		_genreMap.put("9", "Metal");
		_genreMap.put("10", "New Age");
		_genreMap.put("11", "Oldies");
		_genreMap.put("12", "Other");
		_genreMap.put("13", "Pop");
		_genreMap.put("14", "R&B");
		_genreMap.put("15", "Rap");
		_genreMap.put("16", "Reggae");
		_genreMap.put("17", "Rock");
		_genreMap.put("18", "Techno");
		_genreMap.put("19", "Industrial");
		_genreMap.put("20", "Alternative");
		_genreMap.put("21", "Ska");
		_genreMap.put("22", "Death Metal");
		_genreMap.put("23", "Pranks");
		_genreMap.put("24", "Soundtrack");
		_genreMap.put("25", "Euro-Techno");
		_genreMap.put("26", "Ambient");
		_genreMap.put("27", "Trip-Hop");
		_genreMap.put("28", "Vocal");
		_genreMap.put("29", "Jazz+Funk");
		_genreMap.put("30", "Fusion");
		_genreMap.put("31", "Trance");
		_genreMap.put("32", "Classical");
		_genreMap.put("33", "Instrumental");
		_genreMap.put("34", "Acid");
		_genreMap.put("35", "House");
		_genreMap.put("36", "Game");
		_genreMap.put("37", "Sound Clip");
		_genreMap.put("38", "Gospel");
		_genreMap.put("39", "Noise");
		_genreMap.put("40", "AlternRock");
		_genreMap.put("41", "Bass");
		_genreMap.put("42", "Soul");
		_genreMap.put("43", "Punk");
		_genreMap.put("44", "Space");
		_genreMap.put("45", "Meditative");
		_genreMap.put("46", "Instrumental Pop");
		_genreMap.put("47", "Instrumental Rock");
		_genreMap.put("48", "Ethnic");
		_genreMap.put("49", "Gothic");
		_genreMap.put("50", "Darkwave");
		_genreMap.put("51", "Techno-Industrial");
		_genreMap.put("52", "Electronic");
		_genreMap.put("53", "Pop-Folk");
		_genreMap.put("54", "Eurodance");
		_genreMap.put("55", "Dream");
		_genreMap.put("56", "Southern Rock");
		_genreMap.put("57", "Comedy");
		_genreMap.put("58", "Cult");
		_genreMap.put("59", "Gangsta");
		_genreMap.put("60", "Top 40");
		_genreMap.put("61", "Christian Rap");
		_genreMap.put("62", "Pop/Funk");
		_genreMap.put("63", "Jungle");
		_genreMap.put("64", "Native American");
		_genreMap.put("65", "Cabaret");
		_genreMap.put("66", "New Wave");
		_genreMap.put("67", "Psychadelic");
		_genreMap.put("68", "Rave");
		_genreMap.put("69", "Showtunes");
		_genreMap.put("70", "Trailer");
		_genreMap.put("71", "Lo-Fi");
		_genreMap.put("72", "Tribal");
		_genreMap.put("73", "Acid Punk");
		_genreMap.put("74", "Acid Jazz");
		_genreMap.put("75", "Polka");
		_genreMap.put("76", "Retro");
		_genreMap.put("77", "Musical");
		_genreMap.put("78", "Rock & Roll");
		_genreMap.put("79", "Hard Rock");
		_genreMap.put("80", "Folk");
		_genreMap.put("81", "Folk-Rock");
		_genreMap.put("82", "National Folk");
		_genreMap.put("83", "Swing");
		_genreMap.put("84", "Fast Fusion");
		_genreMap.put("85", "Bebob");
		_genreMap.put("86", "Latin");
		_genreMap.put("87", "Revival");
		_genreMap.put("88", "Celtic");
		_genreMap.put("89", "Bluegrass");
		_genreMap.put("90", "Avantgarde");
		_genreMap.put("91", "Gothic Rock");
		_genreMap.put("92", "Progressive Rock");
		_genreMap.put("93", "Psychedelic Rock");
		_genreMap.put("94", "Symphonic Rock");
		_genreMap.put("95", "Slow Rock");
		_genreMap.put("96", "Big Band");
		_genreMap.put("97", "Chorus");
		_genreMap.put("98", "Easy Listening");
		_genreMap.put("99", "Acoustic");
		_genreMap.put("100", "Humour");
		_genreMap.put("101", "Speech");
		_genreMap.put("102", "Chanson");
		_genreMap.put("103", "Opera");
		_genreMap.put("104", "Chamber Music");
		_genreMap.put("105", "Sonata");
		_genreMap.put("106", "Symphony");
		_genreMap.put("107", "Booty Bass");
		_genreMap.put("108", "Primus");
		_genreMap.put("109", "Porn Groove");
		_genreMap.put("110", "Satire");
		_genreMap.put("111", "Slow Jam");
		_genreMap.put("112", "Club");
		_genreMap.put("113", "Tango");
		_genreMap.put("114", "Samba");
		_genreMap.put("115", "Folklore");
		_genreMap.put("116", "Ballad");
		_genreMap.put("117", "Power Ballad");
		_genreMap.put("118", "Rhythmic Soul");
		_genreMap.put("119", "Freestyle");
		_genreMap.put("120", "Duet");
		_genreMap.put("121", "Punk Rock");
		_genreMap.put("122", "Drum Solo");
		_genreMap.put("123", "A capella");
		_genreMap.put("124", "Euro-House");
		_genreMap.put("125", "Dance Hall");	
	}
	
}
