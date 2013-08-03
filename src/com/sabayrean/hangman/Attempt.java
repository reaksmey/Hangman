package com.sabayrean.hangman;

public class Attempt {
	
	public static int MAXIMUM = 5;
	private int count = 0;
	private String image = "";
	
	public String getImage(){
		return this.image;
	}
	
	public int count(){
		return count;
	}
	
	public void incrase(){
		count++;
		image = "Image" + String.valueOf(count);
	}

}
