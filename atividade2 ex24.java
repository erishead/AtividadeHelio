import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y:"));

        if (2*x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + "," + y + ") pertence à reta.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + "," + y + ") NÃO pertence à reta.");
        }
    }
}