class Tupla{
	Object x, y;
	
	void preencher(Object x, Object y){
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Object obj){
			if(this.getClass() == obj.getClass() && (this.x==((Tupla)obj).x) && (this.y==((Tupla)obj).y)){
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
