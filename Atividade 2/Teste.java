class Teste{
	public static void main(String[] args){
		Figura q1, q2, c1, c2;
		float area, px, py;
		
		q1=new Quadrado(3, 5, 15);
		q2=new Quadrado(5, 6, 3);
		c1=new Circulo(6, 3, 3);
		c2=new Circulo(3, 3, 9);
		
		System.out.println("Quadrado 1:");
		System.out.println("posição: ("+q1.posicaox()+", "+q1.posicaoy()+")");
		q1.mover(5, 3);
		System.out.println("posição: ("+q1.posicaox()+", "+q1.posicaoy()+")");
		System.out.println("area do "+q1.toString()+": "+q1.calcularArea());
		
		System.out.println("\nQuadrado 2:");
		System.out.println("posição: ("+q2.posicaox()+", "+q2.posicaoy()+")");
		q2.mover(2, -3);
		System.out.println("posição: ("+q2.posicaox()+", "+q2.posicaoy()+")");
		System.out.println("area do "+q2.toString()+": "+q2.calcularArea());
		
		System.out.println("\nCírculo 1:");
		System.out.println("posição: ("+c1.posicaox()+", "+c1.posicaoy()+")");
		c1.mover(-5, -9);
		System.out.println("posição: ("+c1.posicaox()+", "+c1.posicaoy()+")");
		System.out.println("area do "+c1.toString()+": "+c1.calcularArea());
		
		System.out.println("\nCírculo 1:");
		System.out.println("posição: ("+c2.posicaox()+", "+c2.posicaoy()+")");
		c2.mover(-50, 3);
		System.out.println("posição: ("+c2.posicaox()+", "+c2.posicaoy()+")");
		System.out.println("area do "+c2.toString()+": "+c2.calcularArea());
	}
}
