import javax.swing.JOptionPane;

public class Ex28 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (n == (30 + 25) * (30 + 25)) {
            JOptionPane.showMessageDialog(null, "O número possui essa característica!");
        } else {
            JOptionPane.showMessageDialog(null, "O número NÃO possui essa característica.");
        }
    }
}