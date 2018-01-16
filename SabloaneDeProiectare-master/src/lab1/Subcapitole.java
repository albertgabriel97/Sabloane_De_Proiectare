/*
package lab1;

import java.io.IOException;
import java.util.ArrayList;

public class Subcapitole {

	String numeSubcap;
	ArrayList<Element> elemente = new ArrayList<Element>();
	
	public Subcapitole(){}
	public Subcapitole(String tip)
	{
		this.numeSubcap=tip;
	}
	
	 public String toString() {
	       return numeSubcap;
	   }
	 
	 void print(){
		 for(int i=0;i<elemente.size();i++)
		 {
			 System.out.println(numeSubcap + " " + elemente.get(i));
		 }
	 }
	 
	 public void addElement(Element e)
	 {
		 elemente.add(e);
	 }
	 
	 public String getNume()
	 {
		 return numeSubcap;
	 }
	 
	 public static void main(String [] args) throws IOException{
		 
		 
		 Subcapitole subcap = new Subcapitole("Subcap1");
		 
		 Imagine imag = new Imagine(subcap.getNume(),"Imagine","asdasdasdasdasd");
		 Tabel tabel = new Tabel(subcap.getNume(),"Tabel","lllllllllllllllllllllllllllllllllllllll");
		 
		 subcap.addElement(imag);
		 subcap.addElement(tabel);
		 
		 subcap.print();
		 
		// System.out.println(subcap);
	 }
	
}
*/