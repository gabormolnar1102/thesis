package guiElements;

import java.awt.Dimension;

import implementations.CustomButton;

public class CommitButton extends CustomButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommitButton(){
		super();
		init();
	}
	
	public CommitButton(String name){
		super(name);
		init();
	}
	
	
	public void init(){
		setSize(new Dimension(30, 30));
	}
	
}
