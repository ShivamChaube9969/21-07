package net.shivam.javacodes.day5;

import java.util.Scanner;

class Person {
	private String name;
	private int age;
	String a;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	void behaviour() {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter required mood : ");
		String Mood = null;
		Mood = a.nextLine();
		if (Mood.equals("Upset") || Mood.equals("upset")) {
			System.out.println("I'm not good");
		}
		if (Mood.equals("Good") || Mood.equals("good")) {
			System.out.println("I'm good");
		}
	}
}

public  class ClassObjects {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("John");
		person1.setAge(45);
		System.out.println("I'm " + person1.getAge() + " years old" + " My name is " + person1.getName());
		person1.behaviour();
		
		Person person2 = new Person();
		person2.setAge(20);
		person2.setName("Steve");
		System.out.println("I'm " + person2.getAge() + " years old" + " My name is " + person2.getName());
		person2.behaviour();;
	}
}

