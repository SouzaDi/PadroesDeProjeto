
public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("José Soares");
	    Funcionario atendente = new Atendente("Denise");
	    Funcionario caixa = new Caixa("Camila");
	        
	    gerente.adicionar(atendente);
	    gerente.printNomeDoFuncionario();
	    gerente.adicionar(caixa);
	    gerente.printNomeDoFuncionario();
	    gerente.remover(atendente);
	}
}
