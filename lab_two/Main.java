import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("input.txt");
		Scanner input = new Scanner(file);
		int col = 4; 
		int rows = 10; 
		String[][] myList = new String[rows][col];

		while(input.hasNext()){
			String info = input.nextLine();
			String tokens = info.split(", ")
			//Find Song Name
			String trackName = tokens[0];
			//Find Song Artist
			String artistName = tokens[1];
			//Find # of time Stream
			int numStreamed = tokens[2];

			myList[0][0]

		}


	}
}