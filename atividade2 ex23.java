import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 8;

        if (x > y) {
            z = x - y;
        } else {
            if (x == y) {
                z = x + y;
            } else {
                x = y + z;
            }
        }

        JOptionPane.showMessageDialog(null, "O valor de X é: " + x +
                                      "\nO valor de Y é: " + y +
                                      "\nO valor de Z é: " + z);
    }
}