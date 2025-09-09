public abstract class Manejoprincipal implements Manejador {
    protected Manejador siguiente;

    @Override
    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    protected void continuar(int cantidad) {
        if (siguiente != null) {
            siguiente.procesar(cantidad);
        } else if (cantidad > 0) {
            System.out.println("\n-----------------------------------------\n la cantidad no pudo ser entregada:\n " + cantidad + "\n-----------------------------------------");
        }
    }
}

