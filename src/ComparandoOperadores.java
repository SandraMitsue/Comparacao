import java.util.Scanner;

public class ComparandoOperadores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Entre com o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Entre com o segundo número: ");
        numero2 = input.nextInt();
        
        if (numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);
    }


}