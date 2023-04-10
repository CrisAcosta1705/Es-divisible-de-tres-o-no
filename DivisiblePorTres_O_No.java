package DivisiblePorTres_O_No;
import java.util.Scanner;
public class DivisiblePorTres_O_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = tc.nextInt();

        if (numero % 3 == 0) {
            System.out.println("El número ingresado es divisible por 3.");
        } else {
            System.out.println("El número ingresado NO es divisible por 3.");
        }
	}

}
