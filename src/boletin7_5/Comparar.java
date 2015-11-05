
package boletin7_5;

import javax.swing.JOptionPane;

public class Comparar {
    public int pedirNumero(){
    int num;
    String res = JOptionPane.showInputDialog("teclea numero :");
    num = Integer.parseInt(res);
    return num;
    }
public void Comparar(int num1, int num2, int num3){
  if(num1> num2 && num1> num3)
   JOptionPane.showMessageDialog(null,"é maior = " + num1);
  else if (num1< num2 && num2> num3)
   JOptionPane.showMessageDialog(null, "é maior = " + num2);
  else if (num1< num3 && num2< num3)
  JOptionPane.showMessageDialog(null, "é maior = " + num3);
  
}
}

