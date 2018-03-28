class Main{
	public static void main(String[] args){
		Sistema s=new Sistema();
		
		s.criarContaXPTOBasic(1);
		s.criarContaXPTOPlus(2);
		s.criarContaXPTOExtreme(3);
		
		for(int i=1; i<=3; i++) s.creditar(i, 1000);
		
		for(int i=1; i<=3; i++) s.debitar(i, 10);
		
		System.out.println("Conta 1: "+s.consultarSaldo(1)+"\nConta 2: "+s.consultarSaldo(2)+"\nConta 3: "+s.consultarSaldo(3));
		
		return;
	}
}
