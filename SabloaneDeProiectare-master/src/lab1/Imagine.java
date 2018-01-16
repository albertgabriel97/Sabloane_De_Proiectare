package lab1;

public class Imagine extends AbstractElement {

	
	public String continut;
	
	
	public Imagine(){}
	public Imagine(String continut) 
	{
		this.continut=continut;
		
	}
	
	public String toString() {
	       return continut;
	   }	
	
	public void print() {
		System.out.println("Imagine :"+this.continut);
	}
	
	
	public String getNume() {
		return continut;
	}

	public void setNume(String nume) {
		this.continut = nume;
	}


	public void accept(Visitor v) {
		v.visitImage(this);
	}

	
	
	
	
	
}




	
	


