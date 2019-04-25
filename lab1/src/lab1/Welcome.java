package lab1;

import javax.swing.*;

public class Welcome {
	
	public static void main (String[] args) {
		System.out.println("Hello World");
	    System.out.println("Please bring your laptop every Java lesson!");
	    
	    JOptionPane.showMessageDialog(null, "Welcome DCPE 3A/B...all of you!\nDon't be late");
        JOptionPane.showMessageDialog(null, "Have you finished dowloading IDE?");
        // below is another way to display message with more customized info
        //   JOptionPane.showMessageDialog(null, "Hello", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        //   System.out.print("The info message value: "+JOptionPane.INFORMATION_MESSAGE);
       
        // System.out.println(100);
        // System.out.println(200);
     
        System.exit(0);/* needed for JOptionPane.showMessageDialog to release resource when Exit the program */

	}
	
		

}
