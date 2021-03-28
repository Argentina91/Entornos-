import java.util.Scanner; 

public class Calculadora{

	public static void mostrarYvalidar(double res)
	{
		System.out.printf("El resultudado de la operación es %.2f \n",res);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduzca el primer número:");
		int operador1  = sc.nextInt();
		
		System.out.printf("Introduzca el segundo número:");
		int operador2  = sc.nextInt();
	
		
	int opcion; 
	double resultado=0;
	Scanner entrada = new Scanner(System.in);

	do{
	
	
	System.out.println("  --> Calculadora <--  ");
	System.out.println("1. Sumar");
	System.out.println("2. Restar");
	System.out.println("3. Multiplicar");
	System.out.println("4. Dividir");
	System.out.println("5. Salir");

	opcion = entrada.nextInt();

	switch(opcion)
	{
		case 1: //Sumar
			resultado=operador1+operador2;
			break;
		case 2: //Restar
			resultado=operador1-operador2;
		case 3: //Multiplicar
			resultado=operador1*operador2;
			break;
		case 4: //Dividir
			resultado=(double)operador1/(double)operador2;
			break;
		case 5: //Salir
			break;
		default: 
			System.out.println("Seleccione una opcion posible (1-5)");
			break;
	}

	if(opcion!=5) mostrarYvalidar(resultado);

	}while(opcion!=5);
	}
}
	
	