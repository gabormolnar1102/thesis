package modules;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ManualInputTab {
	JTabbedPane parent;
	JPanel content;
	

	
	public ManualInputTab(JTabbedPane parent) {
		this.parent = parent;
		initPanel();
	}


	public void initPanel() {
		content = new JPanel();
		content.add(new JButton("Almafa gombja"));
		parent.getName();
		parent.addTab("Almafa", content);
	}
	
	
	
}