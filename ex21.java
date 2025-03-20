import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo (91-Gerente, 92-Analista, 93-Técnico):"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual:"));
        double percentual;

        switch (codigo) {
            case 91: percentual = 0.10; break;
            case 92: percentual = 0.20; break;
            case 93: percentual = 0.30; break;
            default: percentual = 0.355; break;
        }

        double novoSalario = salario * (1 + percentual);
        double diferenca = novoSalario - salario;

        JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + salario +
                                      "\nNovo salário: R$ " + novoSalario +
                                      "\nDiferença: R$ " + diferenca);
    }
}