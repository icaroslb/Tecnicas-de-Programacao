public class Quadrado extends Figura implements Colorida{
	
	Quadrado(double x, double y, double lado){
		super(x, y, lado, lado);
	}
	
	double calcularArea(){
		return this.altura*this.largura;
	}
	
	public String desenhar(String cor){
		return super.desenhar()+" "+cor;
	}
}
