package com.irinaserova;



import java.util.Random;

class person{
	int age;
	String name;

	public void speak() {
		System.out.print(" Problems");
	}

	public void sayHello() {
		System.out.print(" This code aint 1.");
	}

	public int retirementAge() {
		int retirementAge = 65;
		int yearsUntilRetirement = retirementAge - this.age;
		return yearsUntilRetirement;
	}

	public void skills(String skill1, String skill2) {
		System.out.println("These are my skills: " + skill1 + " & "+ skill2);
	}
}

public class ClassesObjects {
	public static void main(String[] args) {
		person person1 = new person();
		person1.age = 18;
		person1.name = "Jupiter";
		System.out.print(person1.age);
		person1.speak();
		person1.sayHello();
		Random r = new Random();
		System.out.println();
		System.out.println(r.nextInt(10));
		System.out.printf("Years until retirement is: %d", person1.retirementAge());
		System.out.println();
		person1.skills("archery", "chess");
	}
}
