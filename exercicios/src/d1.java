import javax.swing.*;

public class d1 {
    public static void main(String[] args) {
        float c = Integer.parseInt(JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?"));
        float d = Integer.parseInt(JOptionPane.showInputDialog("A quantos anos você fuma?"));
        String r = String.format("%.2f",(c/144)*(d*365));
        JOptionPane.showMessageDialog(null,"Você perdeu "+ r +" dias de vida");
    }
}
