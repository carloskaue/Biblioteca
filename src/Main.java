import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in );
        Interface inteface = new Interface ();
        int indice =-1;

        while(indice != 0) {
            inteface.exibirMenu ( );
            indice = teclado.nextInt ( );
            teclado.nextLine ( );
            inteface.MenuLista (indice);

            System.out.println ("Pressione Enter para continuar...");
            teclado.nextLine ( );
        }
    }
}
