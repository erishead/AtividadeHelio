import javax.swing.JOptionPane;

public class Ex29 {
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog("Digite uma letra maiúscula:").charAt(0);

        if ("AEIOU".indexOf(letra) != -1) {
            JOptionPane.showMessageDialog(null, "Vogal");
        } else if (Character.isLetter(letra)) {
            JOptionPane.showMessageDialog(null, "Consoante");
        } else {
            JOptionPane.showMessageDialog(null, "Outro");
        }
    }
}