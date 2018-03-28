class Sistema{
	Conta[] contas;
	
	Sistema(){
		contas=new Conta[10];
	}
	
	//Caso o vetor esteja cheio, o aumenta e retorna a primeira posição disponível
	int aumentar(){
		//Cria um novo vetor com o dobro do tamanho
		Conta[] novo=new Conta[(contas.length)*2];
		int i;
		//Passa cada valor do vetor velho para o novo
		for(i=0; i<contas.length; i++){
			novo[i]=contas[i];
		}
		contas=novo;
		return i;
	}
	
	//Procura a conta pelo id
	Conta procurar(int id){
		int tamanho=contas.length;
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
	
	//Verifica se o id é válido e retorna a posição caso seja
	int analizarId(int id, int tamanho){
		Conta existe;
		int pos=-1;
		
		//Procura se existe esta conta
		existe=this.procurar(id);
		//Verifica se achou
		if(existe==null){
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
		int pos, tamanho=contas.length;
		Basic novo;
			
		pos=this.analizarId(id, tamanho);
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
		int pos, tamanho=contas.length;
		Plus novo;
			
		pos=this.analizarId(id, tamanho);
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
	int pos, tamanho=contas.length;
		Extreme novo;
			
		pos=this.analizarId(id, tamanho);
		//Cria a nova conta se possível
		if(pos!=-1){
			novo=new Extreme(id);
			contas[pos]=novo;
		}else{
			System.out.println("O ID já está sendo utilizado!");
		}
	}
	
	//Credita o valor na conta do id passado - Sobrecarga e Coerção (Float -> Double)
	void creditar(int id, float valor){
		//Procura se o id existe
		Conta credito=this.procurar(id);
		//Se existir, credita, caso contrário, informa que não existe
		if(credito!=null){
			credito.creditar(valor);
		}else{
			System.out.println("Não existe conta com este id!");
		}
	}
	
	//Debita o valor na conta do id passado - Sobrecarga e Coerção (Float -> Double)
	void debitar(int id, float valor){
		//Procura se o id existe
		Conta debito=this.procurar(id);
		//Se existir, debita, caso contrário, informa que não existe
		if(debito!=null){
			debito.debitar(valor);
		}else{
			System.out.println("Não existe conta com este id!");
		}
	}
	
	//Consulta o saldo da conta do id passado
	double consultarSaldo(int id){
		//Procura se existe a conta
		Conta consulta=this.procurar(id);
		//Se existir, retorna o saldo, caso contrário, retorna infinito
		if(consulta!=null){
			return consulta.saldo;
		}else{
			return Double.POSITIVE_INFINITY;
		}
	}
}
