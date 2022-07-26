package Day5;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class userException {

	@Getter
	@Setter
	static public class Student extends RuntimeException{
		private int age;
		public Student(int age) {
			try {
				if (age<0) {
					String msg = "Student age must be greater than 0.";
					leesException leeX = new leesException(msg);
					throw leeX;
				}
			}
			catch(leesException e) {
				e.printStackTrace();
			}
			this.age=age;
		}
		public void display() {
			System.out.println("The student's age is:"+this.age);
		}
}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter student's age:");
		
		int stuAge = input.nextInt();
		Student s1 = new Student(stuAge);
		s1.display();
		
		
	}

}

