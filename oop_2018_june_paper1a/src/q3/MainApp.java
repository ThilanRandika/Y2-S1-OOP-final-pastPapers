package q3;

public class MainApp {

	public static void main(String[] args) throws MarksException {
		Student s1 = new Student(1, "Nimal");
		
		s1.input();
		
		System.out.println("Average marks = " + s1.getAverage());
	}

}
