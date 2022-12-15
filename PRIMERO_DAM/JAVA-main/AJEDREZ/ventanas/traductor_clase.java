package ventanas;
import java.util.ArrayList;
import java.util.HashMap;

public class traductor_clase {
	
	private HashMap<String,String> diccionario = new HashMap<String,String>();
	
	public traductor_clase(){
		diccionario.put("Valverde", "Gorfo");
		diccionario.put("Rafita", "macho iberico");
		diccionario.put("Javi", "sireno");
		diccionario.put("Josan", "gustozo");
	}

	public HashMap<String, String> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(HashMap<String, String> diccionario) {
		this.diccionario = diccionario;
	}
	
	
	
	

	

}
