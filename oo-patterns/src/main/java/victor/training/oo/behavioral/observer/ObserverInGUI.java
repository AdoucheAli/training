package victor.training.oo.behavioral.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import victor.training.oo.structural.composite.MyFrame;

public class ObserverInGUI {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		
		// SOLUTION(
		// polymorphic assignment - refer o implementare concreta printr-o interfata pe care o implementeaza
		ActionListener actionListener = new MyButtonActionListener();
		
		myFrame.button1.addActionListener(actionListener);
		// SOLUTION)
		//TODO myFrame.button1.addActionListener(actionListener);
	}
}

class MyButtonActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Button clicked");
	}

}

