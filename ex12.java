import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        double soma = 0;

        for (int i = 0; i < 500; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo:"));
            if (num > maior) maior = num;
            if (num < menor) menor = num;
            soma += num;
        }

        double media = soma / 500;
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor + "\nMédia: " + media);
    }
}