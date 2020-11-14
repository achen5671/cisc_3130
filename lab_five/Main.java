//Importing necessary package to use cetain features
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		//Relative Path name to Spotify csv
		Scanner input = new Scanner(System.in);
		String name;
		ArrayList<Song> songList = new ArrayList<Song>();
		BufferedReader br;
		String path = "Fiscal Quarter List/";


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

			PrintWriter outFile = new PrintWriter("output.txt");
			//Tree
			SongPlayList songTree = new SongPlayList();
		
			//UI
			System.out.println("VIP: Please enter your name.");
			name = input.nextLine();

			System.out.println("Hi " + name);
			System.out.println("This program consist the fiscal quarter. Months of July  - Septemeber (17 weeks)");
			outFile.println("This program consist the fiscal quarter. Months of July  - Septemeber (17 weeks)");
			outFile.println();

			

			//for each string in the array of csv file, read it
			for(String s: fiscalQuarter){
				br = new BufferedReader(new FileReader(s));
				addTracks(br, songTree);

			}
			//traverse through tree and call toString()
			inOrderTraverseTree(songTree.getRoot(), outFile);



			


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
	songTree BST
	**process:** 
	Read in artist name and song name.
	**output:** 
	Create a song node and add it to the tree
	**/
	public static void addTracks(BufferedReader br, SongPlayList songTree) throws IOException{
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
			String streamCount = tokens[3];

			songTree.addSong(songName,streamCount,artistName);

			

			

			
		}

	}

	//Traverse Method that calls toString for each child in the Tree
	public static void inOrderTraverseTree(Song focusSong, PrintWriter outFile){
		if(focusSong !=null){
			inOrderTraverseTree(focusSong.leftChild,outFile);
			outFile.println(focusSong);
			inOrderTraverseTree(focusSong.rightChild,outFile);
		}
	}
}