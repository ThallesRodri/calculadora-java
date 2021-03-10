package CaculadoraMain;
import javax.swing.JOptionPane;

public class Fibonacci {
    static void fibonacci(){
        String frase;
        int a = 0, b = 1, numSequencia;
                    
        frase = JOptionPane.showInputDialog("Digite o numero da sequencia: ");
        numSequencia = Integer.parseInt(frase);
                    
        for(int i = 0; i <= numSequencia; i++){
            b += a;
            a = b - a;
            JOptionPane.showMessageDialog(null, a + " ");
        }
    }
}
