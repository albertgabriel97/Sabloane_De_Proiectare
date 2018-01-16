package lab1;

public class DocumentManager {
	
	 private static DocumentManager instance = null;
	 private Element doc;
	 
	 private DocumentManager() {}
	   
	   public static DocumentManager getInstance() 
	   {
	      if(instance == null)
	      {
	         instance = new DocumentManager();
	      }
	      return instance;
	   }
	   
	   
				
		public Element getElement() 
		{
			return doc;
		}

		public void setElement(Element doc) 
		{
			this.doc = doc;
		}
	   
	   
	   
}
