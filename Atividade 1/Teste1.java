class Teste1{
	public static void main(String[] args){
		Conjunto conj1=new Conjunto();
		Conjunto conj2=new Conjunto();
		Conjunto conj3=new Conjunto();
		Conjunto conj4=new Conjunto();
		
		for(int i=0; i<10; i++){
			conj1.inserir(i);
		}
		
		for(int i=0; i<5; i++){
			conj2.inserir(i*2);
		}
		
		for(int i=0; i<5; i++){
			conj3.inserir((i*2)+1);
		}
		
		for(int pri=2, i=0; i<10; pri++){
			if(pri==2){
				conj4.inserir(pri);
			}else{
				if(pri%2!=0){
					boolean teste=true;
					int aux=pri-2;
					while(aux>1 && teste){
						if(pri%aux==0){
							teste=false;
						}else{
							aux=aux-2;
						}
					}
					
					if(teste){
						conj4.inserir(pri);
						i=i+1;
					}
				}
			}
		}
		conj4.subConjunto(conj4);						 //questão 1
		
		for(int i=2; i<5; i++){						//questão 2
			conj1.pertinencia(i);
		}
		
		Conjunto uni=conj2.uniao(conj3);					//questão 3
		boolean uniao=uni.igualdade(conj1);
		if(uniao){
			System.out.println("São iguais!");
		}else{
			System.out.println("São diferentes!");
		}
		
		Conjunto inter=conj1.interseccao(conj2);	//questão 4
		boolean i=inter.conjVazio();
		if(i){
			System.out.println("É vazio!");
		}else{
			System.out.println("Não é vazio!");
		}
		
		Conjunto dife=conj1.diferenca(conj2);		//questão 5
		dife.mostrarElementos();
	}
}