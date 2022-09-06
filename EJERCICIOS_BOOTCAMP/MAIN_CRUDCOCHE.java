package EJERCICIOS_BOOTCAMP;

public class MAIN_CRUDCOCHE {

	public static void main(String[] args) {

		CocheCRUDImp cocheCrud = new CocheCRUDImp();
		
		cocheCrud.delete();
	
		cocheCrud.findAll();
		
		cocheCrud.save();
		
		

	}

}
