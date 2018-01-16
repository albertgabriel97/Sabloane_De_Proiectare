package lab1;

public class TestLab {
	
	public static void main(String[] args) {

		Carte c = new Carte("Vand Km",new Cuprins());
				
		Sectiune a = new Sectiune("Sectiunea 1");
		a.elemente.add(new Imagine("	Image_nature"));
		a.elemente.add(new Paragraf("	Ana are mere, mere dulci si foarte ... "));
		a.elemente.add(new Tabel("		Table_1"));
		c.getCapitole().add(a);
		
		
		Sectiune b = new Sectiune("Sectiunea 2");
		b.elemente.add(new Paragraf("	Un motor in patru timpi este ..."));
		b.elemente.add(new Imagine("	Image_engine"));
		b.elemente.add(new Tabel("		Tabel_Cifre"));
		b.elemente.add(new Imagine("	Image_fire"));
		b.elemente.add(new ImageProxy("	Image_fire_2"));
		c.getCapitole().add(b);
		
		c.printCarte();
		
		DocumentStatVisitor dsv = new DocumentStatVisitor();
		c.visit(dsv);
		dsv.printStatic();
		
		////////////////
		/*
		
		
		
		Builder b1 = new JSONBuiler("book.json");
        Element book;
        
        b1.buildPart();
        book = b1.getResult();   
        book.print();
        */
		/*
        Command open = new OpenCommand();
        open.execute();
        Command statistics = new StatisticsCommand();
        statistics.execute();
        */
		System.out.print("\n\n");
		
		Command com = new NewComand();
		com.execute();
		
		Element book = DocumentManager.getInstance().getElement();
		book.print();
		
		///////delete
		Command delCmd = new DeleteCommand();
		delCmd.execute();
		book = DocumentManager.getInstance().getElement();
		book.print();
		
		
		
		
}
	


}
