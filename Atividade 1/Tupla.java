class Tupla{
	Object x, y;
	
	void preencher(Object x, Object y){
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Object obj){
			if(this.getClass() == obj.getClass() && ((Tupla)obj).x.equals(this.x) && ((Tupla)obj).y.equals(this.y)){
				return true;
			}else{
				return false;
			}
	}
	
	Object obterx(){
		return this.x;
	}
	
	Object obtery(){
		return this.y;
	}
}
