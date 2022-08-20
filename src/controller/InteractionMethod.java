package controller;
import model.Perro;

/**
 * @author Michelle Mejía
 *Lab 1: InteractionMethod
 *Esta clase nos permitirá manejar los métodos de interacción entre el voluntario
 *y el perrito.
 */

public class InteractionMethod {

	/**
	 *Declaramos nuestras variables a utilizar
	 */
	
	private double animo;
	private double umbral;
	private double confiabilidad;
	Perro perro=new Perro();
	
	public InteractionMethod(double _animo, double _umbral, double _confiabilidad) {
	animo=_animo;
	umbral=_umbral;
	confiabilidad=_confiabilidad;
	}
	
	/**
	 *Esta función nos ayudará a determinar si el perrito le mueve la cola al voluntario.
	 */

	public boolean MoverCola() {
		if(perro.getAnimo()<0){
			return true;
		}
		else{
			return false;
		}
}
	
	/**
	 *Esta función nos ayudará a determinar si el perrito muerde al voluntario.
	 */
	public boolean Morder() {
		if(perro.getAnimo()<perro.getUmbral()){
			return true;
		}
		else{
			return false;
		}
}
	
	/**
	 *Esta función nos ayudará a determinar si el perrito le ladra al voluntario.
	 */
	
	public boolean Ladrar() {
		if(perro.getAnimo()<0 && perro.getAnimo()>perro.getUmbral()){
			return true;
		}
		else{
			return false;
		}	
}
	
}
	
