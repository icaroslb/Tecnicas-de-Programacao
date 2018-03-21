class Conjunto{
	Elem elem;
	
	Conjunto(){
		this.elem=null;
	}
	
	void inserir(int valor){
		Elem novo=new Elem(valor);
		if(this.elem==null){
			this.elem=novo;
		}else{
			this.elem.inserir(valor);
		}
	}
	
	boolean pertinencia(int valor){	
		return this.elem.pertinencia(valor);
	}
	
	boolean subConjunto(Conjunto conjunto){
		boolean eSub=true;
		Elem aux=this.elem;
		
		while(aux!=null && eSub){
			eSub=conjunto.elem.pertinencia(aux.val);
			aux=aux.prox;
		}
		
		return eSub;
	}
	
	boolean igualdade(Conjunto conjunto){
		return (this.subConjunto(conjunto) && conjunto.subConjunto(this));
	}
	
	boolean conjVazio(){
		if(this.elem==null){
			return true;
		}else{
			return false;
		}
	}
	
	Conjunto uniao(Conjunto conjunto){
		Conjunto novo=new Conjunto();
		Elem aux;
		
		for(aux=this.elem; aux!=null; aux=aux.prox){
			novo.inserir(aux.val);
		}
		for(aux=conjunto.elem; aux!=null; aux=aux.prox){
			novo.inserir(aux.val);
		}
		return novo;
	}
	
	Conjunto interseccao(Conjunto conjunto){
		Conjunto novo=new Conjunto();
		Elem aux;
		
		for(aux=this.elem; aux!=null; aux=aux.prox){
			if(conjunto.pertinencia(aux.val)){
				novo.inserir(aux.val);
			}
		}
		return novo;
	}
	
	Conjunto diferenca(Conjunto conjunto){
		Conjunto novo=new Conjunto();
		Elem aux;
		
		for(aux=this.elem; aux!=null; aux=aux.prox){
			if(!(conjunto.pertinencia(aux.val))){
				novo.inserir(aux.val);
			}
		}
		return novo;
	}
	
	void mostrarElementos(){
		this.elem.mostrarElementos();
	}
	
	/*Conjunto produtoCartesiano(Conjunto conjunto){
		
	}*/
}
