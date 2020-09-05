import java.util.*;

public class Artist{
	private String artist;
	private int[] trackPosition;
	private String[] trackName;
	private int[] numStreamed;
	private int numTracks = 0;

	public Artist(String artist, int trackPosition, String trackName, int numStreamed){
		this.artist = artist; 
		this.trackPosition = new int[200];
		this.trackName = new String[200];
		this.numStreamed = new int[200];
		this.trackPosition[numTracks] = trackPosition;
		this.trackName[numTracks] = trackName;
		this.numStreamed[numTracks] = numStreamed;
		this.numTracks++;
	}

	// public Artist(int trackPosition, String trackName, int numStreamed){
	// 	this.trackPosition[numTracks] = trackPosition;
	// 	this.trackName[numTracks] = trackName;
	// 	this.numStreamed[numTracks] = numStreamed;
	// 	this.numTracks++;
	// }



	//Getters
	public String getArtist(){
		return this.artist;
	}

	// public String getNumStreamed(){
	// 	return Arrays.toString(this.numStreamed);
	// }

	// public String getTrackPosition(){
	// 	return Arrays.toString(this.trackPosition);
	// }

	public String getTrackName(){
		for(int i =0; i< numTracks; i++){
			return this.trackName[i];
		}
		return "";
	}
	
	public String toString(){
		return Arrays.toString(trackName);
	}

	public int getNumTracks(){
		return numTracks;
	}

	public void addTrack(int trackPosition, String trackName, int numStreamed){
		this.trackPosition[numTracks] = trackPosition;
		this.trackName[numTracks] = trackName;
		this.numStreamed[numTracks] = numStreamed;
		this.numTracks++;
	}

}