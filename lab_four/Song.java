public class Song{
	//instance var
	private String artistName; 
	private String songName;

	//constructor
	public Song(String artistName, String songName){
		this.artistName = artistName;
		this.songName = songName;

	}

	//getters
	public String getArtistName(){
		return artistName;
	}

	public String getSongName(){
		return songName;
	}

	public String toString(){
		return artistName + ", " + songName;
	}


}