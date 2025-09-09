import javax.swing.JOptionPane;

public class V5k extends Manejoprincipal {
    @Override
    public void procesar(int cantidad) {
        if (cantidad >= valor.CincoMil.getValor()) {
            int num = cantidad / valor.CincoMil.getValor();
            int resto = cantidad % valor.CincoMil.getValor();
            JOptionPane.showMessageDialog(null, "Dispensando " + num + " billete(s) de 5.000");
            continuar(resto);
        } else {
            continuar(cantidad);
        }
    }
}
