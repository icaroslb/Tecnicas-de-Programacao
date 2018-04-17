class Multiplicar extends Expressao{
	
	Multiplicar(Calculo x, Calculo y){
		inserir(x, y);
	}
	
	public double operar(){
		return (x.operar())*(y.operar());
	}
}
