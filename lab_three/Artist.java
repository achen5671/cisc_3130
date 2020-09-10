import java.util.*;

public class Artist{
	//instance vars
	private String artist;
	private ArrayList<Track> tracks;

	//constructor
	public Artist(String artist, int trackPosition, String trackName, int numStreamed){
		this.artist = artist; 
		tracks = new ArrayList<Track>();
		tracks.add(new Track(trackPosition, trackName, numStreamed));
	}

	//Getters
	public String getArtist(){
		return this.artist;
	}
	
	public int getNumTracks(){
		return tracks.size();
	}

	//toString() prints out info 
	public String toString(){
		String s = "";
		for(Track track: tracks){
			s += track;
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
		tracks.add(new Track(trackPosition, trackName, numStreamed));
	}

}