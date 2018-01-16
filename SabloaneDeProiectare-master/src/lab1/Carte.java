package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Carte {
	
	String titluCarte;
	ArrayList<Autor> autor;
	Cuprins cuprins;
	//Capitole listaCap;
	ArrayList<Element> capitole;
	
	private static Scanner input;
	
	
	
	public Carte(){
		this.titluCarte = "";
		this.autor = new ArrayList<Autor>();
		this.capitole = new ArrayList<Element>();
	}
	/*
	public Carte(String a,ArrayList<Autor> listaAutori,Cuprins c)
	{
		this.titluCarte=a;
		this.autor=listaAutori;
		this.cuprins=c;	
	}
	public Carte(String a,ArrayList<Autor> listaAutori,Cuprins c,Capitole d)
	{
		this.titluCarte=a;
		this.autor=listaAutori;
		this.cuprins=c;	
		this.listaCap=d;
	}
	*/
	
	public Carte(String titlu,Cuprins cuprins){
		this.titluCarte = titlu;
		this.autor = new ArrayList<Autor>();
		this.capitole = new ArrayList<Element>();
		this.cuprins = cuprins;
	}
	
	/*
	public String toString() {
	       return "Titlu: "+titluCarte+", Autori:"+autor+", "+cuprins+", \nCapitole: "+listaCap+"\n";
	   }
	*/
	
	public String toString() {
	       return "Titlu: "+titluCarte+"\n";
	   }
	
	public void printCarte(){
		System.out.println("Titlu: "+titluCarte+"\n");
		for(Element e : this.capitole){
			e.print();
		}
	}
	
	
	public String getTitlu() {
		return titluCarte;
	}

	public void setTitlu(String titlu) {
		this.titluCarte = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autor;
	}

	public void setAutori(ArrayList<Autor> autor) {
		this.autor = autor;
	}

	public ArrayList<Element> getCapitole() {
		return capitole;
	}

	public void setCapitole(ArrayList<Element> capitole) {
		this.capitole = capitole;
	}

	public Cuprins getCuprins() {
		return cuprins;
	}

	public void setCuprins(Cuprins cuprins) {
		this.cuprins = cuprins;
	}

	public void visit(Visitor dsv) {
		for(Element elem: this.capitole) {
			elem.accept(dsv);
		}
		
	}
	
	
	
//////////////
	
	
	/*
	public static void main(String [] args) throws IOException
	{
		
		
	
		
		input = new Scanner(System.in);
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		//ArrayList listaAutori = new ArrayList();
		ArrayList<Autor> listaAutori = new ArrayList<Autor>();
		
		System.out.print("Enter the name of book: ");
		String titluCarte = buf.readLine();
		System.out.print("Enter the number of authors: ");
		int numarAutori = input.nextInt();
		String autorul = "";
		for(int i=0;i<numarAutori;i++)
		{
			System.out.print("Name: ");
			autorul = buf.readLine();
			listaAutori.add(new Autor(autorul));
		}
		Cuprins cuprins= new Cuprins("Cuprins_"+titluCarte);
		 System.out.print("\n");
		
		/////////////////////
		ArrayList<Subcapitole> listaSubcap = new ArrayList<Subcapitole>();
		listaSubcap.add(new Subcapitole("Imag"));
		listaSubcap.add(new Subcapitole("Paragraf"));
		listaSubcap.add(new Subcapitole("Paragraf"));
		listaSubcap.add(new Subcapitole("Imag"));
		listaSubcap.add(new Subcapitole("Tabel"));
		listaSubcap.add(new Subcapitole("Paragraf"));
		 
		Capitole cap=new Capitole("Cap1",listaSubcap);
		
		Carte carte= new Carte(titluCarte,listaAutori,cuprins,cap);
        System.out.print(carte);
        
		
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
}
