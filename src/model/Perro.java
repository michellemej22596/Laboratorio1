/**
 * 
 */
package model;

import java.util.Random;

/**
 * @author Michelle Mejía
 *Lab 1: Perro
 *Esta clase simulará las características que posee y acciones que puede realizar un
 *perro dentro de la perrera.
 */

public class Perro {

	/**
	 *Declaramos nuestras variables a utilizar
	 */
	
	private  String nombrePerro;
	private double animo;
	private double umbral;
	private String[] posiblesNombres;
	
	public Perro() {
		
		/**
		 *Inicializamos nuestras variables.
		 *Generamos 2 números random, uno para la confiabilidad y otro para darle
		 *un poco de azar a la variable poseeGalleta. También creamos una colección de nombres de los perritos que se encuentran en la perrera
		 *agregandóle un poco de azar.
		 */
		
		Persona persona= new Persona();
		
		nombrePerro="";
		animo= 0;
		umbral=0;
		String[] posiblesNombres= new String[] {"Tito", "Firulais", "Coco", "Keysi", "Puppy", "Cheese", "Boby", "Minina", "Maya", "Hope"};
		Random rnd = new Random();
		int i = (int)rnd.nextInt(10);
		nombrePerro= posiblesNombres[i];
		
		/**
		 *De esta forma obtenemos valores de 0 a -21 como umbral y de -5 a 5 como animo.
		 */
		Random r = new Random();
		Random a = new Random();
		umbral = (double)r.nextInt(21)*-1;
		animo = (double)r.nextInt(6)-(double)a.nextInt(11);
		
		/**
		 *Setters y getters
		 */
		
	}
	
	public String getNombrePerro() {
		return nombrePerro;
	}
	
	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
}
	
	public double getAnimo() {
		return animo;
	}
	public void setAnimo(double animo) {
		this.animo = animo;
}
	
	public double getUmbral() {
		return umbral;
	}
	public void setUmbral(double umbral) {
		this.umbral = umbral;
		
		/**
		 *Función psican proveída por nuestro vet al momento de darle una galleta al cachorro.
		 */
		
}
	public void psican(Persona p) {
		Random rand = new Random();
		this.animo=(1.0/p.getConfiabilidad()* rand.nextFloat() - 0.5) *10 + this.animo;
		if(p.getPoseeGalleta()==true){
			this.animo+=(1.0/p.getConfiabilidad())* (rand.nextInt(2));
			System.out.println("El nuevo ánimo es: "+ animo);
		}
		
	}

}
