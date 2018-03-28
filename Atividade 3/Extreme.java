class Extreme extends Conta{
	
	Extreme(int id){
		super(id);
	}
	
	//Inclusão no método - Sobrecarga
	void creditar(double valor){
		this.saldo+=(valor+(valor*0.002));
	}
	
	//Inclusão no método - Sobrecarga
	void debitar(double valor){
		this.saldo-=(valor-(valor*0.002));
	}
}
