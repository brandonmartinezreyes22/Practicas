import java.util.Scanner;

public class Factorial {

    public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        teclado.close();
        System.out.println("\nEl factorial de " + numero + "!" + " es: " + factorial(numero));
    }
    
}