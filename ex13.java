import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Números que atendem a condição:\n");

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                resultado.append(i).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}