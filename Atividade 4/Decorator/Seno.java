import java.lang.Math;
class Seno extends Unario implements Calculo{
	
	Seno(Calculo una){
		super(una);
	}
	
	public double operar(){
		double valor;
		valor = super.operar();
		return Math.sin(valor);
	}
}
