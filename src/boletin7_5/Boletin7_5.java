
package boletin7_5;
/**
 *
 * @author igonzalezcastro
 */
public class Boletin7_5 {

    public static void main(String[] args) {
   int num1;
   int num2;
   int num3;
   Comparar obx = new Comparar();
   num1 = obx.pedirNumero();
   num2 = obx.pedirNumero();
   num3 = obx.pedirNumero();
   obx.Comparar(num1, num2, num3);
    }
    
}
