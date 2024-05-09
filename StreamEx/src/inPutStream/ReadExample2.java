package inPutStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args)throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;	//읽은 바이트 수 저장
		byte[] readBytes = new byte[3];
//		while((readByteNo = is.read(readBytes))!=-1) {
//			System.out.println(readByteNo);
//		}
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
			
		}
		System.out.println(data);
		is.close();
	}
}
