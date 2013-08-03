package com.sabayrean.hangman;

public class RandomString {
	private static RandomString instance = null;
	private String[] dictionaries = {"word1", "word2"};
	
	public static RandomString getInstance(){
		return instance == null ? new RandomString() : instance;
	}
	
	public String getWord(){
		int index = (int) Math.random() * dictionaries.length;
		return dictionaries[index];
	}

}
