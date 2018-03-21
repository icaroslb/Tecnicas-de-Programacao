class Elem{
	Object val;
	Elem prox, ant;
	
	Elem(Object val){
		this(val, null, null);
	}
		
	Elem(Object val, Elem ant){
		this(val, null, ant);
	}
	
	Elem(Object val, Elem prox, Elem ant){
		this.val=val;
		this.prox=prox;
		this.ant=ant;
	}
	
	/*void inserir(int val){
		Elem aux=this, novo;
		
		while(aux.prox!=null && aux.val<val){
			aux=aux.prox;
		}
			/*if(aux.val==val){
				System.out.println("Esse número já exite no conjunto!");
			}else{
		if(aux.val!=val){
			novo=new Elem(val, ant);
			if(this==aux){
				novo.prox=aux;
				aux.ant=novo;
				aux=novo;
			}
			if(aux.val<val){
				novo.prox=aux.prox;
				novo.ant=aux;
				aux.prox=novo;
				if(novo.prox!=null){
					novo.prox.ant=novo;
				}
			}else{
				novo.ant=aux;
				novo.prox=aux.prox;
				aux.prox=novo;
			}
		}
	}*/
	
	boolean pertinencia(Object val){
		Elem aux=this;
		
		while(aux!=null && aux.val!=val){
			aux=aux.prox;
		}
		
		if(aux!=null){
			return true;
		}else{
			return false;
		}
	}
	
	void mostrarElementos(){
		Elem aux=this;
		
		while(aux!=null){
			System.out.println(aux.val);
			aux=aux.prox;
		}
	}
}
