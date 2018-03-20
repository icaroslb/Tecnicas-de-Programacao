class Elem{
	int val;
	Elem prox, ant;
	
	Elem(int val){
		this(val, null, null);
	}
		
	Elem(int val, Elem ant){
		this(val, null, ant);
	}
	
	Elem(int val, Elem prox, Elem ant){
		this.val=val;
		this.prox=prox;
		this.ant=ant;
	}
	
	void inserir(int val){
		Elem ant=this, aux=this, novo;
		
		if(this==null){
			aux=new Elem(val, ant);
		}else{
			while(aux.prox!=null && aux.val<val){
				ant=aux;
				aux=aux.prox;
			}
			if(aux.val==val){
				System.out.println("Esse número já exite no conjunto!");
			}else{
				novo=new Elem(val, ant);
				if(this==aux){
					
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
		}
	}
	
	boolean pertinencia(int val){
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
