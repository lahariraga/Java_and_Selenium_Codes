package sample1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoNotepad {

	public static void main(String[] args) throws IOException {
	
	FileWriter w = new FileWriter("C:\\Users\\91801\\Desktop\\EmptyFileToWriteData.txt");
	BufferedWriter b = new BufferedWriter(w);
	b.write("This is Raga");
	b.close();
	

	}

}
