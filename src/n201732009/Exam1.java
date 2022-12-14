package n201732009;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
public class Exam1{
	public static void main(String[] args) throws IOException {
		 OutputStream out = new FileOutputStream("c:/temp/exam1.txt");
		 OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
		 writer.write("201732009\n");
		 writer.write("±Ë¿±º≠");
		 writer.close();

	}
}