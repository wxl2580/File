package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy_world {
	public static void main(String[] args) throws Exception {
		
		//源文件
		File f1= new File("D:\\old.png");
		//目标文件
		File f2 = new File("G:\\new.png");
		
		InputStream f1_du = new FileInputStream(f1);
	
		OutputStream  f2_xie= new FileOutputStream(f2);
		
		byte[] b = new byte[(int)f1.length()];
		f1_du.read(b);
		
		
		
		
		f2_xie.write(b);
		f1_du.close();
		f2_xie.close();
	}
}
