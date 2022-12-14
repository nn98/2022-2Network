package n201732009;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Exam4 {
	static Student readFromFile(String filePath)
			throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
			return (Student)in.readObject();
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Student student = readFromFile("c:/temp/exam3.dat");
		System.out.println(student);
		System.out.println("학번: "+student.getStudentNo());
		System.out.println("이름: "+student.getName());
	}

}
