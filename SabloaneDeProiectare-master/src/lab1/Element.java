package lab1;

import java.io.IOException;

public interface Element {
	
	
	/*
	
	public String numeElement;
	
	public Element(){
		
	}
	public Element(String nume)
	{
		this.numeElement=nume;
	}
	
	abstract void print();
	
	public String toString() {
	       return numeElement;
	   }
	   */
	public String numeElement=null;
	
	
	
	
	
	public void add(Element e) throws Exception;
	public void remove(Element e) throws Exception;
	public Element getElement(int index) throws Exception;	

	public void accept(Visitor v);
	public void print();
	//public void delete();
	
	
	
	
	

}



