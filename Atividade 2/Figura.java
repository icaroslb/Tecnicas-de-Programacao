public abstract class Figura{
	double x, y, altura, largura;
	
	Figura(double x, double y, double altura, double largura){
		this.x=x;
		this.y=y;
		this.altura=altura;
		this.largura=largura;
	}
	
	String desenhar(){
		return this.toString();
	}
	
	abstract double calcularArea();
	
	public void mover(double dx, double dy){
		this.x+=dx;
		this.y+=dy;
	}
	
	public double posicaox(){
		return this.x;
	}
	
	public double posicaoy(){
		return this.y;
	}
}
