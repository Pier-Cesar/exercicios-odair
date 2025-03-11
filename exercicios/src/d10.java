import javax.swing.JOptionPane;
public class d10 {
    static d8 b = new d8();
    public  static String sequence(int a ){
        String awnser = "";
        for (int i = 0; i <= a; i++) {
            awnser+=" >> "+ d8.fibonacci(i);
        }
        return awnser+=" FIM";
    }
    public static void main(String[] args) {
        int r = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade da sequência:"));
        JOptionPane.showMessageDialog(null,
                sequence(r),"Fibonacci",1);
    }
}
