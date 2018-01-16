package lab1;

public class Tabel extends AbstractElement{
	
public String numeTabel;
	
	public Tabel(){}
	public Tabel(String continut) 
	{
		this.numeTabel=continut;
	}
	
	public void print() {
		System.out.println("Tabel: "+this.numeTabel);	
	}
	
	
	
	

	public String getNume() {
		return numeTabel;
	}

	public void setNume(String nume) {
		this.numeTabel = nume;
	}

	

	public void accept(Visitor v) {
		v.visitTabel(this);
	}
	
	
	/*
	public void show(){
		System.out.print("Tabel");
	}

	
	public void addElement(Element e) {
		// TODO Auto-generated method stub
		
	}

	public void removeElement(Element e) {
		// TODO Auto-generated method stub
		
	}

	public int getElements() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	
	

}




	


