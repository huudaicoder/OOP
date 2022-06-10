import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main(String[] Strings){  
        String num1,num2,num3,num4,num5,num6;
        double a11,a12,b1,a21,a22,b2;
        num1 = JOptionPane.showInputDialog(null, "Please input a11:","Input a11: ",JOptionPane.INFORMATION_MESSAGE);  
        num2 = JOptionPane.showInputDialog(null, "Please input a12:","Input a12: ",JOptionPane.INFORMATION_MESSAGE);  
        num3 = JOptionPane.showInputDialog(null, "Please input b1:","Input b1: ",JOptionPane.INFORMATION_MESSAGE);
        num4 = JOptionPane.showInputDialog(null, "Please input a21:","Input a21: ",JOptionPane.INFORMATION_MESSAGE); 
        num5 = JOptionPane.showInputDialog(null, "Please input a22:","Input a22: ",JOptionPane.INFORMATION_MESSAGE); 
        num6 = JOptionPane.showInputDialog(null, "Please input b2:","Input b2: ",JOptionPane.INFORMATION_MESSAGE); 
        a11 = Double.parseDouble(num1);
        a12 = Double.parseDouble(num2);
        b1 = Double.parseDouble(num3);
        a21 = Double.parseDouble(num4);
        a22 = Double.parseDouble(num5);
        b2 = Double.parseDouble(num6);
        double d = a11 * a22 - a12 * a21;
        double d1= b1 * a22 - b2 * a12;
        double d2= a11 * b2 - a21 * b1;
        if (d != 0.0){  
            double r1 = d1 / d;  
            double r2 = d2 / d;  
            JOptionPane.showMessageDialog(null, "The system has a unique solution (x1,x2) = "+ "("+ r1 +"," + r2 + ")", "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
        } else if (d == 0.0 && d1==0.0 && d2==0.0) {               
            JOptionPane.showMessageDialog(null, "The system has infinitely many solutions", "Show the solution: ", JOptionPane.INFORMATION_MESSAGE);
        } else {  
            JOptionPane.showMessageDialog(null, "The system has no solution");                         
        }  
    } 
     
}
