package CaculadoraMain;
import javax.swing.JOptionPane;

public class Subtracao {
    static void subtracao(){
        String primeiroNumero, segundoNumero;
        float numero1, numero2, resultado;
        
        primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        numero1 = Float.parseFloat(primeiroNumero);
        
        segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero: ");
        numero2 = Float.parseFloat(segundoNumero);
        
        resultado = numero1 - numero2;
        
        JOptionPane.showMessageDialog(null, "O resultado da subtração é igual a: " + resultado);
    }  
}
