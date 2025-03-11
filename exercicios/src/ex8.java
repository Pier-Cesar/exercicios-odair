import javax.swing.*;

public class ex8 {
    public static void main(String[]args){
        float num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma distancia em metros"));
        JOptionPane.showMessageDialog(null,"Sua distancia em Km : "+(num1/1000)+"\n"+"Sua distancia em Hm : "+(num1/100)+"\n"+"Sua distancia em Dam : "+(num1/10)+"\n"+"Sua distancia em dm : "+(num1*10)+"\n"+"Sua distancia em cm : "+(num1*100)+"\n"+"Sua distancia em mm : "+(num1*1000));
    }
}