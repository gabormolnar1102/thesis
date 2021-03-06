package modules;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import guiElements.CommitButton;
import implementations.CustomButton;

public class ManualInput {
	JTabbedPane parent;
	JPanel content;
	JButton commit;
	JButton edit;
	JTextArea textArea;
		Boolean editable = true;
	

	
	public ManualInput(JTabbedPane parent) {
		this.parent = parent;
		initPanel();
	}


	public void initPanel() {
		content = new JPanel();
		content.setLayout(new BorderLayout());
		textArea = new JTextArea(30, 200);
		JScrollPane scrollpane = new JScrollPane(textArea);
		
		
		textArea.setEditable(editable);
		textArea.setFont(new Font("Serif", Font.BOLD, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		content.add(textArea, BorderLayout.CENTER);
		
		content.add(new CommitButton("almafa gombja"), BorderLayout.LINE_START);
		content.add(new CustomButton("kortefa gombja"), BorderLayout.LINE_END);
		content.add(new JPanel(), BorderLayout.PAGE_START);
		content.add(new JPanel(), BorderLayout.PAGE_END);
		parent.addTab("InputPanel", content);
	}

	
	
}



