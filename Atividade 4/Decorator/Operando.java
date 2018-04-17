class Operando implements Calculo{
	
	double valor;
	
	Operando(double num){
		inserir(num);
	}
	
	void inserir(double num){
		valor=num;
	}
	
	public double operar(){
		return valor;
	}
}
