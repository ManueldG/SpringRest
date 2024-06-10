package it.mdg.apiRest;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CategoryController {
	
	@RequestMapping(value="/prova/{id}", method = RequestMethod.GET)

	public HashMap <String,String> prova(@PathVariable("id") String id){
		
		HashMap<String, String> hmResult = new HashMap<String, String>();

		if( id.equalsIgnoreCase("M") ) {
		
			hmResult.put("Key1", "Buongiorno Mario");
			hmResult.put("Key2", "Buongiorno Gianni");
			
		}
		else if( id.equalsIgnoreCase("F")){
			
			hmResult.put("Key1", "Buongiorno Maria");
			hmResult.put("Key2", "Buongiorno Gianna");		
			
		}
		else {
			
			hmResult.put("1", "json");
			hmResult.put("Key2", "json");		
			
		}
		
		return hmResult;
	}
	
	

}


