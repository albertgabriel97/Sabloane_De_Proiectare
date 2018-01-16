package lab1;



public class ImageProxy  extends AbstractElement {

	private String continut;
	private Imagine imag_proxy = null;

	
	ImageProxy(String filename) {
		this.continut = filename;
	}

	public void print() {
		if(imag_proxy == null)
		{
			imag_proxy = new Imagine(continut); 
		}
		//System.out.println("Imagine :"+this.continut);
		imag_proxy.print();
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}	
	
}
