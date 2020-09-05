import java.util.*;

public class Artist{
	//instance vars
	private String artist;
	private int[] trackPosition;
	private String[] trackName;
	private int[] numStreamed;
	private int numTracks = 0;

	//constructor
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

	//Getters
	public String getArtist(){
		return this.artist;
	}
	
	public int getNumTracks(){
		return numTracks;
	}

	//toString() prints out info 
	public String toString(){
		String s = "";
		for(int i = 0; i < numTracks;i++){
			s += trackPosition[i] + ", " + artist + ", " + trackName[i] + ", " + numStreamed[i] + "\n";
		}
		return s + "\n";
	}

	/**
	**input:**
	trackposition, trackname, track # numstreamed.
	**process/output**
	set info to arrays
	**/
	public void addTrack(int trackPosition, String trackName, int numStreamed){
		this.trackPosition[numTracks] = trackPosition;
		this.trackName[numTracks] = trackName;
		this.numStreamed[numTracks] = numStreamed;
		this.numTracks++;
	}

}