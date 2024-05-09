package reder_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] ch = new char[4];
		readCharNo = reader.read(ch,1,2);
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		reader.close();
	}
	
}

