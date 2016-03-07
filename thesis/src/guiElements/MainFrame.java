package guiElements;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import menuItemActionListeners.ImportMenuItenActionListener;

public class MainFrame extends JFrame{
	private JFrame mainFrame;
	private JMenuBar mainMenu;
	
	//menus
	private JMenu newMenu;
		private JMenuItem newMenuImport;
	
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
		newMenuImport = new JMenuItem("Import from file");
		newMenuImport.addActionListener(new ImportMenuItenActionListener());
		newMenu.add(newMenuImport);
		
		mainMenu.add(newMenu);
		mainFrame.add(mainMenu,BorderLayout.NORTH);
	}
	
	
	

}
