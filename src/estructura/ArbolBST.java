package estructura;

import modelo.Libro;

public class ArbolBST {

    private NodoBST raiz;

    public ArbolBST() {
        raiz = null;
    }

    // INSERTAR
    public void insertar(Libro libro) {
        raiz = insertarRec(raiz, libro);
    }

    private NodoBST insertarRec(NodoBST actual, Libro libro) {
        if (actual == null) {
            return new NodoBST(libro);
        }

        if (libro.compareTo(actual.libro) < 0) {
            actual.izquierdo = insertarRec(actual.izquierdo, libro);
        } else if (libro.compareTo(actual.libro) > 0) {
            actual.derecho = insertarRec(actual.derecho, libro);
        }

        return actual;
    }

    // BUSCAR POR ISBN
    public Libro buscar(String isbn) {
        return buscarRec(raiz, isbn);
    }

    private Libro buscarRec(NodoBST actual, String isbn) {
        if (actual == null) return null;

        if (actual.libro.getIsbn().equals(isbn)) {
            return actual.libro;
        }

        if (isbn.compareTo(actual.libro.getIsbn()) < 0) {
            return buscarRec(actual.izquierdo, isbn);
        } else {
            return buscarRec(actual.derecho, isbn);
        }
    }

    // BUSCAR POR AUTOR
    public void buscarPorAutor(String autor) {
        buscarAutorRec(raiz, autor);
    }

    private void buscarAutorRec(NodoBST actual, String autor) {
        if (actual != null) {
            buscarAutorRec(actual.izquierdo, autor);

            if (actual.libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(actual.libro);
            }

            buscarAutorRec(actual.derecho, autor);
        }
    }

    // RECORRIDOS
    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoBST actual) {
        if (actual != null) {
            inOrdenRec(actual.izquierdo);
            System.out.println(actual.libro);
            inOrdenRec(actual.derecho);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(NodoBST actual) {
        if (actual != null) {
            System.out.println(actual.libro);
            preOrdenRec(actual.izquierdo);
            preOrdenRec(actual.derecho);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
    }

    private void postOrdenRec(NodoBST actual) {
        if (actual != null) {
            postOrdenRec(actual.izquierdo);
            postOrdenRec(actual.derecho);
            System.out.println(actual.libro);
        }
    }
}
