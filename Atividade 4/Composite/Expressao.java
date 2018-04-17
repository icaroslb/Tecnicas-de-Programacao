abstract class Expressao implements Calculo{
	Calculo x, y;

	void inserir(Calculo x, Calculo y){
		this.x=x;
		this.y=y;
	}
}
