/**
 * 
 */
package model;
import java.util.Random;

/**
 * @author Michelle Mejía
 *Lab 1: Persona
 *Esta clase simulará las características que posee y acciones que puede realizar un voluntario
 *dentro de la perrera.
 */

public class Persona {

	/**
	 *Declaramos nuestras variables a utilizar
	 */
	
	private  String nombrePersona;
	private double confiabilidad;
	private double azar;
	private boolean poseeGalleta;
	
	
	
	public Persona() {
		
		/**
		 *Inicializamos nuestras variables.
		 *Generamos 2 números random, uno para la confiabilidad y otro para darle
		 *un poco de azar a la variable poseeGalleta.
		 */
		
		nombrePersona= "";
		confiabilidad=0;
		
		Random rnd = new Random();
		confiabilidad = (double)rnd.nextInt(11);
		azar = (double)rnd.nextInt(5);
		
		if(azar<2){
			poseeGalleta=false;
		}else{
			poseeGalleta=true;
			}
	}
	
	/**
	 *Creamos nuestros setters y getters para poder asignarles valor
	 *y utilizar estas propiedades en otros métodos fuera de la clase.
	 */
		
		public String getNombrePersona() {
			return nombrePersona;
		}
		
		public void setNombrePersona(String nombrePersona) {
			this.nombrePersona = nombrePersona;
			
	}
		public double getConfiabilidad() {
			return confiabilidad;
		}
		public void setConfiabilidad(double confiabilidad) {
			this.confiabilidad = confiabilidad;
			
	}
		public boolean getPoseeGalleta() {
			return poseeGalleta;
		}
		
		public void setPoseeGalleta(boolean poseeGalleta) {
			this.poseeGalleta = poseeGalleta;
			
	}
}
