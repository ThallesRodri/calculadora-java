package CaculadoraMain;
import javax.swing.JOptionPane;

/*
 *Calculadora que realiza operações matemáticas básicas, Fibonacci e Fatorial;
 *Ela impede que o usuário faça divisões por zero.
*/
public class CalculadoraMenu {
    public static void main(String args[]){
        String mensagem; //Variaveis para exibir mensagem na caixa de dialogo
        int escolha; //Variavel para opções
        
        JOptionPane.showMessageDialog(null, "------ Calculadora de Operações Básicas ------\n");
         
        do{                     
            mensagem = JOptionPane.showInputDialog("\nOpcoes: \n1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n5 - Calculo de Fibonacci\n6 - Calculo de fatorial\n7 - Sair\nEscolha a operaco desejada:  ");
            escolha = Integer.parseInt(mensagem);
            
            switch(escolha){
                
                case 1:
                    Adicao.adicao();                    
                    break;
                
                case 2:
                    Subtracao.subtracao();
                    break;
                
                case 3:
                    Divisao.divisao();
                    break;
                
                case 4:
                    Multiplicacao.multiplicacao();
                    break;
                    
                case 5:
                    Fibonacci.fibonacci();
                    break;
                
                case 6:
                    Fatorial.fatorial();
                    break;
                    
                case 7: JOptionPane.showMessageDialog(null, "saindo... "); break;
            }
        }while(escolha < 7);
    }
}
