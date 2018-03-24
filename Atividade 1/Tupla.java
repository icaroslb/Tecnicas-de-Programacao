class Tupla{
	Object x, y;
	
	void preencher(Object x, Object y){
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Tupla obj){
			if((this.x==((Tupla)obj).obterx()) && (this.y==((Tupla)obj).obtery())){
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
