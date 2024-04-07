package exampractice;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exampractice {

	public static void main(String[] args) {
		int dayNum = -1;
		 
		 do{
			 dayNum = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the number"));
			 String dayName = " ";
			 try {
				 switch (dayNum) {
		 
				 case 0 : dayName = "Monday"; break;	
				 case 1 : dayName = "Tuesday"; break;
				 case 2 : dayName = "Wendsday"; break;
				 case 3 : dayName = "Thursday"; break;
				 case 4 : dayName = "Friday"; break;
				 case 5 : dayName = "Saterday"; break;
				 case 6 : dayName ="Sunday"; break;		
				 }
				 if(dayNum >-1 && dayNum < 7)
					 JOptionPane.showMessageDialog(null, "today is " + dayName);
			 }
		 
		 catch (Exception e) {
			 
			
		}
			 if (!(dayNum>-1 && dayNum<7)) // ( day <= -1 || day >=7)
					JOptionPane.showMessageDialog(null, "not matched. Please Enter a number!");
		 }
	
		 while(dayNum >-1 && dayNum <7);		
		
}
}

