class Conjunto{
	int ind;
	Elem elem;
	Conjunto prox, ant;
	
	Conjunto(){
		this(0, null);
	}
	
	Conjunto(int ind, Conjunto ant){
		this(ind, null, ant);
	}
	
	Conjunto(int ind, Conjunto prox, Conjunto ant){
		this.ind=ind;
		this.prox=prox;
		this.ant=ant;
	}
	
	int criar(){
		Conjunto aux=this;
		
		while(aux.prox!=null){
			aux=aux.prox;
		}
		aux.prox=new Conjunto((aux.ind+1), aux);
		
		System.out.println("O conjunto "+(aux.ind+1)+" foi criado!");
		return aux.ind+1;
	}
	
	Conjunto procurar(int ind){
		Conjunto aux=this;
		
		while(aux!=null && aux.ind!=ind){
			aux=aux.prox;
		}
		return aux;
	}
	
	void inserir(int ind, int num){
		Conjunto aux=this.procurar(ind);
		
		if(aux!=null){
			if(aux.elem==null){
				aux.elem=new Elem(num);
			}else{
				aux.elem.inserir(num);
			}
		}else{
			System.out.println("Este conjunto não existe!");
		}
	}
	
	void pertinencia(int ind, int num){
		Conjunto aux=this.procurar(ind);
		boolean pert;
		if(aux!=null){
			pert=aux.elem.pertinencia(num);
			if(pert){
				System.out.println(num+" pertence ao conjunto "+ind+"!");
			}else{
				System.out.println(num+" não pertence ao conjunto "+ind+"!");
			}
		}else{
			System.out.println("Este conjunto não existe!");
		}
	}
	
	void subConjunto(int sconj, int conj){
		Conjunto conjunto=this.procurar(conj), sconjunto=this.procurar(sconj);
		Elem elem;
		boolean esub=true;
		
		if(conjunto!=null && sconjunto!=null){
			elem=conjunto.elem;
			
			while(elem!=null && esub){
				if(sconjunto.elem.pertinencia(elem.val)){
					elem=elem.prox;
				}else{
					esub=false;
				}
			}
			if(esub){
				System.out.println("O conjunto "+sconj+" é sub conjunto do "+conj+"!");
			}else{
				System.out.println("O conjunto "+sconj+" não é sub conjunto do "+conj+"!");
			}
		}else{
			System.out.println("Insira conjuntos existentes!");
		}
	}
	
	int uniao(int conj1, int conj2){
		Conjunto conjunto1=this.procurar(conj1), conjunto2=this.procurar(conj2), uni=this;
		Elem elem1, elem2;
		int vuni;
		
		if(conjunto1!=null && conjunto2!=null){
			vuni=this.criar();
			while(uni.ind!=vuni){
				uni=uni.prox;
			}
			elem1=conjunto1.elem;
			elem2=conjunto2.elem;
			
			while(elem1!=null || elem2!=null){
				if(elem1!=null && elem2!=null){
					if(elem1.val==elem2.val){
						elem1=elem1.prox;
						elem2=elem2.prox;
					}else if(elem1.val<elem2.val){
						uni.inserir(vuni, elem1.val);
						elem1=elem1.prox;
					}else if(elem2.val<elem1.val){
						uni.inserir(vuni, elem2.val);
						elem2=elem2.prox;
					}
				}else{
					if(elem1==null){
						uni.inserir(vuni, elem2.val);
						elem2=elem2.prox;
					}else if(elem2==null){
						uni.inserir(vuni, elem1.val);
						elem1=elem1.prox;
					}
				}
			}
		}else{
			System.out.println("Insira conjuntos existentes!");
		}
		return uni.ind;
	}
	
	int interseccao(int conj1, int conj2){
		Conjunto conjunto1=this.procurar(conj1), conjunto2=this.procurar(conj2), inter=this;
		Elem elem;
		int vint;
		
		if(conjunto1!=null && conjunto2!=null){
			vint=this.criar();
			while(inter.ind!=vint){
				inter=inter.prox;
			}
			elem=conjunto1.elem;
			
			while(elem!=null){
				if(conjunto2.elem.pertinencia(elem.val)){
					inter.inserir(vint, elem.val);
				}
				elem=elem.prox;
			}
		}else{
			System.out.println("Insira conjuntos existentes!");
		}
		return inter.ind;
	}
	
	int diferenca(int conj1, int conj2){
		Conjunto conjunto1=this.procurar(conj1), conjunto2=this.procurar(conj2), dif=this;
		Elem elem;
		int vdif;
		
		if(conjunto1!=null && conjunto2!=null){
			vdif=this.criar();
			while(dif.ind!=vdif){
				dif=dif.prox;
			}
			elem=conjunto1.elem;
			
			while(elem!=null){
				if(!(conjunto2.elem.pertinencia(elem.val))){
					dif.inserir(vdif, elem.val);
				}
				elem=elem.prox;
			}
		}else{
			System.out.println("Insira conjuntos existentes!");
		}
		return dif.ind;
	}
	
	void conjVazio(int ind){
		Conjunto aux=this;
		
		while(aux!=null && aux.ind!=ind){
			aux=aux.prox;
		}
		
		if(aux!=null){
			if(aux.elem!=null){
				System.out.println("O conjunto não é vazio!");
			}else{
				System.out.println("O conjunto é vazio!");
			}
		}else{
			System.out.println("Este conjunto não existe!");
		}
	}
	
	void mostrarElementos(int ind){
		Conjunto aux=this.procurar(ind);
		
		aux.elem.mostrarElementos();
	}
}
