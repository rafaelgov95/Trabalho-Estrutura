package br.nasa.viagemAmarte2020.estruturasDeDados.Lista;
/** 
 * @author rafael
 *
 */

public class No {
	private No anterior;		
	private No proximo;
	private String valor;		
	//Define valor do nó.
	public void setValor(String valor) {
		this.valor = valor;
	}
	//Retorna valor do nó.
	public String getValor() {
		return valor;
	}
	//Define nó anterior.
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	//Retorna nó anterior
	public No getAnterior() {
		return anterior;
	}
	//Define proximo nó.
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	//Retorna proximo nó
	public No getProximo() {
		return proximo;
	}
}