package First_Package;

import java.util.Scanner;

public class Person_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Scanner s=new Scanner(System.in);
		String Name, City;
		int Age;
		System.out.print("Enter Person Name :  ");
		Name=s.next();
		System.out.print("Enter Person Age : ");
		Age=s.nextInt();
		System.out.print("Enter Person City : ");
		City=s.next();
		
		p.setPersonName(Name);
		p.setPersonAge(Age);
		p.setPersonCity(City);
		System.out.println("\n__________PERSON INFORMATION__________\n");
		System.out.println("Person Name : "+p.getPersonName());
		System.out.println("Person Age : "+p.getPersonAge());
		System.out.println("Person Name : "+p.getPersonCity());
		
		System.out.println("\n____________PERSON DETAILS____________\n");
		System.out.print("Enter Person Name : ");
		Name=s.next();
		System.out.print("Enter Person Age : ");
		Age=s.nextInt();
		System.out.print("Enter Person City : ");
		City=s.next();
		
		p=new Person(Name, Age, City);
		{
			System.out.println("Person Name : "+p.getPersonName());
			System.out.println("Person Age : "+p.getPersonAge());
			System.out.println("Person City : "+p.getPersonCity());
			s.close();
		}
		

	}

}
