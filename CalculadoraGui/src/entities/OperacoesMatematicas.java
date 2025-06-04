package entities;

public class OperacoesMatematicas {
	private static Double primeiroValor;
	private static Double segundoValor;
	private static Double result;
	private static boolean verif;
	
	public OperacoesMatematicas() {}
	

	public static void retornaValorVisor(Double var1) {
		primeiroValor = var1;
	}
	
	public static void retornaValorVisorIgual(Double var2) {
		segundoValor = var2;
	}
	
		
	public static boolean verificaSeTemResto() {
		 verif = result%1 == 0;
		 return verif;
	}
	
	public static  double igual(String operacao) {
		
		switch (operacao) {
		case "+": {
			return result = primeiroValor + segundoValor;			
		}case "-":{
			return result = primeiroValor - segundoValor;
		}case "*":{
			return result = primeiroValor * segundoValor;
		}case "/":{
			return result = primeiroValor / segundoValor;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacao);
		}
		
	}
	
	
	

	
	
	
	
	
	
}
