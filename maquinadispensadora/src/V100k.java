import javax.swing.JOptionPane;

public class V100k extends Manejoprincipal {
    @Override
    public void procesar(int cantidad) {
        if (cantidad >= valor.CienMil.getValor()) {
            int num = cantidad / valor.CienMil.getValor();
            int resto = cantidad % valor.CienMil.getValor();
             JOptionPane.showMessageDialog(null, "Dispensando " + num + " billete(s) de 100.000");
            continuar(resto);
        } else {
            continuar(cantidad);
        }
    }
}
