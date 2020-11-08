public class SongPlayList{
	private Song root;

	
	public void addSong(String songTitle, int streamCount, String artistName){

		Song newSong = new Song(songTitle, streamCount, artistName);

		if(root == null){
			root = newSong;
		}else{
			Song focusSong = root;
			Song parent;

			while(true){
				parent = focusSong;

				if(songTitle.compareTo(focusSong.getSongTitle()) < 0 ){
					focusSong = focusSong.leftChild;

					if(focusSong ==null){
						parent.leftChild = newSong;
						return;
					}
				}else{
					focusSong = focusSong.rightChild;

					if(focusSong == null){
						parent.rightChild = newSong;
						return;
					}
				}
			}
		}
	}

	public Song getRoot(){
		return root;
	}





}