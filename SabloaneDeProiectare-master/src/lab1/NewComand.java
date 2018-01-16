package lab1;

public class NewComand  implements Command {
	


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		//Carte c = new Carte("C1",new Cuprins());
		
		Sectiune book = new Sectiune("S1");
		book.elemente.add(new Paragraf("P1"));
		book.elemente.add(new Paragraf("P2"));
		
		DocumentManager.getInstance().setElement(book);
		
	}
	
	
	

}
