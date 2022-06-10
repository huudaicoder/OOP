import javax.swing.JOptionPane;
public class Twodoublenumber {
    public static void main(String[] args){
        String strNum1,strNum2;
        double num1,num2,sum,pro,dif,quo;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first numer:","Input the first number: ",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second numer:","Input the second number: ",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        sum = num1 + num2;
        pro = num1 * num2;
        dif = num1 - num2;
        quo = num1 / num2;
        JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe product is: " + pro + "\nThe Difference is: " + dif + "\nThe Quotient is: " + quo,"Some caculation of two double number", JOptionPane.INFORMATION_MESSAGE);
    }
}
