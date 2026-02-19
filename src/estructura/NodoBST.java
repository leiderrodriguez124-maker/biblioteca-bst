package estructura;

import modelo.Libro;

public class NodoBST {

    Libro libro;
    NodoBST izquierdo;
    NodoBST derecho;

    public NodoBST(Libro libro) {
        this.libro = libro;
        this.izquierdo = null;
        this.derecho = null;
    }
}
