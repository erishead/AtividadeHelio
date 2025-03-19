import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        int negativos = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if (num < 0) {
                negativos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de números negativos: " + negativos);
    }
}