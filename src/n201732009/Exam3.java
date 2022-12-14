package n201732009;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Exam3 {
	static void writeToFile(Student student, String filePath)
			throws FileNotFoundException, IOException
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
			out.writeObject(student);
		}
	}
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Student p1 = new Student("201732009", "±Ë¿±º≠");
		writeToFile(p1, "c:/temp/exam3.dat");
	}
}