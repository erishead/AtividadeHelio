import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Números perfeitos:\n");
        int encontrados = 0, num = 1;

        while (encontrados < 5) {
            int soma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) soma += i;
            }
            if (soma == num) {
                resultado.append(num).append("\n");
                encontrados++;
            }
            num++;
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}