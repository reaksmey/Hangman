package com.sabayrean.hangman;

import java.util.List;

public class Guess {
	private TextResult result = null;
	private TextInput input = new TextInput();
	private TextInput log = new TextInput();
	private Attempt attempt = new Attempt();
	
	public Guess(TextResult result){
		this.result = result;
	}
	
	public List<Integer> getIndexes(char c){
		return result.getIndexes(c);
	}
	
	public boolean isExists(char c){
		input.append(c);
		//TODO refactoring
		if(this.log.isExists(c)){
			log.append(c);
		} else {
			if(this.result.isExists(c)){
				return true;
			} else {
				this.attempt.incrase();
			}
		}
		return false;
	}
	
}
