import javax.swing.JOptionPane;

public class V50k extends Manejoprincipal {
    @Override
    public void procesar(int cantidad) {
        if (cantidad >= valor.CincuentaMil.getValor()) {
            int num = cantidad / valor.CincuentaMil.getValor();
            int resto = cantidad % valor.CincuentaMil.getValor();
             JOptionPane.showMessageDialog(null, "Dispensando " + num + " billete(s) de 50.000");
            continuar(resto);
        } else {
            continuar(cantidad);
        }
    }
}
