class Unario implements Calculo{
	Calculo una;
	
	Unario(Calculo una){
		this.una=una;
	}
	
	public double operar(){
		return una.operar();
	}
}
