import javax.swing.JOptionPane;

public class Exercicio19 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        StringBuilder resultado = new StringBuilder("Sequência de Fibonacci:\n1 1 ");

        for (int i = 3; i <= 15; i++) {
            int proximo = a + b;
            resultado.append(proximo).append(" ");
            a = b;
            b = proximo;
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}