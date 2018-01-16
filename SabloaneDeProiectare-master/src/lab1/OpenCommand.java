package lab1;

public class OpenCommand implements Command {

	public void execute() {
        Builder builder = new JSONBuiler("book.json");
        builder.buildPart();
        Element book = builder.getResult();
        DocumentManager.getInstance();
    }
	
	

}
