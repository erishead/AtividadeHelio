import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
        long fatorial = 1;
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + fatorial);
    }
}