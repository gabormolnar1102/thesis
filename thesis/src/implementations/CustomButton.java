package implementations;

import java.awt.Dimension;

import javax.swing.JButton;

import interfaces.ICustomButtonInterface;

public class CustomButton extends JButton implements ICustomButtonInterface{

	public CustomButton(){
		super();
	}
	
	public CustomButton(String name){
		super(name);
	}
	
}
