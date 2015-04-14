package assignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	private FileReader file;
	private BufferedReader buffer;


	Reader(String fileLocation) throws FileNotFoundException{
		file = new FileReader(fileLocation);
		buffer = new BufferedReader(file);
	}

	/**
	 * 
	 * @return the next line on the buffer
	 * @throws IOException
	 */
	public String readLine() throws IOException{
		return buffer.readLine();
	}
	
	/**
	 * @param line - String read 
	 * @return empty String array if string is not valid, if valid return two words
	 */
	public ArrayList<String> parseLine(String line){
		return null;
	}
}