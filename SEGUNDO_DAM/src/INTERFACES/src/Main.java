package INTERFACES.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static void unificarFicheros(String catalogo) throws IOException {

		
		BufferedWriter bw = new BufferedWriter(new FileWriter(catalogo));
		for (int i = 1; i < 7; i++) {
			String num = Integer.toString(i);
			if (num.length() < 2) {
				num = "0" + num;
			}
			String FileName = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\INTERFACES\\src\\"
					+ num + ".txt";
			File file = new File(FileName);
			if (file.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null) {
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

		String Ruta = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\INTERFACES\\src\\";

		// CREAMOS ARRAYLISTS
		ArrayList<iPAD> modelo = new ArrayList<iPAD>();
		ArrayList<MAC> modeloMAC = new ArrayList<MAC>();
		ArrayList<iPhone> modeloiPhone = new ArrayList<iPhone>();
		ArrayList<iWatch> modeloiWatch = new ArrayList<iWatch>();
		ArrayList<airPods> modeloairPods = new ArrayList<airPods>();
		ArrayList<Accesorios> accesorios = new ArrayList<Accesorios>();

		// INICIALIZAMOS OBJETOS
		iPAD ipad1 = new iPAD();
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

		iWatch iw1 = new iWatch();
		iw1.setCantidad(47457);
		iw1.setPrecio(648);
		iw1.setId("IWATCH_1");
		iw1.addId("IPHONE_1");
		iw1.addId("IPAD_1");

		iWatch iw2 = new iWatch();
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

		// METEMOS OBJETOS EN ARRAYLIST
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

		// LOS ESCRIBIMOS EN TXT
		iPAD.CrearInforme(Ruta, modelo);
		MAC.CrearInforme(Ruta, modeloMAC);
		iPhone.CrearInforme(Ruta, modeloiPhone);
		iWatch.CrearInforme(Ruta, modeloiWatch);
		airPods.CrearInforme(Ruta, modeloairPods);
		Accesorios.CrearInforme(Ruta, accesorios);

		// UNIFICAMOS FICHEROS EN UN UNICO CATALOGO
		String catalogo = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\INTERFACES\\src\\Catalogo.txt";
		Main.unificarFicheros(catalogo);

		// CREAMOS LA CESTA
		File archivo = new File(Ruta, "Cesta.txt");
		archivo.createNewFile();
		FileWriter fw = new FileWriter(archivo);
		PrintWriter escritura = new PrintWriter(fw);

		// LEEMOS EL CATALOGO E IMPRIMIMOS LOS PRODUCTOS SELECCIONADOS POR ESCANER EN LA CESTA
		BufferedReader br = new BufferedReader(new FileReader(catalogo));
		String linea;
		Scanner sc = new Scanner(System.in);
		double preciototal = 0;
		System.out.println("BIENVENIDOS A LA TIENDA APPLE");
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
			System.out.println();
			String[] values = linea.split(",");
			String impresion = "";
			for (int i = 0; i < values.length; i++) {
				System.out.println("Introduce la cantidad que quieres comprar de cada producto:");
				int cantidad = sc.nextInt();

				if (values[i].contains("IPAD_1")) {
					iPAD ipadCatalogo1 = ipad1;
					ipadCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + ipadCatalogo1.PrecioTotal(cantidad));
					preciototal += ipadCatalogo1.PrecioTotal(cantidad);
					if (ipadCatalogo1.getCantidad() > 0) {
						impresion += ipadCatalogo1.toString();
						escritura.write(impresion);
						escritura.flush();
					}
				}
				if (values[i].contains("IPAD_2")) {
					iPAD ipadCatalogo2 = ipad2;
					ipadCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + ipadCatalogo2.PrecioTotal(cantidad));
					preciototal += ipadCatalogo2.PrecioTotal(cantidad);
					if (ipadCatalogo2.getCantidad() > 0) {
						escritura.write(ipadCatalogo2.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IPAD_3")) {
					iPAD ipadCatalogo3 = ipad3;
					ipadCatalogo3.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + ipadCatalogo3.PrecioTotal(cantidad));
					preciototal += ipadCatalogo3.PrecioTotal(cantidad);
					if (ipadCatalogo3.getCantidad() > 0) {
						escritura.write(ipadCatalogo3.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IPHONE_1")) {
					iPhone iphoneCatalogo1 = ip1;
					iphoneCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + iphoneCatalogo1.PrecioTotal(cantidad));
					preciototal += iphoneCatalogo1.PrecioTotal(cantidad);
					if (iphoneCatalogo1.getCantidad() > 0) {
						escritura.write(iphoneCatalogo1.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IPHONE_2")) {
					iPhone iphoneCatalogo2 = ip2;
					iphoneCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + iphoneCatalogo2.PrecioTotal(cantidad));
					preciototal += iphoneCatalogo2.PrecioTotal(cantidad);
					if (iphoneCatalogo2.getCantidad() > 0) {
						escritura.write(iphoneCatalogo2.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IPHONE_3")) {
					iPhone iphoneCatalogo3 = ip3;
					iphoneCatalogo3.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + iphoneCatalogo3.PrecioTotal(cantidad));
					preciototal += iphoneCatalogo3.PrecioTotal(cantidad);
					if (iphoneCatalogo3.getCantidad() > 0) {
						escritura.write(iphoneCatalogo3.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("MAC_1")) {
					MAC MACCatalogo1 = Mac1;
					MACCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + MACCatalogo1.PrecioTotal(cantidad));
					preciototal += MACCatalogo1.PrecioTotal(cantidad);
					if (MACCatalogo1.getCantidad() > 0) {
						escritura.write(MACCatalogo1.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("MAC_2")) {
					MAC MACCatalogo2 = Mac2;
					MACCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + MACCatalogo2.PrecioTotal(cantidad));
					preciototal += MACCatalogo2.PrecioTotal(cantidad);
					if (MACCatalogo2.getCantidad() > 0) {
						escritura.write(MACCatalogo2.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IWATCH_1")) {
					iWatch IWATCHCatalogo1 = iw1;
					IWATCHCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + IWATCHCatalogo1.PrecioTotal(cantidad));
					preciototal += IWATCHCatalogo1.PrecioTotal(cantidad);
					if (IWATCHCatalogo1.getCantidad() > 0) {
						;
						escritura.write(IWATCHCatalogo1.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("IWATCH_2")) {
					iWatch IWATCHCatalogo2 = iw2;
					IWATCHCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + IWATCHCatalogo2.PrecioTotal(cantidad));
					preciototal += IWATCHCatalogo2.PrecioTotal(cantidad);
					if (IWATCHCatalogo2.getCantidad() > 0) {
						escritura.write(IWATCHCatalogo2.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("AIRPOD_1")) {
					airPods AIRPODCatalogo1 = ai1;
					AIRPODCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + AIRPODCatalogo1.PrecioTotal(cantidad));
					preciototal += AIRPODCatalogo1.PrecioTotal(cantidad);
					if (AIRPODCatalogo1.getCantidad() > 0) {
						escritura.write(AIRPODCatalogo1.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("AIRPOD_2")) {
					airPods AIRPODCatalogo2 = ai2;
					AIRPODCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + AIRPODCatalogo2.PrecioTotal(cantidad));
					preciototal += AIRPODCatalogo2.PrecioTotal(cantidad);
					if (AIRPODCatalogo2.getCantidad() > 0) {
						escritura.write(AIRPODCatalogo2.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("ACCESORIOS_1")) {
					Accesorios ACCESORIOSCatalogo1 = ac1;
					ACCESORIOSCatalogo1.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + ACCESORIOSCatalogo1.PrecioTotal(cantidad));
					preciototal += ACCESORIOSCatalogo1.PrecioTotal(cantidad);
					if (ACCESORIOSCatalogo1.getCantidad() > 0) {
						escritura.write(ACCESORIOSCatalogo1.toString());
						escritura.flush();
					}
				}
				if (values[i].contains("ACCESORIOS_2")) {
					Accesorios ACCESORIOSCatalogo2 = ac2;
					ACCESORIOSCatalogo2.setCantidad(cantidad);
					System.out.println("El precio total a pagar es: " + ACCESORIOSCatalogo2.PrecioTotal(cantidad));
					preciototal += ACCESORIOSCatalogo2.PrecioTotal(cantidad);
					if (ACCESORIOSCatalogo2.getCantidad() > 0) {
						escritura.write(ACCESORIOSCatalogo2.toString());
						escritura.flush();
					}
				}
				System.out.println("El precio total a pagar es " + preciototal);
			}

		}
		escritura.write("\n El precio total a pagar es: " + String.valueOf(preciototal) + "\n");
		escritura.close();
		sc.close();
		/*
		 * //LEEMOS LA CESTA ArrayList<String> lineas = new ArrayList<String>(); String
		 * datos; File CESTA = new File(Ruta, "Cesta.txt"); FileReader FR = new
		 * FileReader(CESTA); BufferedReader lectura=new BufferedReader (FR); while
		 * ((datos = lectura.readLine()) != null) { StringTokenizer conteo = new
		 * StringTokenizer(datos, " "); StreamTokenizer lectura1 = new
		 * StreamTokenizer(new StringReader(datos)); while (lectura1.nextToken() !=
		 * StreamTokenizer.TT_EOF) { if (lectura1.ttype == StreamTokenizer.TT_NUMBER) {
		 * lineas.add(lectura1.sval); } if (lectura1.ttype == StreamTokenizer.TT_EOF) {
		 * if (!lineas.isEmpty()) { for(int i = 0; i<lineas.size(); i++){
		 * 
		 * } } } }
		 * 
		 * }
		 */
	}
}
