public class Quadrado extends Figura implements Colorida{
	
	Quadrado(double x, double y, double lado){
		super(x, y, lado, lado, "Quadrado");
	}
	
	double calcularArea(){
		return this.altura*this.largura;
	}
	
	public String desenhar(String cor){
		return this.tipo+" "+cor;
	}
}
