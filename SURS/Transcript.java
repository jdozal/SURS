package SURS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Transcript {
	HashMap<Integer, Courses> current = new HashMap<Integer, Courses>();
	HashSet<Courses> pastCourses = new HashSet<Courses>();

	public Transcript() {
	}

	public void createTranscript() {
		Scanner scr = new Scanner(System.in);
		boolean pass = false;
		System.out.println("\n - TRANSCRIPT -");
		if (pastCourses.isEmpty()) {
			System.out.println("Have you taken any courses before? (y/n)");
			String ans = scr.next();
			if (ans.equals("y")) {
				System.out.println("How many classes?");
				int ans2 = scr.nextInt();
				while (ans2 != 0) {
					System.out.println("\nClass " + ans2);
					scr = new Scanner(System.in);
					System.out.println("Enter name");
					String name = scr.nextLine();
					System.out.println("Passed? (y/n)");
					String grade = scr.next();
					if (grade.equals("y"))
						pass = true;
					if (grade.equals("n"))
						pass = false;
					Courses newCourse = new Courses(name, pass);
					pastCourses.add(newCourse);
					ans2--;
				}
			}

		}

	}

}
