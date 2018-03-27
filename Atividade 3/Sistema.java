class Sistema{
	Conta[] contas;
	
	Sistema(){
		contas=new contas[10];
	}
	
	//Verifica se o id é válido e retorna a posição caso seja
	int analizarId(int id){
		Basic existe;
		int pos=-1;
		
		//Procura se existe esta conta
		existe=this.procurar(id);
		//Verifica se achou
		if(existe!=null){
			//Procura uma possição válida
			for(int i=0; i<tamanho && pos==-1; i++){
				if(contas[i]==null){
					pos=i;
				}
			}
			//Aumenta se necessário
			if(pos==-1){
				pos=this.aumentar();
			}
		}
		return pos;
	}
	
	//Cria a conta XPTO Basic
	void criarContaXPTOBasic(int id){
		int pos, tamanho=contas.lenght;
		Basic novo;
			
		pos=this.analizarId(id);
		//Cria a nova conta se possível
		if(pos!=-1){
			novo=new Basic(id);
			contas[pos]=novo;
			
		}else{
			System.out.println("O ID já está sendo utilizado!");
		}
	}
	
	//Cria a conta XPTO Plus
	void criarContaXPTOPlus(int id){
		int pos, tamanho=contas.lenght;
		Basic novo;
			
		pos=this.analizarId(id);
		//Cria a nova conta se possível
		if(pos!=-1){
			novo=new Plus(id);
			contas[pos]=novo;
			
		}else{
			System.out.println("O ID já está sendo utilizado!");
		}
	}
	
	//Cria a conta XPTO Extreme
	void criarContaXPTOExtreme(int id){
	int pos, tamanho=contas.lenght;
		Basic novo;
			
		pos=this.analizarId(id);
		//Cria a nova conta se possível
		if(pos!=-1){
			novo=new Extreme(id);
			contas[pos]=novo;
			
		}else{
			System.out.println("O ID já está sendo utilizado!");
		}
	}
	
	//Procura a conta pelo id
	Conta procurar(int id){
		int tamanho=contas.lenght;
		//Vai atravessar todo o vetor procurando o id
		for(int i=0; i<tamanho; i++){
			if(contas[i]!=null){
				if(contas[i].idConta()==id){
					return contas[i];
				}
			}
		}
		return null;
	}
	
	void creditar(int id, double valor){
		Conta credito=this.procurar(id);
		if(credito!=null){
			credito.creditar(valor);
		}else{
			System.out.println("Não existe conta com este id!");
		}
	}
	
	void debitar(int id, double valor){
		Conta debito=this.procurar(id);
		if(debito!=null){
			debito.debitar(valor);
		}else{
			System.out.println("Não existe conta com este id!");
		}
	}
}
