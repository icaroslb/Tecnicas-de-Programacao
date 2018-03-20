class Teste1{
	public static void main(String[] args){
		Conjunto conj=new Conjunto();
		
		for(int i=1; i<5; i++){
			conj.criar();
		}
		
		for(int i=0; i<10; i++){
			conj.inserir(1, i);
		}
		
		for(int i=0; i<5; i++){
			conj.inserir(2, i*2);
		}
		
		for(int i=0; i<5; i++){
			conj.inserir(3, (i*2)+1);
		}
		
		for(int pri=2, i=0; i<10; pri++){
			if(pri==2){
				conj.inserir(4, pri);
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
						conj.inserir(4, pri);
						i=i+1;
					}
				}
			}
		}
		conj.subConjunto(4, 4);						 //questão 1
		
		for(int i=2; i<5; i++){						//questão 2
			conj.pertinencia(1, i);
		}
		
		int uni=conj.uniao(2, 3);					//questão 3
		conj.subConjunto(uni, 1);
		conj.subConjunto(1, uni);
		
		int inter=conj.interseccao(1, 2);	//questão 4
		conj.conjVazio(inter);
	
		int dife=conj.diferenca(1, 2);		//questão 5
		conj.mostrarElementos(dife);
	}
}
