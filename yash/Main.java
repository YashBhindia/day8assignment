package com.yash;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = new Animal[3];
		animals[0]=new Dog();
		animals[1]=new Cat();
		animals[2]=new Tiger();
		
		for(int i=0; i<animals.length; i++)
		{
		   animals[i].makeNoise();
		   animals[i].eat();
		   animals[i].walk();
		}
		
		
		
	}

}
