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
		input.append(c);
		
		if(result.isExists(c)) {
			return result.getIndexes(c);
		}
		
		if(!log.isExists(c)){
			log.append(c);
			attempt.incrase();
		}
		
		return null;
	}
	
	public Attempt getAttempt(){
		return attempt;
	}
	
}
