package _05_popcorn;

import javax.swing.JOptionPane;

import _04_harry_potter.HarryPotter;

public class PopcornMakkerrr {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog(null, "what flavor popcorn would you like?");
		String time = JOptionPane.showInputDialog(null, "how much time wouyld you like to put it in microwave?");
		
		Popcorn popop = new Popcorn(flavor);
	    Microwave endthylifeth = new Microwave();
	    endthylifeth.putInMicrowave(popop);
	    endthylifeth.setTime(10);
	    endthylifeth.startMicrowave();
	}
}
