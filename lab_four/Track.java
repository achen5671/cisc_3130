public class Track{
	//instance var
	private int trackPosition;
	private int numStreamed;
	private String trackName;

	public Track(int trackPosition, String trackName, int numStreamed){
		this.trackPosition = trackPosition;
		this.numStreamed = numStreamed;
		this.trackName = trackName;
	}

	public int getTrackPosition(){
		return trackPosition;
	}

	public int getNumStreamed(){
		return numStreamed;
	}

	public String trackName(){
		return trackName;
	}
	public String toString(){
		return trackPosition + ", " + trackName + ", " + numStreamed + "\n";
	}


	
}