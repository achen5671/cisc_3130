public class SongPlayList{
	private Song root;

	//method addSong that creates a song node. It then check whether the song should be added to the left or right side of the BST
	public void addSong(String songTitle, String streamCount, String artistName){

		Song newSong = new Song(songTitle,streamCount, artistName);

		if(root == null){
			root = newSong;
		}else{
			Song focusSong = root;
			Song parent;

			while(true){
				parent = focusSong;
				//add node to left child
				if(songTitle.compareTo(focusSong.getSongTitle()) <= 0 ){
					focusSong = focusSong.leftChild;

					if(focusSong ==null){
						parent.leftChild = newSong;
						return;
					}
					//add node to right child
				}else if(songTitle.compareTo(focusSong.getSongTitle()) > 0){
					focusSong = focusSong.rightChild;

					if(focusSong == null){
						parent.rightChild = newSong;
						return;
					}
				}
			}
		}
	}
	//getter for root
	public Song getRoot(){
		return root;
	}

}