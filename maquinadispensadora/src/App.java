import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null,"\n-----------------------------------------\n Bievenido a el sistema ATM \n-----------------------------------------");

        
        String input = JOptionPane.showInputDialog("ingrese la cantidad que sera dispensada");
        int cantidad = Integer.parseInt(input);

        if (cantidad % valor.CincoMil.getValor() != 0) {
            JOptionPane.showMessageDialog(null,
                    "Recuerde que la cantidad debe ser multiplo de 5000 usted puso: " + cantidad);
            return;
        }
     
        JOptionPane.showMessageDialog(null, "    procesando...    ");

        Manejador v100 = new V100k();
        Manejador v50 = new V50k();
        Manejador v20 = new V20k();
        Manejador v10 = new V10k();
        Manejador v5 = new V5k();

        v100.setSiguiente(v50);
        v50.setSiguiente(v20);
        v20.setSiguiente(v10);
        v10.setSiguiente(v5);

        v100.procesar(cantidad);

        JOptionPane.showMessageDialog(null, "    Gracias por preferirnos      ");
         
    }
    
}