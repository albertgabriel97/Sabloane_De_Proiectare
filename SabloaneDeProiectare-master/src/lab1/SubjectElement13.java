package lab1;

import java.util.List;
import java.util.ArrayList;

public abstract class SubjectElement13 implements Subject13, Element{
	
	private List<Observer13> observers = new ArrayList<>();
	
	public void attach(Observer13 obs) {
		observers.add(obs);
	}

	public void detach(Observer13 obs) {
		observers.remove(obs);
	}
	
	public void notify2() {
		observers.forEach(Observer13::update);
	}
	
	
	
}
