class Conjunto{
	Elem elem;
	
	Conjunto(){
		this.elem=null;
	}
	
	void inserir(Object valor){
		Elem novo=new Elem(valor);
		if(this.elem==null){
			this.elem=novo;
		}else{
			novo.prox=this.elem;
			this.elem.ant=novo;
			this.elem=novo;
		}
	}
	
	boolean pertinencia(Object valor){	
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
		if(this.elem!=null){
			this.elem.mostrarElementos();
		}
	}
	
	Conjunto produtoCartesiano(Conjunto conjunto){
		Elem aux1, aux2;
		Conjunto pc=new Conjunto();
		Tupla tp=new Tupla();
		
		aux1=this.elem;
		
		while(aux1!=null){
			aux2=conjunto.elem;
			while(aux2!=null){
				tp.preencher(aux1.val, aux2.val);
				pc.inserir(tp);
				aux2=aux2.prox;
			}
			aux1=aux1.prox;
		}
		
		aux2=conjunto.elem;
		while(aux2!=null){
			aux1=this.elem;
			while(aux1!=null){
				tp.preencher(aux2.val, aux1.val);
				pc.inserir(tp);
				aux1=aux1.prox;
			}
			aux2=aux2.prox;
		}
		return pc;
	}
	
	Conjunto conjPotencia(){
		Conjunto novo=new Conjunto(), fila;
		Elem aux1=this.elem, aux2;
		Tupla tupla;
		
		while(aux1!=null){
			aux2=novo.elem;
			fila=new Conjunto();
			while(aux2!=null){
				tupla=new Tupla();
				tupla.preencher(aux1, aux2);
				fila.inserir(tupla);
				aux2=aux2.prox;
			}
			if(fila.elem!=null){
				novo.inserir(fila.elem);
			}
			novo.inserir(aux1);
			aux1=aux1.prox;
		}
		return novo;
	}
}
