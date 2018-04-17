class Operando implements Calculo{
	
	double valor;
	
	Operando(int num){
		inserir(num);
	}
	
	void inserir(int num){
		valor=num;
	}
	
	public double operar(){
		return valor;
	}
}
