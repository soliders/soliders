import java.awt.event.*;
import javax.swing.JOptionPane;

public class MouseListener implements ActionListener{
	
	
	
	public void actionPerformed(ActionEvent e){
		
		JOptionPane.showMessageDialog(null, "如需帮助，请联系wqk.         tel:123456","about help", JOptionPane.PLAIN_MESSAGE);
		
	}
	
}