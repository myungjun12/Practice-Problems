package inPutStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main (String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
//		while((readByte=is.read())!=-1) {
//			System.out.println((char)readByte);
//		}
		while(true) {
			readByte = is.read();
			if(readByte==-1)break;
			System.out.println(readByte);
		}
		is.close();
	}
	
}
