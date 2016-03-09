package modules;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class FileBrowser extends JFrame{
	JFrame frame;
	JFileChooser fileChooser;
	JButton openButton;
	
	  public FileBrowser(JFrame parent) {
		  	this.frame = parent;
		    fileChooser  = new JFileChooser();
		    fileChooser.setDialogTitle("Browser");
		    parent.getContentPane().add(fileChooser);
		    parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fileChooser.setVisible(true);
		    parent.pack();
		    parent.setVisible(true);
	  }
	  
	  //not working jet
	  public void openFile(){
		  openButton = new JButton("Open file");
		  openButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showOpenDialog(frame);
	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	               java.io.File file = fileChooser.getSelectedFile();
	               System.out.println("File Selected :" 
	               + file.getName());
	            }
	            else{
	               System.out.println("Open command cancelled by user." );           
	            }      
	         }
		});
		  
	  }

}