package menuItemActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

import interfaces.IMenuItemActionListener;
import modules.ManualInput;

public class FromFieldMenuItemActionListener implements IMenuItemActionListener {
	public JTabbedPane parent;

	public FromFieldMenuItemActionListener(JTabbedPane parent){
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.MOUSE_EVENT_MASK == ActionEvent.MOUSE_EVENT_MASK ){
			ManualInput mip = new ManualInput(parent);
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
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
