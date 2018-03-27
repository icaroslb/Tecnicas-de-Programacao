public abstract class Figura{
	double x, y, altura, largura;
	String tipo;
	
	Figura(double x, double y, double altura, double largura, String tipo){
		this.x=x;
		this.y=y;
		this.altura=altura;
		this.largura=largura;
		this.tipo=tipo;
	}
	
	//public String toString(){
	String desenhar(){
		return this.tipo;
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
