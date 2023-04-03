package sample1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotepadReading {

	public static void main(String[] args) throws IOException {
		//Creating FileReader obj
		FileReader f = new FileReader("C:\\Users\\91801\\Desktop\\TestingNotepadFile.txt");
		
          //Open the Notepad by using BufferedReader obj
		BufferedReader b = new BufferedReader(f);
		String s;
		while((s=b.readLine())!=null) {
			System.out.println(s);
		}
		
		
	}

}
