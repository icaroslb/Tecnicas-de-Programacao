class Dividir extends Expressao{
	
	Dividir(Calculo x, Calculo y){
		inserir(x, y);
	}
	
	public double operar(){
		return (x.operar())/(y.operar());
	}
}
