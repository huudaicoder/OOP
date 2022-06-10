import javax.swing.JOptionPane; 
public class QuadraticEquation {
    public static void main(String[] Strings){  
        String num1,num2,num3;
        double a,b,c;
        num1 = JOptionPane.showInputDialog(null, "Please input a:","Input a: ",JOptionPane.INFORMATION_MESSAGE);  
        num2 = JOptionPane.showInputDialog(null, "Please input b:","Input b: ",JOptionPane.INFORMATION_MESSAGE);  
        num3 = JOptionPane.showInputDialog(null, "Please input c:","Input c: ",JOptionPane.INFORMATION_MESSAGE);  
        a = Double.parseDouble(num1);
        b = Double.parseDouble(num2);
        c = Double.parseDouble(num3);
        double del= b * b - 4.0 * a * c;  
        if(a==0){
            JOptionPane.showMessageDialog(null, "This equation is not quadratic equation.");
            if(b==0){                
                if(c!=0){
                    JOptionPane.showMessageDialog(null, "This equation has no solution.");
                } else{
                    JOptionPane.showMessageDialog(null, "This equation has infinitely many solutions.");
                }     
            }else{
                double r = (-c)/b;
                JOptionPane.showMessageDialog(null, "The solution is" +r, "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (del> 0.0){  
            double r1 = (-b + Math.pow(del, 0.5)) / (2.0 * a);  
            double r2 = (-b - Math.pow(del, 0.5)) / (2.0 * a);  
            JOptionPane.showMessageDialog(null, "The solutions are " + r1 + " and " + r2, "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
        } else if (del == 0.0) {  
            double r1 = -b / (2.0 * a);  
            JOptionPane.showMessageDialog(null, "The solution is" +r1, "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
        } else {  
            JOptionPane.showMessageDialog(null, "This equation has no soltion.");                         
        }  
    }  
    
}
