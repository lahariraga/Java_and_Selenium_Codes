package sample1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingSingleLineFromNotepad {

	public static void main(String[] args) throws IOException {
	FileReader f = new FileReader("C:\\Users\\91801\\Desktop\\TestingNotepadFile.txt");
	BufferedReader b = new BufferedReader(f);
	System.out.println(b.readLine());
	
	

	}

}