package ru.job4j.chap2;

public interface UserAction {
	
	int key();
	
	void execute(Input input, Tracker tracker);
	
	String info();
}