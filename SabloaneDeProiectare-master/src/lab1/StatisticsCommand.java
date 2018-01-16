package lab1;

public class StatisticsCommand implements Command {

		private DocumentStatVisitor dsv;
	    private DocumentManager dm;

	    @Override
	    public void execute() {
	        DocumentStatVisitor dsv = new DocumentStatVisitor();
	        Element book = DocumentManager.getInstance().getElement();
	        book.accept(dsv);
	        dsv.printStatic();
	        
	    }
	
}
