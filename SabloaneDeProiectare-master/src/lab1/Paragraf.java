package lab1;

public class Paragraf extends AbstractElement{
	
public String continut;

	
	public Paragraf(){}
	public Paragraf(String continut) 
	{
		this.continut=continut;
		
	}
	
	public void print() {
		System.out.println("Paragraf: "+this.continut);	
	}
	

	public String getText() {
		return continut;
	}

	public void setText(String text) {
		this.continut = text;
	}
	

	public void accept(Visitor v) {
		v.visitParagraf(this);
	}

	
	/*
	@Override
	public void addElement(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeElement(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getElements() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	
	public void addText(String text){
		this.continut=text;
	}
	
	public void show(){
		System.out.println("Paragraf");
	}

	public void addElement(Element e){}		
	public void removeElement(Element e) {}
	public int getElements() { return 0;}
	
	*/

}




	

	

	


