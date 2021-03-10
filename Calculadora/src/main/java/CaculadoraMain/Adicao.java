package CaculadoraMain;
import javax.swing.JOptionPane;

public class Adicao {
    static void adicao(){
        String primeiroNumero, segundoNumero; 
        float numero1, numero2, resultado;
        
        primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        numero1 = Float.parseFloat(primeiroNumero);
        
        segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero: ");
        numero2 = Float.parseFloat(segundoNumero);
        
        resultado = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é igual a: " + resultado);
    }
}
