import java.lang.Math;

class Circulo extends Figura{
	
	Circulo(double x, double y, double raio){
		super(x, y, raio*2, raio*2, "Circulo");
	}
	
	double calcularArea(){
		return Math.PI*Math.pow(this.largura/2, 2);
	}
}
