public class Song{
	//key
	private String songTitle; 
	//instance vars
	private String streamCount;
	private String artistName;
	private int artistAverageStreamCount;
	//node
	Song leftChild;
	Song rightChild;


	//constructor
	public Song(String songTitle, String streamCount, String artistName){
		this.songTitle = songTitle;
		this.streamCount = streamCount;
		this.artistName = artistName;

	}


	//getter
	public String getSongTitle(){
		return songTitle;
	}
	//toString
	public String toString(){
		return songTitle + " is by " + artistName + " with a stream count of " + streamCount;
	}

}