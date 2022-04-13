package modelagem;

public class Inteiro {
	private int inteiro;
	
	public Inteiro(int inteiro) {
		this.inteiro = inteiro;
	}
	
	public String antesuc() {
		return "O antecessor de " + this.inteiro + " é " + (this.inteiro - 1) + " e seu sucessor " + (this.inteiro + 1);
	}
}
