package com.comit.course._02_.control;

public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 0;
		
		String name = switch(day) {
		case -1,0,1 -> "Monday";
		case 2 -> "Tuesday";
		default -> "in";
		};
		System.out.println(name);
	}

}
