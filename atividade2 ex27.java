import javax.swing.JOptionPane;

public class Ex27 {
    public static void main(String[] args) {
        // Entrada de dados
        String nome1 = JOptionPane.showInputDialog("Digite o nome da 1ª pessoa:");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1ª pessoa:"));
        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da 1ª pessoa (m):"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome da 2ª pessoa:");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2ª pessoa:"));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da 2ª pessoa (m):"));

        String nome3 = JOptionPane.showInputDialog("Digite o nome da 3ª pessoa:");
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 3ª pessoa:"));
        double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da 3ª pessoa (m):"));

        // Quem é o mais alto
        String maisAlto = (altura1 > altura2 && altura1 > altura3) ? nome1 :
                          (altura2 > altura1 && altura2 > altura3) ? nome2 : nome3;

        // Quem é o mais baixo
        String maisBaixo = (altura1 < altura2 && altura1 < altura3) ? nome1 :
                           (altura2 < altura1 && altura2 < altura3) ? nome2 : nome3;

        // Altura média do grupo
        double alturaMedia = (altura1 + altura2 + altura3) / 3;

        // Quem é o mais velho
        String maisVelho = (idade1 > idade2 && idade1 > idade3) ? nome1 :
                           (idade2 > idade1 && idade2 > idade3) ? nome2 : nome3;

        // Quem é o mais novo
        String maisNovo = (idade1 < idade2 && idade1 < idade3) ? nome1 :
                          (idade2 < idade1 && idade2 < idade3) ? nome2 : nome3;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, "Mais alto: " + maisAlto +
                                            "\nMais baixo: " + maisBaixo +
                                            "\nAltura média do grupo: " + alturaMedia +
                                            "\nMais velho: " + maisVelho +
                                            "\nMais novo: " + maisNovo);
    }
}