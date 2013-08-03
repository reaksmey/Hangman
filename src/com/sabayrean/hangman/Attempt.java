package com.sabayrean.hangman;

public class Attempt {
	
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
