import javax.swing.JOptionPane;

public class Ex30 {
    public static void main(String[] args) {
        // Tabela de preços dos refrigerantes
        double[][] precos = {
            {1.50, 1.70}, // Meia-Cola (Normal, Diet)
            {1.60, 1.70}, // Limonax (Normal, Diet)
            {1.40, 1.45}  // Orange (Normal, Diet)
        };

        // Entrada de dados
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do refrigerante (1-Meia-Cola, 2-Limonax, 3-Orange):"));
        char tipo = JOptionPane.showInputDialog("Digite o tipo (N para Normal, D para Diet):").toUpperCase().charAt(0);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:"));

        // Verificação de código válido
        if (codigo < 1 || codigo > 3 || (tipo != 'N' && tipo != 'D')) {
            JOptionPane.showMessageDialog(null, "Código ou tipo inválido!");
            return;
        }

        // Definir índice do tipo (0 = Normal, 1 = Diet)
        int indiceTipo = (tipo == 'N') ? 0 : 1;

        // Calcular o valor total
        double valorTotal = precos[codigo - 1][indiceTipo] * quantidade;

        // Aplicar desconto de 5% se o valor for maior que R$100,00
        if (valorTotal > 100.00) {
            valorTotal *= 0.95;
        }

        // Exibir resultado
        JOptionPane.showMessageDialog(null, "Valor total da compra: R$ " + String.format("%.2f", valorTotal));
    }
}