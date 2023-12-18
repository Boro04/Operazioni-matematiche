import java.util.Scanner;

public class Operazioni {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
		int a = input.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		int b = input.nextInt();
		System.out.println("La somma dei numeri inseriti vale: " + (a+b));
    }
}
