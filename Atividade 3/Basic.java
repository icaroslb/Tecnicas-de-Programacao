class Basic extends Conta{
	Basic(int id){
		super(id, "Basic");
	}
	
	public void creditar(double valor){
		this.saldo-=valor;
	}
	
	public void debitar(double valor){
		this.saldo-=valor;
	}
}
