package CaculadoraMain;
import javax.swing.JOptionPane;

public class Fatorial {
    static void fatorial(){
        String frase;
        int fat = 1, valor;
                    
        frase = JOptionPane.showInputDialog("Digite o valor do fatorial: ");
        valor = Integer.parseInt(frase);
                    
        for (int i = 2; i <= valor; i++){
            fat *= i;
        }
                    
       JOptionPane.showMessageDialog(null, "O fatorial de " + valor + " é igual a " + fat);  
    }
}
