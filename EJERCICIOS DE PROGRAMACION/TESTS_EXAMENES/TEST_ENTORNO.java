package TESTS_EXAMENES;
import java.util.Scanner;

public class TEST_ENTORNO {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int correctas = 0;
		int incorrectas = 0;
		
		System.out.println("1. �Cu�les de estos elementos no es esencial para encender un ordenador?\r\n\n"
				+ "A. Disco duro\r\n"
				+ "B. CPU\r\n"
				+ "C. RAM\r\n"
				+ "D. GPU");
		String pregunta1 = sc.next();		
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta1.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("2. Los dispositivos de almacenamiento pueden ser:\r\n\n"
				+ "A. magn�ticos, �pticos, el�ctricos\r\n"
				+ "B. imantados, �pticos, electr�nicos\r\n"
				+ "C. magn�ticos, �pticos, electr�nicos\r\n"
				+ "D. Todas son correctas");
		
		String pregunta2 = sc.next();
		if (pregunta2.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta2.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("3. Cuando hablamos de arquitectura de ordenadores, �cu�l es la implementada\r\n\n"
				+ "en la mayor�a de ordenadores modernos?\r\n"
				+ "A. Estructura Von Neuman\r\n"
				+ "B. La m�quina de Turing\r\n"
				+ "C. La arquitectura de Boyle Codd\r\n"
				+ "D. La arquitectura de Harvard");
		
		String pregunta3 = sc.next();		
		if (pregunta3.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta3.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("4. Un micr�fono:\r\n\n"
				+ "A. Es un perif�rico de entrada\r\n"
				+ "B. Es un perif�rico de salida\r\n"
				+ "C. Contiene un microprocesador\n"
				+ "D. No puede ser conectado a una computadora");
		
		String pregunta4 = sc.next();		
		if (pregunta4.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta4.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("5. La memoria RAM es...\r\n\n"
				+ "a. un componente el�ctrico que almacena informaci�n e\r\n"
				+ "instrucciones para utilizarse en momentos determinados.\r\n"
				+ "b. es el dispositivo donde normalmente se almacena el sistema\r\n"
				+ "operativo\r\n"
				+ "c. un dispositivo transformar la corriente alterna en corriente continua y\r\n"
				+ "facilitar la corriente el�ctrica\r\n"
				+ "d. Ninguna es verdad");
		String pregunta5 = sc.next();		
		if (pregunta5.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta5.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("6. �Qu� tipos de licencia de sistemas operativos existen?\r\n\n"
				+ "a.licencia propietaria\r\n"
				+ "b.licencia libre\r\n"
				+ "c.licencia arrendataria\r\n"
				+ "d. a. y b. correctas");
		String pregunta6 = sc.next();		
		if (pregunta6.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("7. �Cu�les de estos formatos no forman parte de una instalaci�n desatendida?\r\n\n"
				+ "a. MSI\r\n"
				+ "b. MSP\r\n"
				+ "c. MST\r\n"
				+ "d. TDP");
		String pregunta7 = sc.next();		
		if (pregunta7.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta7.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("8. �Cu�les de estos no son herramientas de internet/prop�sito general?\r\n\n"
				+ "a. Navegadores\r\n"
				+ "b. Licencia de software\r\n"
				+ "c. Recuperaci�n de datos y sistemas\r\n"
				+ "d. Correo electr�nico");
		String pregunta8 = sc.next();		
		if (pregunta8.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta8.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta8.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta8.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("9. Elige cu�l de estas opciones no es un navegador web:\r\n\n"
				+ "a. Internet Explorer\r\n"
				+ "b. Safari\r\n"
				+ "c. Google Chrome\r\n"
				+ "d. Microsoft Outlook");
		
		String pregunta9 = sc.next();		
		if (pregunta9.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta9.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta9.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta9.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("10. La licencia propietaria y la libre:\r\n\n"
				+ "a. Se diferencian en rendimiento\r\n"
				+ "b. Se diferencian en variedad de opciones\r\n"
				+ "c. Se diferencian en precio de adquisici�n\r\n"
				+ "d. Ninguna de las anteriores es correcta");
		String pregunta10 = sc.next();		
		if (pregunta10.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta10.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("11. �Cu�l de los siguientes es el medio m�s habitual de los usuarios para\r\n\n"
				+ "interactuar con el sistema operativo?\r\n"
				+ "a. El s�mbolo del sistema\r\n"
				+ "b.La tarjeta gr�fica\r\n"
				+ "c. La interfaz gr�fica\r\n"
				+ "d.La consola de comandos");
		String pregunta11 = sc.next();
		if (pregunta11.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta11.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("12. �Qu� sistemas de arquitecturas son incorrectos?\r\n\n"
				+ "a. Sistemas por lotes\r\n"
				+ "b. Sistemas por lotes de programaci�n\r\n"
				+ "c. Sistemas distribuidos\r\n"
				+ "d. Sistemas no distribuidos");
		String pregunta12 = sc.next();		
		if (pregunta12.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("13. �Cu�les son las estructuras m�s conocidas de un sistema inform�tico?:\r\n\n"
				+ "a. Monol�tica, jer�rquica, en anillos, cliente-servidor.\r\n"
				+ "b. Monol�tica, por lotes, jer�rquica, servidor.\r\n"
				+ "c. Monol�tica, jer�rquica, en anillos, distribuida.\r\n"
				+ "d. Jer�rquica, servidor, en anillos, por lotes.");
		String pregunta13 = sc.next();		
		if (pregunta13.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta13.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("14. Tipo de sistema operativo seg�n los servicios que ofrecen:\r\n\n"
				+ "a. Monousuario y Multiusuario\r\n"
				+ "b. Centralizado y distribuido\r\n"
				+ "c. Monotarea y Multitarea\r\n"
				+ "d. Inestable y ejecutable");
		String pregunta14 = sc.next();		
		if (pregunta14.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta14.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("15. �Qu� es una m�quina virtual?\r\n\n"
				+ "a. Un hardware instalado en un sistema que emula que el sistema operativo est�\r\n"
				+ "instalado en otro ordenador.\r\n"
				+ "b. Un software instalado en un sistema que emula que el\r\n"
				+ "sistema operativo est� instalado en otro ordenador.\r\n"
				+ "c. Un sistema operativo secundario instalado en el ordenador.\r\n"
				+ "d. Una simulaci�n de software");
		
		String pregunta15 = sc.next();		
		if (pregunta15.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta15.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta15.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta15.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("16. �Cu�l de estas versiones no existen de Windows 10?\r\n\n"
				+ "a. Windows 10 Home\r\n"
				+ "b. Windows 10 Pro\r\n"
				+ "c. Windows 10 Pro N\r\n"
				+ "d. Windows LTS");
		String pregunta16 = sc.next();		
		if (pregunta16.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta16.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta16.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta16.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("17. �Que herramienta facilita Microsoft para la creaci�n de im�genes?:\r\n\n"
				+ "a. Sysout\r\n"
				+ "b. Sysprep\r\n"
				+ "c. Sypre\r\n"
				+ "d. Sitop");
		String pregunta17 = sc.next();		
		if (pregunta17.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta17.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("18. Un controlador o driver es�\r\n\n"
				+ "a. una herramienta de administraci�n central\r\n"
				+ "b. un peque�o programa que habilita y permite a otros programas la interacci�n\r\n"
				+ "con componentes de hardware\r\n"
				+ "c. kit con diversas herramientas profesionales que permite personalizar\r\n"
				+ "instalaciones\r\n"
				+ "d. un entorno que se ejecuta a trav�s de la tarjeta de red");
		String pregunta18 = sc.next();		
		if (pregunta18.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta18.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("19. �Qu� exige Windows 10 como m�nimo para obtener un rendimiento �ptimo en un\r\n\n"
				+ "sistema operativo de 64 bits?\r\n"
				+ "a. 1 gb de RAM\r\n"
				+ "b. 2 gb de RAM\r\n"
				+ "c. 3 gb de RAM\r\n"
				+ "d. 4 gb de RAM");
		
		String pregunta19 = sc.next();		
		if (pregunta19.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta19.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta19.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta19.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("20. �Qu� programa utilizaremos para crear una copia de nuestro windows o un\r\n\n"
				+ "usb para instalar windows?\r\n"
				+ "a. Visual Paradigm\r\n"
				+ "b. Windows Media Creation Tool\r\n"
				+ "c. Puraruca Creation Tool\r\n"
				+ "d. Ruphus");
		
		String pregunta20 = sc.next();		
		if (pregunta20.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta20.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("21. �Que comando se usa en linux para: ver la fecha\r\n\n"
				+ "A. date\r\n"
				+ "B. exit\r\n"
				+ "C. ping\r\n"
				+ "D. sudo");
		String pregunta21 = sc.next();		
		if (pregunta21.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta21.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("22. �Cu�l de los siguientes softwares no sirven para clonar sistemas, particiones\r\n\n"
				+ "o archivos?\r\n"
				+ "a. Clonezilla\r\n"
				+ "b. Redo Backup and Recover\r\n"
				+ "c. Sergei Strelec\r\n"
				+ "d. Easeus");
		String pregunta22 = sc.next();
		if (pregunta22.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta22.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("23. �Hasta qu� tama�o de archivo permite el sistema de archivos ext4?\r\n\n"
				+ "a. 1 TeraByte\r\n"
				+ "b. 1 GigaByte\r\n"
				+ "c. 1 ExaByte\r\n"
				+ "d. 2 MegaBytes");
		String pregunta23 = sc.next();
		if (pregunta23.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta23.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta23.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta23.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("24. �Qu� comando de la terminal de linux permite al usuario actualizar paquetes\r\n\n"
				+ "de aplicaciones?\r\n"
				+ "a. addpackage\r\n"
				+ "b. apt-get update\r\n"
				+ "c. apt-get install\r\n"
				+ "d. updpackage");
		String pregunta24 = sc.next();		
		if (pregunta24.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta24.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("25. �Con qu� comando linux puedes borrar directorios en la terminal de ubuntu?\r\n\n"
				+ "a. file\r\n"
				+ "b. rm -r\r\n"
				+ "c. ls /directorio\r\n"
				+ "d. sudo delete");
		String pregunta25 = sc.next();		
		if (pregunta25.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta25.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("26. �Con qu� comando borramos una carpeta llamada �alumno� que se\r\n\n"
				+ "encuentra en la carpeta de usuarios?\r\n"
				+ "a. rm -f /home/alumno\r\n"
				+ "b. sudo rm -r /home/alumno\r\n"
				+ "c. rm alumno\r\n"
				+ "d. sudo rm -r alumno");
		String pregunta26 = sc.next();		
		if (pregunta26.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta26.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("27. �Como podr�amos otorgar todos los permisos a una ruta determinada desde\r\n\n"
				+ "la terminal de linux?\r\n"
				+ "a. chmod rws\r\n"
				+ "b. ps axu\r\n"
				+ "c. chmod 777\r\n"
				+ "d. sudo + ruta");
		
		String pregunta27 = sc.next();
		if (pregunta27.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta27.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("28. �Qu� se hace con el comando �cat�?\r\n\n"
				+ "a. Lista todos los elementos de un archivo\r\n"
				+ "b. Muestra el contenido de un archivo en pantalla.\r\n"
				+ "c. Crea un directorio nuevo\r\n"
				+ "d. Sirve para copiar y pegar archivos");
		String pregunta28 = sc.next();		
		if (pregunta28.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta28.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("29. �Con qu� comando se muestra informaci�n de los usuarios que han iniciado sesi�n?\r\n\n"
				+ "a. sudo adduser\r\n"
				+ "b. sudo userinfo\r\n"
				+ "c. w\r\n"
				+ "d. ls home/");
		String pregunta29 = sc.next();
		if (pregunta29.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta29.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("30. Cual es el espacio m�s grande del escritorio de ubuntu:\r\n\n"
				+ "a.Fondo de escritorio\r\n"
				+ "b.Lanzador o panel\r\n"
				+ "c.Panel superior\r\n"
				+ "d.Dash");
		String pregunta30 = sc.next();		
		if (pregunta30.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta30.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("31. �Cu�l no es un programa para virtualizar?\r\n\n"
				+ "a. VirtualBox\r\n"
				+ "b. VMware\r\n"
				+ "c. Parallels Desktop\r\n"
				+ "d. KEMU");
		String pregunta31 = sc.next();		
		if (pregunta31.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		System.out.println("32. � Como podemos poner la m�quina virtual en pantalla completa con\r\n"
				+ "VirtualBox?\r\n"
				+ "a. Shift + F\r\n"
				+ "b. Instalando las guest additions + Host + F\r\n"
				+ "c. Ctrl Derecho + X\r\n"
				+ "d. FN + F11");
		String pregunta32 = sc.next();		
		if (pregunta32.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta32.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("33. �Qu� software de m�quina virtual acepta comandos por PowerShell?\r\n\n"
				+ "a. Vmax\r\n"
				+ "b. VirtualBox\r\n"
				+ "c. VMware\r\n"
				+ "d. Hyper-V");
		String pregunta33 = sc.next();		
		if (pregunta33.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta33.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta33.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta33.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("34. No es una de las desventajas de la virtualizaci�n\r\n\n"
				+ "A. Ralentizan el sistema principal\r\n"
				+ "B. Necesita un ordenador con elevados recursos de software\r\n"
				+ "C. Solo est� disponible en sistemas Windows\r\n"
				+ "D. Hay limitaciones de Hardware de, es decir, hay programas que podr�an\r\n"
				+ "no funcionar bien");
		
		String pregunta34 = sc.next();
		if (pregunta34.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta34.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta34.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta34.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("35. Cual es la desventaja de la virtualizaci�n;\r\n\n"
				+ "a. Todos los recursos de hardware son compartidos, memoria\r\n"
				+ "RAM, espacio en disco, red, etc\r\n"
				+ "b. Ahorro y reducci�n de costes al disponer en un solo ordenador f�sico\r\n"
				+ "varios sistemas operativos.\r\n"
				+ "c. F�cil administraci�n y mantenimiento: Con unos conocimientos\r\n"
				+ "b�sicos en virtualizaci�n es posible crear m�quinas virtuales y\r\n"
				+ "administrarlas.\r\n"
				+ "d. Permiten crear un entorno de pruebas y experimentar con diferentes\r\n"
				+ "sistemas operativos y aplicaciones");
		String pregunta35 = sc.next();		
		if (pregunta35.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta35.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta35.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta35.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		double nota = ((correctas - (incorrectas/3)) *10)/35;
		System.out.println("Tu nota es "+nota);
		
		System.out.println("Has acertado "+correctas+" y has falllado "+incorrectas+"");
		sc.close();
	}

}
