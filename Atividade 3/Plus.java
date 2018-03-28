class Plus extends Conta{
	Plus(int id){
		super(id);
	}
	
	//Inclusão no método - Sobrecarga
	void creditar(double valor){
		this.saldo+=(valor+(valor*0.005));
	}
	
	//Inclusão no método - Sobrecarga
	void debitar(double valor){
		this.saldo-=valor;
	}
}
