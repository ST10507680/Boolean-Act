/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstbooleanactivity;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class FirstBooleanActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Enter First integer value:
        int num1;
        int num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer"));
        
        // Enter Second integer value:
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second integer"));
        
        boolean equal = (num1 == num2);
        boolean notEqual = (num1 != num2);
        boolean greater = (num1 > num2);
        boolean less = (num1 < num2);
        boolean greaterEqual = (num1 >= num2);
        boolean lessEqual = (num1 <= num2);
        
        String output = 
        num1 + " == " + num2 + " : " + equal + "\n" +
        num1 + " != " + num2 + " : " + notEqual + "\n" +
        num1 + " > " + num2 + " : " + greater + "\n" +
        num1 + " < " + num2 + " : " + less + "\n" +
        num1 + " >= " + num2 + " : " + greaterEqual + "\n" +
        num1 + " <= " + num2 + " : " + lessEqual;

        JOptionPane.showMessageDialog(null, output);
        
        
               
    } 
}
