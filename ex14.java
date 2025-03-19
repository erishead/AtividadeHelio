import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double somaMulheres = 0, somaTotal = 0;
        int contMulheres = 0;

        for (int i = 0; i < 50; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").toUpperCase().charAt(0);

            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;

            if (sexo == 'F') {
                somaMulheres += altura;
                contMulheres++;
            }
            
            somaTotal += altura;
        }

        double mediaMulheres = (contMulheres > 0) ? somaMulheres / contMulheres : 0;
        double mediaTurma = somaTotal / 50;

        JOptionPane.showMessageDialog(null, "Maior altura: " + maiorAltura + 
                                            "\nMenor altura: " + menorAltura + 
                                            "\nMédia altura das mulheres: " + mediaMulheres + 
                                            "\nMédia geral: " + mediaTurma);
    }
}