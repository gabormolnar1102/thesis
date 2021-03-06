package modules;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class FileBrowser extends JFrame{

	private static final long serialVersionUID = -3079552785012971826L;
	JFrame frame;
	JFileChooser fileChooser;
	JButton openButton;
	String path="";
	String fileStr;
	
	  public FileBrowser(JFrame parent) {
		  	this.frame = parent;
		    fileChooser  = new JFileChooser();
		    fileChooser.setDialogTitle("Browser");
		    parent.getContentPane().add(fileChooser);
		    parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fileChooser.setVisible(true);
		    
		    fileChooser.setCurrentDirectory(new File("."));
		    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		    fileChooser.setAcceptAllFileFilterUsed(false);
		    
		    if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
		    	path=fileChooser.getCurrentDirectory().getAbsolutePath();
		    	fileStr=fileChooser.getSelectedFile().getAbsolutePath();
		    }
		    
		    System.out.println("utam1: " + path);
		    System.out.println("utam2: " + fileStr);
		    
		    parent.pack();
		    parent.setVisible(true);
		    frame.dispose();
	  }  
}
