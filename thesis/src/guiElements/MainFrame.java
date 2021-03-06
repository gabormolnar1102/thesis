package guiElements;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import menuItemActionListeners.FromFieldMenuItemActionListener;
import menuItemActionListeners.ImportMenuItenActionListener;

public class MainFrame extends JFrame{
	public JFrame mainFrame;
	public JMenuBar mainMenu;
	public JTabbedPane pane;
	public BorderLayout layoutManager;
	
	//menus
	public JMenu newMenu;
		public JMenuItem newMenuImport;
		public JMenuItem newMenuFromField;
	
	public MainFrame() {
		initFrame();
	}
	
	public void initFrame(){
		mainFrame = new JFrame("thesis");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(new Dimension(1024,768));
		mainFrame.setLocationRelativeTo(null);
		layoutManager = new BorderLayout();
		mainFrame.setLayout(layoutManager);
		initMainContentPlaceHolder();
		initMainMenu();
		mainFrame.setVisible(true);
	}
	
	public void initMainContentPlaceHolder() {
		this.pane = new JTabbedPane();
		mainFrame.add(pane, BorderLayout.CENTER);	
	}

	public void initMainMenu(){
		mainMenu = new JMenuBar();
		newMenu = new JMenu("New Project");
		
		//from file
		newMenuFromField = new JMenuItem("Import from file");
		newMenuFromField.addActionListener(new ImportMenuItenActionListener(mainFrame));
		newMenu.add(newMenuFromField);
		
		//from field area 
		newMenuImport = new JMenuItem("Direkt from imput");
		newMenuImport.addActionListener(new FromFieldMenuItemActionListener(pane));
		newMenu.add(newMenuImport);
		
		mainMenu.add(newMenu);
		mainFrame.add(mainMenu,BorderLayout.NORTH);
	}
	
	
	

}
