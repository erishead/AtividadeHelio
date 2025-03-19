import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        double litros = 20.0;
        int minutos = 0;

        while (litros > 0) {
            litros -= (0.05 + 0.3 / 60);
            minutos += 30;
        }

        double horas = minutos / 60.0;
        JOptionPane.showMessageDialog(null, "O garrafão ficará vazio em " + horas + " horas.");
    }
}