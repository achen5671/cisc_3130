public class Song{
	//key
	private String songTitle; 
	//instance vars
	private int streamCount;
	private String artistName;
	private int artistAverageStreamCount;

	Song leftChild;
	Song rightChild;

	public Song(String songTitle, int streamCount, String artistName){
		this.songTitle = songTitle;
		this.streamCount = streamCount;
		this.artistName = artistName;

	}

	public String getSongTitle(){
		return songTitle;
	}

}