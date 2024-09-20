package com.user;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = s.nextInt();
		System.out.println("Enter weight:");
		int weight = s.nextInt();
		if(age>=21&& age<=60) {
			
			if(weight>=40 && weight<=70) {
				System.out.println("Yor are eligible for donor");
			}else {
				System.out.println("Invali weight");
			}
		}else {
			System.out.println("Invalid age");
		}
	}

}
