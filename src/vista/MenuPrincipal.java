package vista;

import java.util.Scanner;
import servicio.BibliotecaService;

public class MenuPrincipal {

    public static void main(String[] args) {

        BibliotecaService b = new BibliotecaService();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- BIBLIOTECA BST ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar por ISBN");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Listar InOrden");
            System.out.println("5. Listar PreOrden");
            System.out.println("6. Listar PostOrden");
            System.out.println("7. Prestar libro");
            System.out.println("8. Devolver libro");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    b.registrarLibro(isbn, titulo, autor);
                }
                case 2 -> {
                    System.out.print("ISBN: ");
                    b.buscarPorISBN(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Autor: ");
                    b.buscarPorAutor(sc.nextLine());
                }
                case 4 -> b.listarInOrden();
                case 5 -> b.listarPreOrden();
                case 6 -> b.listarPostOrden();
                case 7 -> {
                    System.out.print("ISBN: ");
                    b.prestarLibro(sc.nextLine());
                }
                case 8 -> {
                    System.out.print("ISBN: ");
                    b.devolverLibro(sc.nextLine());
                }
            }

        } while (op != 0);

        sc.close();
    }
}