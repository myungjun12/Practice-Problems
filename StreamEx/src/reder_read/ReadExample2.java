package reder_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] ch = new char[2];
		String data = "";
		while((readCharNo = reader.read(ch))!=-1) {
			data += new String(ch,0,readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}

