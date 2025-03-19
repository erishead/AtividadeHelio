import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        int numeroSecreto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser adivinhado:"));
        int tentativas = 0, chute;

        do {
            chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número:"));
            tentativas++;

            if (chute > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Seu número é maior que o meu.");
            } else if (chute < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Seu número é menor que o meu.");
            }

        } while (chute != numeroSecreto);

        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}