package br.nasa.viagemAmarte2020.estruturasDeDados.Lista;
/** 
 * @author rafael
 *
 */
import java.util.ArrayList;
public class Lista {
	private No primeiro = null, ultimo = null;	
	//Define nó como primeiro da lista.
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	//Retorna o primeiro nó da lista.
	public No getPrimeiro() {
		return primeiro;
	}
	//Define nó como ultimo da lista.
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	//Retorna ultimo nó da lista.
	public No getUltimo() {
		return ultimo;
	}
	//Percorre os nós da lista atribuindo os valores de cada nó em um ArrayList enquanto o próximo nó não for nulo.
	public ArrayList<String> Listar() throws EmptyListException  {
		ArrayList<String> lista = new ArrayList<String>();		
		if(primeiro == null)
			throw new EmptyListException("A lista esta vazia!");		
		else{
			No aux = getPrimeiro();			
			while(aux != null){
				String vl = aux.getValor(); 
				lista.add(vl);
				aux = aux.getProximo();
			}
			return lista;
		}		
	}
	//Percorre os nós da lista comparando os valores de cada nó com o valor passado por parametro enquanto o próximo nó não for nulo.
	public boolean Procura(String valor){
		No aux = getPrimeiro();		
		while(aux != null){
			if(valor.equals(aux.getValor())){
				return true;
			}
			aux = aux.getProximo();
		}
		return false;
	}
	//Insere valor passado por parametro no inicio da lista, se o valor não existir na lista.
	public void Insere_Inicio(String valor) throws ExistentValueException{		
		boolean procura = false;		
		procura = Procura(valor);		
		if (procura == false){		
			No novo = new No();			
			if (primeiro == null){
				novo.setValor(valor);
				setPrimeiro(novo);
				setUltimo(novo);
			}			
			else{
				primeiro.setAnterior(novo);
				novo.setValor(valor);
				novo.setProximo(primeiro);
				setPrimeiro(novo);				
			}
		}
		else{
			throw new ExistentValueException("Valor já existe na lista!");
		}
	}
	//Insere valor passado por parametro no fim da lista, se o valor não existir na lista.
	public void Insere_Fim(String valor) throws ExistentValueException{
		No novo = new No();		
		boolean procura = false;		
		procura = Procura(valor);		
		if(procura == true)
			throw new ExistentValueException("Valor já existe na lista!");		
		else{
			if(ultimo == null){			
				novo.setValor(valor);
				primeiro = novo;
				ultimo = novo;			
			}
			else{
				ultimo.setProximo(novo);
				novo.setValor(valor);
				ultimo = novo;
			}
		}
	}	
}