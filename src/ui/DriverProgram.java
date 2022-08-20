/**
 * 
 */
package ui;

import java.util.Scanner;

import model.Perro;
import model.Persona;
import controller.InteractionMethod;

/**
 * @author Michelle Mejía
 * Lab 1: Driver Program
 * Este será el programa principal o main, por aquí encontraremos el menú y
 * la llamada a los métodos y clases.
 */
public class DriverProgram {

	public DriverProgram() {
	}

	public static void main(String[] args) {
		/**
		 * Bienvenida
		 */
		
		System.out.println("¡Bienvenido al programa!");
		
		System.out.println("¿Qué desea realizar el día de hoy?");
		
		Scanner entrada = new Scanner(System.in);
		String option1 = "";
		Persona persona= new Persona();
		Perro perro=new Perro();
		InteractionMethod interactionMethod = new InteractionMethod(0.0, 0.0, 0.0);
		
while (!option1.equals("5")) {
			
			printMenu();
			option1 = "" + entrada.nextLine();
			switch (option1) {
			
			/**
			 *Definimos datos persona.
			 */
			
			case "1":{
				persona= new Persona();
				System.out.println("*********************");
				System.out.println("¿Cuál es tu nombre?");
				String nombrePersona = entrada.nextLine();
				persona.setNombrePersona(nombrePersona);
				System.out.println("El nuevo voluntario es: " + persona.getNombrePersona());
				System.out.println("Su nivel de confiabilidad es: " + persona.getConfiabilidad());
				System.out.println("Posee galleta: " + persona.getPoseeGalleta());
				}break;
				
				/**
				 *Definimos datos perrito
				 */
				
			case "2":{
				perro=new Perro();
				System.out.println("*********************");
				System.out.println("El perro que estará bajo tu cuidado se llama: "+ perro.getNombrePerro());
				System.out.println("¡Ojo! Su ánimo está en:" + perro.getAnimo());
				System.out.println("Su umbral se encuentra en: "+ perro.getUmbral());
				}break;
				
				/**
				 * Si la persona posee galleta hace una llamada a la función psican
				 * para determinar el comportamiento del perro ante el premio.
				 */
			
			case "3":{ 
				System.out.println("*********************");
				
				if(persona.getPoseeGalleta()==true){
				System.out.println("*YUM YUM*");
				System.out.println("¡Felicidades! Has aumentado el ánimo de tu amigo cachorro.");
				perro.psican(persona);
				persona.setPoseeGalleta(false);
				}
				else{
				System.out.println("Desafortunadamente no posees una galleta para darle al perrito.");
				}
				}break;
				
				/**
				 *Llamada al método mover cola y reacciones.
				 */
				
			case "4":{
				
				if(interactionMethod.MoverCola()==true){
					System.out.println("*YEEEEY*");
					System.out.println("¡Asombroso! El cachorro te ha movido la cola.");
					}
				else{
					System.out.println("*OHHHH*");
					System.out.println("El cachorro no te ha movido la cola, pero descuida, puedes darle una galleta, buscar un nuevo perro o seguir interactuando.");
					}
				
				/**
				 *Llamada al método ladrar y reacciones.
				 */
				
				if(interactionMethod.Ladrar()==true){
					System.out.println("*WOOF! WOOF!*");
					System.out.println("¡Cuidado! El perro te ha ladrado, es una advertencia.");
					}
				else{
					System.out.println("*    *");
					System.out.println("¡Muy bien! El perro no ha ladrado. Es una buena señal.");
					}
				
				/**
				 *Llamada al método morder y reacciones.
				 */
				if(interactionMethod.Morder()==true){
					System.out.println("*AUCH!!*");
					System.out.println("¡Lo lamento! El perro te ha mordido. Lava la herida y acude a tu centro médico más cercano.");
					}
				else{
					System.out.println("*UFFF*");
					System.out.println("¡Qué alegre! El perro no te ha mordido");
					}
				
				}break;
				
				/**
				 *Despedida y programación defensiva.
				 */
				
			case "5":{
				System.out.println("¡Muchas gracias por utilizar el programa!");
			}break;
			
			default:{
				System.out.println("Por favor ingrese una opción válida.");
			}
			}
			
		}

	}
	
	/**
	 *Menú mostrado en consola.
	 */
	
	public static void printMenu(){
		System.out.println("*********************");
		System.out.println("Seleccione una opción (asegúrate de asignar una persona y un perro antes de interactuar).");
		System.out.println("1. Nueva persona");
		System.out.println("2. Nuevo perro");
		System.out.println("3. Sacar galleta");
		System.out.println("4. Interactuar");
		System.out.println("5. Salir");
	}


}
