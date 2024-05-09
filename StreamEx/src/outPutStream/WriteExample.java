package outPutStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] date = "ABC".getBytes();
		for(int i = 0; i < date.length; i++) {
			os.write(date[i]);
		}
		os.flush();
		os.close();
	}
}
