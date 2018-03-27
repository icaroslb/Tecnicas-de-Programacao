public abstract class Conta{
	int id;
	double saldo;
	
	Conta(int id, String tipo){
		this.id=id;
		this.tipo=tipo;
	}
	
	abstract void creditar(double valor);
	abstract void debitar(double valor);
	
	int idConta(){
		return this.id;
	}
	
	int saldoConta(){
		return this.saldo;
	}
}
