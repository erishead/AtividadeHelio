import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação:"));
        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota V1:"));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota V2:"));
        double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota V3:"));
        double me = Double.parseDouble(JOptionPane.showInputDialog("Digite a média dos exercícios:"));

        double ma = (v1 + 2*v2 + 3*v3 + me) / 7;
        String conceito;

        if (ma >= 9) conceito = "A";
        else if (ma >= 7.5) conceito = "B";
        else if (ma >= 6) conceito = "C";
        else if (ma >= 4) conceito = "D";
        else conceito = "E";

        String status = (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) ? "APROVADO" : "REPROVADO";

        JOptionPane.showMessageDialog(null, "Número do aluno: " + id +
                                      "\nMédia de aproveitamento: " + ma +
                                      "\nConceito: " + conceito +
                                      "\nSituação: " + status);
    }
}