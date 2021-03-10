package CaculadoraMain;
import javax.swing.JOptionPane;

public class Divisao {
    static void divisao(){
        String primeiroNumero, segundoNumero; 
        float numero1, numero2, resultado;
        
        primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        numero1 = Float.parseFloat(primeiroNumero);
                    
        segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero: ");
        numero2 = Float.parseFloat(segundoNumero);
           
        //Verificacao de tentativa de divisao por zero
        if(numero2 == 0){
            JOptionPane.showMessageDialog(null, "Impossivel dividir por zero!");
        }else{
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é igual a: " + resultado);
        }                                        
    }
}
