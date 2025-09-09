import javax.swing.JOptionPane;

public class V20k extends Manejoprincipal {
    @Override
    public void procesar(int cantidad) {
        if (cantidad >= valor.VeinteMil.getValor()) {
            int num = cantidad / valor.VeinteMil.getValor();
            int resto = cantidad % valor.VeinteMil.getValor();
            JOptionPane.showMessageDialog(null, "Dispensando " + num + " billete(s) de 20.000");
            continuar(resto);
        } else {
            continuar(cantidad);
        }
    }
}
