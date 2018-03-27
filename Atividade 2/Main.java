class Main{
	public static void main(String[] args){
		Circulo c1, c2;
		Quadrado q1, q2;
		Figura[] fig=new Figura[10];
		float area, px, py;
		
		q1=new Quadrado(3, 5, 15);
		q2=new Quadrado(5, 6, 3);
		c1=new Circulo(6, 3, 3);
		c2=new Circulo(3, 3, 9);
		
		System.out.println("Quadrado 1:");
		System.out.println("posição: ("+q1.posicaox()+", "+q1.posicaoy()+")");
		q1.mover(5, 3);
		System.out.println("posição: ("+q1.posicaox()+", "+q1.posicaoy()+")");
		System.out.println("area do "+q1.desenhar("rojo")+": "+q1.calcularArea());
		
		System.out.println("\nQuadrado 2:");
		System.out.println("posição: ("+q2.posicaox()+", "+q2.posicaoy()+")");
		q2.mover(2, -3);
		System.out.println("posição: ("+q2.posicaox()+", "+q2.posicaoy()+")");
		System.out.println("area do "+q2.desenhar("lila")+": "+q2.calcularArea());
		
		System.out.println("\nCírculo 1:");
		System.out.println("posição: ("+c1.posicaox()+", "+c1.posicaoy()+")");
		c1.mover(-5, -9);
		System.out.println("posição: ("+c1.posicaox()+", "+c1.posicaoy()+")");
		System.out.println("area do "+c1.desenhar()+": "+c1.calcularArea());
		
		System.out.println("\nCírculo 1:");
		System.out.println("posição: ("+c2.posicaox()+", "+c2.posicaoy()+")");
		c2.mover(-50, 3);
		System.out.println("posição: ("+c2.posicaox()+", "+c2.posicaoy()+")");
		System.out.println("area do "+c2.desenhar()+": "+c2.calcularArea());
		
		System.out.println("\n");
		fig[0]=new Quadrado(0, -5, 10);
		fig[1]=new Circulo(7, 7, 2);
		fig[2]=new Circulo(2, 3, 9);
		fig[3]=new Circulo(10, 10 ,10);
		fig[4]=new Circulo(11, 1, 5);
		fig[5]=new Quadrado(-10, -10, 2);
		fig[6]=new Quadrado(5, 5, 5);
		fig[7]=new Quadrado(2, 9, 9);
		fig[8]=new Circulo(1, 1, 2);
		fig[9]=new Quadrado(3, 9, 2);

		for(int i=0; i<10; i++){
			if(fig[i] instanceof Colorida){
				System.out.println("Área do quadrado "+(i+1)+": "+fig[i].calcularArea());
			}
		}
		
	}
}
