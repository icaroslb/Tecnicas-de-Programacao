class Plus extends Conta{
	Plus(int id){
		super(id);
	}
	
	void creditar(double valor){
		this.saldo+=(valor+(valor*0.005));
	}
	
	void debitar(double valor){
		this.saldo-=valor;
	}
}
