package outPutStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] date = "ABC".getBytes();
		os.write(date,1,2);
		os.flush();
		os.close();
	}
}
