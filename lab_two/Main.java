//Importing necessary package to use cetain features
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		//Path name to Spotify csv
		String path = "C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_two\\regional-global-daily-latest.csv";
		
		//try catch block. It throws neccesary error message if something goes wrong.
		try{
			//Print output to neccesary file
			PrintWriter outFile = new PrintWriter("C:\\Users\\Andy Chen\\Documents\\GitHub\\cisc_3130\\lab_two\\Artists-WeekOf09.03.2020.txt");
			//Obtaining input from file
			BufferedReader br = new BufferedReader(new FileReader(path));
			ArrayList<Artist> artistTrack = new ArrayList<Artist>();
			Artist artist;
			//nullString 
			String info = "";
			//READS FIREST LINE (HEADER)
			br.readLine();
			//Loop to go through the data
			while((info = br.readLine()) != null){
				info = info.replaceAll(", ", " ");
				info = info.replaceAll("\"", "");
				
				String[] tokens = info.split(",");
				
				//Find track position
				int trackPosition = Integer.parseInt(tokens[0]);
				//Find Song Artist
				String trackName = tokens[1];
				//Find track name
				String artistName = tokens[2];
				//Find # of time Stream
				int numStreamed = Integer.parseInt(tokens[3]);

				if(artistTrack.size() == 0){
					artist = new Artist(artistName, trackPosition, trackName,numStreamed);
					artistTrack.add(artist);
				}else{
					for(int i = 0; i < 1; i++){
						if(artistName.equals(artistTrack.get(i).getArtist())){
							artistTrack.get(i).addTrack(trackPosition, trackName,numStreamed);
						}else{
							artist = new Artist(artistName,trackPosition, trackName,numStreamed);
							artistTrack.add(artist);
						}
					}
				}

				

				
				

			}System.out.println(artistTrack.get(0));

			
			
			
		//Throw error if any
		}catch(FileNotFoundException e){
			System.err.println("This file does not exist");
		}catch(IOException e){
			System.err.println("There is an IOException");
		}
		


	}
}