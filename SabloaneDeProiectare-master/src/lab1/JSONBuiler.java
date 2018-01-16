package lab1;

import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuiler implements Builder {

	 private final String filename;
	    private Element document;
	    
	    public JSONBuiler(String filename){
	        this.filename = filename;
	    }
	    
	    @Override
	    public void buildPart() {
	        ObjectMapper jsonMp = new ObjectMapper();
	        HashMap<String, Object> hm = new HashMap<>();
	       // try {
	            hm = jsonMp.readValue(new File(filename), HashMap.class);
	    Object ex = null;
				//    } catch (IOException ex) {
	            Logger.getLogger(JSONBuiler.class.getName()).log(Level.SEVERE, null, ex);
	      //  }
	        
	        document = buildDoc(hm);
	    }

	    @Override
	    public Element getResult() {
	        return document;
	    }
	    
	    private Element buildDoc(HashMap<String, Object> hm){
	        Element result = null;
	        
	        if(hm.get("class").equals("Paragraph")){
	            result = buildParagraf(hm);
	        }else if(hm.get("class").equals("Tabel")){
	            result = buildTabel(hm);
	        }else if(hm.get("class").equals("Image") || hm.get("class").equals("ImageProxy")){
	            result = buildImagine(hm);
	        }else if(hm.get("class").equals("Section")){
	            result = buildSectiune(hm);
	        }else{
	            System.out.println("Object type not accepted !!!");
	        }
	        return result;
	    }
	    
	    private Element buildSectiune(HashMap<String, Object> hm){
	       System.out.println("Sunt Sectiune");
	       return new Sectiune(filename);
	    }

	    private Element buildParagraf(HashMap<String, Object> hm) {
	        System.out.println("Sunt Paragraf");
	        return new Paragraf(filename);
	    }
	    
	    private Element buildImagine(HashMap<String, Object> hm) {
	        System.out.println("Sunt Imagine");
	        return new ImageProxy(filename);
	    }
	    
	    private Element buildTabel(HashMap<String, Object> hm) {
	        System.out.println("Sunt Tabel");
	        return new Tabel(filename);
	    } 
	
}
