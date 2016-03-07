package guiElements;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame{
	private JFrame mainFrame;
	private JMenuBar mainMenu;
	
	//menus
	private JMenu newMenu;
		private JMenuItem newMenuFirst;
	
	public MainFrame() {
		initFrame();
	}
	
	public void initFrame(){
		mainFrame = new JFrame("thesis");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(new Dimension(1024,768));
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new BorderLayout());
		initMainMenu();
		mainFrame.setVisible(true);
	}
	
	public void initMainMenu(){
		mainMenu = new JMenuBar();
		newMenu = new JMenu("New Project");
		newMenuFirst = new JMenuItem("Import from file");
		//do menuitem stuffs here
		newMenu.add(newMenuFirst);
		mainMenu.add(newMenu);
		mainFrame.add(mainMenu,BorderLayout.NORTH);
	}

}