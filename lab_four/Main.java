//Importing necessary package to use cetain features
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		//Path name to Spotify csv
		Scanner input = new Scanner(System.in);
		String name;
		ArrayList<Song> songList = new ArrayList<Song>();
		BufferedReader br;
		String path = "C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_four\\Fiscal Quarter List\\";


		String[] fiscalQuarter = {path + "regional-global-weekly-2020-07-03--2020-07-10.csv",
		path + "regional-global-weekly-2020-07-10--2020-07-17.csv",
		path + "regional-global-weekly-2020-07-17--2020-07-24.csv",
		path + "regional-global-weekly-2020-07-24--2020-07-31.csv",
		path + "regional-global-weekly-2020-07-31--2020-08-07.csv",
		path + "regional-global-weekly-2020-08-07--2020-08-14.csv",
		path + "regional-global-weekly-2020-08-14--2020-08-21.csv",
		path + "regional-global-weekly-2020-08-21--2020-08-28.csv",
		path + "regional-global-weekly-2020-08-28--2020-09-04.csv",
		path + "regional-global-weekly-2020-09-04--2020-09-11.csv",
		path + "regional-global-weekly-2020-09-04--2020-09-11.csv",
		path + "regional-global-weekly-2020-09-04--2020-09-11.csv",
		};

		//try catch block. Throws neccesary error message if any.
		try{

			PrintWriter outFile = new PrintWriter("C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_four\\output.txt");
			Stack<Song> stack = new Stack<Song>();

			System.out.println("VIP: Please enter your name.");
			name = input.nextLine();

			System.out.println("Hi " + name);
			System.out.println("This program consist the fiscal quarter. Months of July  - Septemeber (17 weeks)");
			outFile.println("This program consist the fiscal quarter. Months of July  - Septemeber (17 weeks)");
			outFile.println();

			

			//for each string in the array of csv file, read it
			for(String s: fiscalQuarter){
				br = new BufferedReader(new FileReader(s));
				addTracks(br, songList);

			}
			//call sort method to sort artist
			sortArtist(songList);

			//add the list to a set to remove duplicates
			Set<Song> set = new HashSet<>(songList);

			//create a queue to store the list of songs
			Queue<Song> que = new LinkedList<Song>();


			//loop through songlist and add it to a queue
			for(Song s: set){
				que.add(s);
			}


			
			//commands
			//play first song

			stack.add(que.poll());

			//play the next 50 songs
			for(int i = 0; i < 50; i++){
				stack.add(que.poll());
			}
		

			//go through the que and print out the songs
			outFile.println("Here are the songs left in your queue for the fiscal quarter");
			outFile.println();
			for(Song s: que){
				outFile.println(s.getArtistName() + " " +   s.getSongName());

			}
			System.out.println();
			System.out.println("The last song played was");
			System.out.println(stack.pop());
			outFile.println();
			outFile.println("The last song played was");
			outFile.println(stack.pop());

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
	ArrayList of songs
	**process:** 
	Read in artist name and song name.
	**output:** 
	Create a song obj and add it to the arraylist songs
	**/
	public static void addTracks(BufferedReader br, ArrayList<Song> songs) throws IOException{
		//vars
		Song song;
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
			//int songPosition = Integer.parseInt(tokens[0]);
			//Find Song Artist
			String songName = tokens[1];
			//Find track name
			String artistName = tokens[2];
			//Find # of time Stream
			//int numStreamed = Integer.parseInt(tokens[3]);

			song = new Song(artistName, songName);
			songs.add(song);
		}
	}

	//method that uses collection sort to sort the filled arraylist alphabetically by artist name
	public static void sortArtist(ArrayList<Song> songList){
		Collections.sort(songList, new Comparator<Song>(){
			public int compare(Song s1, Song s2){
				return s1.getSongName().compareTo(s2.getSongName());
			}

		});
	}
}