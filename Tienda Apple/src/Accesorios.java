import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Accesorios extends Producto{
	static public void CrearInforme(String Ruta, ArrayList <Accesorios> lista) throws IOException {
		File archivo = new File(Ruta, "01.txt");
		archivo.createNewFile();
		FileWriter fw = new FileWriter(archivo);
		PrintWriter escritura = new PrintWriter(fw);
		 for(int i=0;i<lista.size();i++){
		        escritura.println(lista.get(i).toString());
		        escritura.flush();

		    }
		    escritura.close();
	}
	

	
}
