import javax.swing.JOptionPane;
public class LinearEquation {
    public static void main(String[] Strings){  
        String num1,num2;
        double a,b;
        num1 = JOptionPane.showInputDialog(null, "Please input a:","Input a: ",JOptionPane.INFORMATION_MESSAGE);  
        num2 = JOptionPane.showInputDialog(null, "Please input b:","Input b: ",JOptionPane.INFORMATION_MESSAGE);  
        a = Double.parseDouble(num1);
        b = Double.parseDouble(num2);   
        if(a==0){  
            if(b!=0){
                JOptionPane.showMessageDialog(null, "This equation has no solution.");
            } else{
                JOptionPane.showMessageDialog(null, "This equation has infinitely many solutions.");
            }             
            
        }else{
            double x = (-b)/a;
            JOptionPane.showMessageDialog(null, "The solution is" +x, "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
        }     
    }
}