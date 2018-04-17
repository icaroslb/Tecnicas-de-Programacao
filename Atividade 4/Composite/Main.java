class Main{
	public static void main(String[] args){
		Calculo e1, e2, o1, o2, o3;
		
		o1 = new Operando(10);
		o2 = new Operando(20);
		o3 = new Operando(15);
		
		e2 = new Dividir(o3, o2);
		e1 = new Multiplicar(o1, e2);
		
		System.out.println(e1.operar());
	}
}
