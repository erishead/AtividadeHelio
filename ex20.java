import javax.swing.JOptionPane;

public class Exercicio20 {
    public static void main(String[] args) {
        int votosFirmino = 0, votosEugenia = 0, votosBranco = 0, votosNulos = 0;
        int voto;

        do {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto (1: Firmino, 2: Eugênia, 0: Branco, 9: Nulo, -1 para sair):"));
            if (voto == 1) votosFirmino++;
            else if (voto == 2) votosEugenia++;
            else if (voto == 0) votosBranco++;
            else if (voto == 9) votosNulos++;
        } while (voto != -1);

        JOptionPane.showMessageDialog(null, "Vencedor: " + (votosFirmino > votosEugenia ? "Firmino" : "Eugênia") + 
                                            "\nBrancos: " + votosBranco + 
                                            "\nNulos: " + votosNulos);
    }
}