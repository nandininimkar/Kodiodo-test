package com.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setName("nandini");
		s1.setMarks(78.90f);
		
		Student s2 = new Student();
		s2.setRollno(102);
		s2.setName("pooja");
		s2.setMarks(73.90f);
		
		Student s3 = new Student();
		s3.setRollno(103);
		s3.setName("shruti");
		s3.setMarks(78.7f);
	
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student st: list) {
			System.out.println(st);
		}
	}
}

