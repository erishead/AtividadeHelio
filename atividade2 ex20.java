import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo médio:"));
        double credito;

        if (saldoMedio <= 200) {
            credito = 0;
        } else if (saldoMedio <= 1000) {
            credito = saldoMedio * 0.2;
        } else if (saldoMedio <= 2000) {
            credito = saldoMedio * 0.3;
        } else {
            credito = saldoMedio * 0.4;
        }

        JOptionPane.showMessageDialog(null, "Saldo médio: R$ " + saldoMedio + 
                                      "\nCrédito especial: R$ " + credito);
    }
}