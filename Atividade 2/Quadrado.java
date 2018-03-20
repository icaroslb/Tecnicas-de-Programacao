class Quadrado extends Figura{
	
	Quadrado(double x, double y, double lado){
		super(x, y, lado, lado, "Quadrado");
	}
	
	double calcularArea(){
		return this.altura*this.largura;
	}
}
