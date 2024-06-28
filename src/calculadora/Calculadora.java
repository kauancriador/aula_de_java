/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author caio.alunos
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          // var
        double valor1, valor2, resultado = 0;
        String operacao;
        
        valor1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o primeiro valor"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o segundo valor"));
        operacao = JOptionPane.showInputDialog ("Digite sua operaçao: +, -, *, -");
        
        if(operacao.equals("+")){
        resultado = valor1 + valor2;
        }
        
       else if(operacao.equals("-")){
        resultado = valor1 - valor2;
       }
               
       else if(operacao.equals("/")){
        resultado = valor1 / valor2;
        }
        
      else if( operacao.equals("*")){
        resultado = valor1 * valor2;
        
      }
     //operacao = JOptionPane.showMessageDialog(null, "O resultado e:" + resultado);
     
     JOptionPane.showMessageDialog(null, "O resultado e : " + resultado);
        
        
        
        
        
        
        
        
        
    }
}



