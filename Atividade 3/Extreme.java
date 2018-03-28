class Extreme extends Conta{
	
	Extreme(int id){
		super(id);
	}
	
	void creditar(double valor){
		this.saldo+=(valor+(valor*0.002));
	}
	
	void debitar(double valor){
		this.saldo-=(valor-(valor*0.002));
	}
}
