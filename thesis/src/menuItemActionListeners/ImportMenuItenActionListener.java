package menuItemActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import interfaces.IMenuItemActionListener;
import modules.FileBrowser;

public class ImportMenuItenActionListener implements IMenuItemActionListener{

	JFrame parent;
	
	public ImportMenuItenActionListener() {
		// TODO Auto-generated constructor stub
	}
	
	public ImportMenuItenActionListener(JFrame parent){
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.MOUSE_EVENT_MASK == ActionEvent.MOUSE_EVENT_MASK ){
			FileBrowser fb = new FileBrowser(new JFrame());
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
