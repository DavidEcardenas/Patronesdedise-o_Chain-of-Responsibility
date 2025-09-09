import javax.swing.JOptionPane;

public class V10k extends Manejoprincipal {
      @Override
        public void procesar(int cantidad) {
              if (cantidad >= valor.DiezMil.getValor()) {
            int num = cantidad / valor.DiezMil.getValor();
            int resto = cantidad % valor.DiezMil.getValor();
             JOptionPane.showMessageDialog(null, "Dispensando " + num + " billete(s) de 10.000");
            continuar(resto);
        } else {
            continuar(cantidad);
        }
    }
}