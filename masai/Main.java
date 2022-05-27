package com.masai;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot k1 = (Parrot)b1;
		k1.sing();
	}

}
