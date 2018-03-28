class Basic extends Conta{
	Basic(int id){
		super(id);
	}
	
	//Inclusão no método - Sobrecarga
	public void creditar(double valor){
		this.saldo+=valor;
	}
	
	//Inclusão no método - Sobrecarga
	public void debitar(double valor){
		this.saldo-=valor;
	}
}
