public enum valor {
    
    CienMil(100000),
    CincuentaMil(50000),
    VeinteMil(20000),
    DiezMil(10000),
    CincoMil(5000);

    private final int valor;

    valor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
