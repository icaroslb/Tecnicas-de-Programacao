public abstract class Conta{
	int id;
	double saldo;
	
	Conta(int id){
		this.id=id;
		this.saldo=0;
	}
	
	abstract void creditar(double valor);
	abstract void debitar(double valor);
	
	int idConta(){
		return this.id;
	}
	
	double saldoConta(){
		return this.saldo;
	}
}
