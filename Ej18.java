package guias;

public class Ej18 {

	public static void main(String[] args) {
		//visualizar la cuenta de num q son mult de 2 o de 3 que hay hasta el 100
		int a=0;
		int b=0;
		int conta=0;
		int contb=0;
		while (a<=100){ //contador de multiplo de 2
			a=a+2;
			conta=conta+1;
		}
		while (b<=100){ //contador de multiplo de 3
			b=b+3;
			contb=contb+1;
		}
		System.out.println("Hay "+conta+" numeros multiplos de 2 entre 0 y 100");
		System.out.println("Hay "+contb+" numeros multiplos de 3 entre 0 y 100");

	}

}
