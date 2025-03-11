import javax.swing.*;

public class ex7 {
    public static void main(String[] args) {
        float num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        JOptionPane.showMessageDialog(null,"dobro é: "+(num1+num1)+"\n"+"E a terça parte é: " +(num1/3));
    }
}
