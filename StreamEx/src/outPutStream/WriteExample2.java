package outPutStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] date = "ABC".getBytes();
		os.write(date);
		os.flush();
		os.close();
	}
}
