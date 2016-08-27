package br.nasa.viagemAmarte2020.estruturasDeDados.Lista;
/** 
 * @author rafael
 *
 */

public class EmptyListException extends NullPointerException{
	public EmptyListException(){
		super();
	}
	public EmptyListException(String msg){
		super(msg);
	}
}
