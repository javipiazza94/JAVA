
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	static void unificarFicheros(String catalogo) throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter(catalogo));
		for (int i = 1; i < 7; i++) {
			String num=Integer.toString(i);
			if (num.length()<2) {
				num="0"+num;
			}
			String FileName="C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Tienda Apple\\src\\"+num+".txt";
			File file=new File(FileName);
			if(file.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while((line=br.readLine())!=null) {
					bw.write(line);
					bw.newLine();
				}
			br.close();
			}
		}
		bw.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String Ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Tienda Apple\\src\\";
		
		//CREAMOS ARRAYLISTS
		ArrayList<iPAD> modelo = new ArrayList <iPAD>();
		ArrayList<MAC> modeloMAC = new ArrayList <MAC>();
		ArrayList<iPhone> modeloiPhone = new ArrayList <iPhone>();
		ArrayList<iWatch> modeloiWatch = new ArrayList <iWatch>();
		ArrayList<airPods> modeloairPods = new ArrayList <airPods>();
		ArrayList<Accesorios> accesorios = new ArrayList <Accesorios>();
		
		//INICIALIZAMOS OBJETOS
		iPAD ipad1 = new iPAD( );
		ipad1.setCantidad(23);
		ipad1.setPrecio(1345);
		ipad1.setId("IPAD_1");
		ipad1.addId("ACCESORIOS_1");
		ipad1.addId("AIRPOD_1");
		ipad1.addId("IWATCH_1");
		
		iPAD ipad2 = new iPAD();
		ipad2.setCantidad(355);
		ipad2.setPrecio(1000);
		ipad2.setId("IPAD_2");
		ipad2.addId("ACCESORIOS_2");
		ipad2.addId("AIRPOD_1");
		ipad2.addId("IWATCH_2");
		
		iPAD ipad3 = new iPAD();
		ipad3.setCantidad(3455);
		ipad3.setPrecio(1500);
		ipad3.setId("IPAD_3");
		ipad3.addId("ACCESORIOS_1");
		ipad3.addId("AIRPOD_2");
		ipad3.addId("IWATCH_2");
		
		MAC Mac1 = new MAC();
		Mac1.setCantidad(234);
		Mac1.setPrecio(1500);
		Mac1.setId("MAC_1");
		Mac1.addId("ACCESORIOS_1");
		Mac1.addId("AIRPOD_2");
		Mac1.addId("IWATCH_2");
		
		MAC Mac2 = new MAC();
		Mac2.setCantidad(34);
		Mac2.setPrecio(3000);
		Mac2.setId("MAC_2");
		Mac2.addId("ACCESORIOS_2");
		Mac2.addId("AIRPOD_2");
		Mac2.addId("IWATCH_2");
		
		iPhone ip1 = new iPhone();
		ip1.setCantidad(74858);
		ip1.setPrecio(800);
		ip1.setId("IPHONE_1");
		ip1.addId("ACCESORIOS_1");
		ip1.addId("AIRPOD_1");
		ip1.addId("IWATCH_1");
		
		iPhone ip2 = new iPhone();
		ip2.setCantidad(748);
		ip2.setPrecio(900);
		ip2.setId("IPHONE_2");
		ip2.addId("ACCESORIOS_2");
		ip2.addId("AIRPOD_2");
		ip2.addId("IWATCH_2");
		
		iPhone ip3 = new iPhone();
		ip3.setCantidad(8);
		ip3.setPrecio(1500);
		ip3.setId("IPHONE_3");
		ip3.addId("ACCESORIOS_2");
		ip3.addId("AIRPOD_2");
		ip3.addId("IWATCH_2");
		
		iWatch iw1 = new iWatch ();
		iw1.setCantidad(47457);
		iw1.setPrecio(648);
		iw1.setId("IWATCH_1");
		iw1.addId("IPHONE_1");
		iw1.addId("IPAD_1");
		
		iWatch iw2 = new iWatch ();
		iw2.setCantidad(4737);
		iw2.setPrecio(750);
		iw2.setId("IWATCH_2");
		iw2.addId("IPAD_2");
		iw2.addId("IPAD_3");
		iw2.addId("MAC_1");
		iw2.addId("MAC_2");
		iw2.addId("IPHONE_3");
		iw2.addId("IPHONE_3");
		
		airPods ai1 = new airPods();
		ai1.setCantidad(123);
		ai1.setPrecio(987);
		ai1.setId("AIRPOD_1");
		ai1.addId("IPAD_1");
		ai1.addId("IPAD_2");
		ai1.addId("IPHONE_1");
		
		airPods ai2 = new airPods();
		ai2.setCantidad(356);
		ai2.setPrecio(886);
		ai2.setId("AIRPOD_2");
		ai2.addId("IPAD_");
		ai2.addId("MAC_1");
		ai2.addId("MAC_2");
		ai2.addId("IPHONE_2");
		ai2.addId("IPHONE_2");
		
		Accesorios ac1 = new Accesorios();
		ac1.setCantidad(13);
		ac1.setPrecio(59);
		ac1.setId("ACCESORIOS_1");
		ac1.addId("IPAD_1");
		ac1.addId("IPAD_3");
		ac1.addId("MAC_1");
		ac1.addId("IPHONE_1");
		
		Accesorios ac2 = new Accesorios();
		ac2.setCantidad(36);
		ac2.setPrecio(19);
		ac2.setId("ACCESORIOS_2");
		ac2.addId("IPAD_2");
		ac2.addId("MAC_2");
		ac2.addId("IPHONE_2");
		ac2.addId("IPHONE_3");
		
		//METEMOS OBJETOS EN ARRAYLIST
		modelo.add(ipad2);
		modelo.add(ipad1);
		modelo.add(ipad3);	
		modeloMAC.add(Mac1);
		modeloMAC.add(Mac2);
		modeloiPhone.add(ip1);
		modeloiPhone.add(ip2);
		modeloiPhone.add(ip3);
		modeloiWatch.add(iw1);
		modeloiWatch.add(iw2);
		modeloairPods.add(ai1);
		modeloairPods.add(ai2);
		accesorios.add(ac1);
		accesorios.add(ac2);
				 	
		//LOS ESCRIBIMOS EN TXT
		iPAD.CrearInforme(Ruta, modelo);
		MAC.CrearInforme(Ruta, modeloMAC);
		iPhone.CrearInforme(Ruta, modeloiPhone);
		iWatch.CrearInforme(Ruta, modeloiWatch);
		airPods.CrearInforme(Ruta, modeloairPods);
		Accesorios.CrearInforme(Ruta, accesorios);
	
		//UNIFICAMOS FICHEROS EN UN UNICO CATALOGO
		String catalogo =  "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Tienda Apple\\src\\Catalogo.txt";
		Main.unificarFicheros(catalogo);
		
		//LEEMOS EL CATALOGO
		BufferedReader br = new BufferedReader(new FileReader(catalogo));
		String linea;
		while((linea=br.readLine())!=null) {
			System.out.println(linea);
			String[] values = linea.split(",");
			 for (int i = 0; i<values.length; i++) {
				 
			 }
			
		}
		
			
}}
