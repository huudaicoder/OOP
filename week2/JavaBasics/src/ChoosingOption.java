import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String[] args) {
		/*String[] options = {"I do", "I don't"};        
        int x = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket? ","Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);*/
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket? ","Click a button",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "You have Chosen:" +(option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}
