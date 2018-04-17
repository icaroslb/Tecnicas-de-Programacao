import java.lang.Math;
class Cosseno extends Unario implements Calculo{
	
	Cosseno(Calculo una){
		super(una);
	}
	
	public double operar(){
		double valor;
		valor = super.operar();
		return Math.cos(valor);
	}
}
