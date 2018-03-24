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
	
	public boolean equals(Object obj){
		if(this.getClass() == obj.getClass()){
				if(((Elem)obj).val.equals(this.val) && ((Elem)obj).val.equals(this.val)){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
	}
	
	boolean pertinencia(Object val){
		Elem aux=this;
		
		while(aux!=null && !(aux.val.equals(val))){
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
