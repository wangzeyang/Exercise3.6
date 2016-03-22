import java.awt.Component;

import javax.swing.JOptionPane;

public class exercise {
    public static void main (String []args){
    	int answer;
    	String [] month	=	{"1","2","3","4","5","6","7","8","9","10","11","12"};
    	
    	String s5=(String)JOptionPane.showInputDialog(null,"select the month","type",JOptionPane.QUESTION_MESSAGE,null,month,month[11]);

    	while(s5!=null){
        	
        	switch(s5){
        case("12"):
        	 
        JOptionPane.showMessageDialog(null,"Do you want to built snow man");
        break;
        case("1"):
            JOptionPane.showMessageDialog(null,"Do you want to built snow man");
        break;
        case("2"):
            JOptionPane.showMessageDialog(null,"Do you want to built snow man");
        break;
        case("3"):
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
        break;
        case("4"):
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
        break;
        case("5"):
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
        break;
        case("6"):
            JOptionPane.showMessageDialog(null," It’s a summer time.");
        break;
        case("7"):
            JOptionPane.showMessageDialog(null," It’s a summer time.");
        break;
        case("8"):
            JOptionPane.showMessageDialog(null," It’s a summer time.");
        break;
        case("9"):
            JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
        break;
        case("10"):
            JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
        break;
        case("11"):
            JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");}
        	s5=(String)JOptionPane.showInputDialog(null,"select the month","type",JOptionPane.QUESTION_MESSAGE,null,month,month[11]);

      }
    	
    	JOptionPane.showMessageDialog(null, "goodbye");
        }

}
