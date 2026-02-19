package servicio;

import estructura.ArbolBST;
import modelo.Libro;

public class BibliotecaService {

    private ArbolBST arbol;

    public BibliotecaService() {
        arbol = new ArbolBST();
    }

    public void registrarLibro(String isbn, String titulo, String autor) {
        arbol.insertar(new Libro(isbn, titulo, autor));
        System.out.println("Libro registrado correctamente.");
    }

    public void buscarPorISBN(String isbn) {
        Libro libro = arbol.buscar(isbn);
        System.out.println(libro != null ? libro : "Libro no encontrado.");
    }

    public void buscarPorAutor(String autor) {
        arbol.buscarPorAutor(autor);
    }

    public void listarInOrden() {
        arbol.inOrden();
    }

    public void listarPreOrden() {
        arbol.preOrden();
    }

    public void listarPostOrden() {
        arbol.postOrden();
    }

    public void prestarLibro(String isbn) {
        Libro libro = arbol.buscar(isbn);
        if (libro == null || !libro.isDisponible()) {
            System.out.println("No disponible.");
            return;
        }
        libro.setDisponible(false);
        System.out.println("Préstamo exitoso.");
    }

    public void devolverLibro(String isbn) {
        Libro libro = arbol.buscar(isbn);
        if (libro == null || libro.isDisponible()) {
            System.out.println("No aplica devolución.");
            return;
        }
        libro.setDisponible(true);
        System.out.println("Devolución exitosa.");
    }
}