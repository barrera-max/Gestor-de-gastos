import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, op;
        ListaCompras lista = new ListaCompras();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("=== MENU ===");
            System.out.println("1.Cargar los gastos");
            System.out.println("2.Mostrar los gastos");
            System.out.println("3.Reemplazar importe de gasto");
            System.out.println("4.Gasto total por mes y sucursal");
            System.out.println("\n ELIJA UNA OPCION:");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad de registros a cargar: ");
                    n = teclado.nextInt();
                    lista.setLista(n);
                    lista.generate();
                    break;
                case 2:
                    lista.ordenar();
                    lista.mostrarLista();
                    break;
                case 3:
                    System.out.print("Ingrese el codigo del gasto a buscar: ");
                    int c = teclado.nextInt();
                    lista.search(c);
                    break;
                case 4:
                    lista.compraMesSuc();
                    break;
                case 0:
                    ;
                default:
                    System.out.println("Opcion no valida...");
            }
        }
        while (op != 0);
    }
}
