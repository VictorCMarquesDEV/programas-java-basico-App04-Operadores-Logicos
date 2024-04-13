package app004;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int n1 = 4;
		int n2 = 8;
		int a = (n1>n2?n1:n2);
		System.out.println(a);
		
		String nome1 = "Victor";
		String nome2 = "Victor";
		String nome3 = new String("Victor");
		String res;
		res = (nome1.equals(nome2)?"igual":"diferente");
		System.out.println(res);
		res = (nome1.equals(nome3)?"igual":"diferente");
		System.out.println(res);
	}

}
