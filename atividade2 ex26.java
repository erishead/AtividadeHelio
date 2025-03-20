import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args) {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a1:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b1:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c1:"));

        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a2:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b2:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c2:"));

        double det = a1 * b2 - a2 * b1;

        if (det == 0) {
            JOptionPane.showMessageDialog(null, "As retas são paralelas e não se intersectam.");
        } else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            JOptionPane.showMessageDialog(null, "O ponto de interseção é: (" + x + ", " + y + ")");
        }
    }
}