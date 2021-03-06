//Importing necessary package to use cetain features
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		//Path name to Spotify csv
		String path = "C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_three\\regional-global-daily-latest.csv";
		//try catch block. Throws neccesary error message if any.
		try{
			//Print output to txt file.
			PrintWriter outFile = new PrintWriter("C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_three\\Artists-WeekOf09.03.2020.txt");
			//Obtaining input from file
			BufferedReader br = new BufferedReader(new FileReader(path));
			//ArrayList of artists
			ArrayList<Artist> artistTrack = new ArrayList<Artist>();
			
			//READS FIRST LINE (HEADER) and prints to output file
			outFile.println(br.readLine() + "\n");

			//Add track method
			addTracks(br, artistTrack);
			sortArtist(artistTrack);

			//Loop through arraylist and prints out toString()
			for(Artist art : artistTrack){
				outFile.println("Artist: " + art.getArtist());
				outFile.println("# of Track: (" + art.getNumTracks() + ")");
				outFile.println(art.toString());
			}
			
			//flush stream. (Write out any buffered output)
			outFile.flush();

		//Throw error if any
		}catch(FileNotFoundException e){
			System.err.println("This file does not exist");
		}catch(IOException e){
			System.err.println("There is an IOException");
		}
	}


	/**
	**input:** 
	BufferedReader br,
	ArrayList of artist
	**process:** 
	Read in artist name, trackname, trackposition, and # time streamed. Also checks whether the artist already exist in the arraylist.
	**output:** 
	If artist exist, add the track to the object, if NOT creating a new artist and add info. 
	**/
	public static void addTracks(BufferedReader br, ArrayList<Artist> artistTrack) throws IOException{
		//vars
		Artist artist;
		String info = "";
		//while loop that loops through each existing line
		while((info = br.readLine()) != null){
			//replace all ", " to a " ". This removes unnessary commas EXCLUDING the comma separting the info. (commas in track name etc).
			info = info.replaceAll(", ", " ");
			//replace all quotes in the file. 
			info = info.replaceAll("\"", "");
			
			//Token array
			String[] tokens = info.split(",");
			
			//Find track position
			int trackPosition = Integer.parseInt(tokens[0]);
			//Find Song Artist
			String trackName = tokens[1];
			//Find track name
			String artistName = tokens[2];
			//Find # of time Stream
			int numStreamed = Integer.parseInt(tokens[3]);
			//boolean to check if artist exist in the list.
			boolean exist = true;

			//check if list is empty
			if(artistTrack.size() == 0){
				artist = new Artist(artistName, trackPosition, trackName,numStreamed);
				artistTrack.add(artist);
			}else{
				//check if artist exist
				for(Artist art: artistTrack){
					if(artistName.equals(art.getArtist())){
						art.addTrack(trackPosition, trackName,numStreamed);
						exist = false;
					}
				}
				//condition if artist does NOT exist
				if(exist){
					artist = new Artist(artistName,trackPosition, trackName,numStreamed);
					artistTrack.add(artist);
				}
			}
		}
	}

	//method that uses collection sort to sort the filled arraylist alphabetically by artist name
	public static void sortArtist(ArrayList<Artist> artistTracks){
		Collections.sort(artistTracks, new Comparator<Artist>(){
			public int compare(Artist a1, Artist a2){
				return a1.getArtist().compareTo(a2.getArtist());
			}

		});
	}

	
}