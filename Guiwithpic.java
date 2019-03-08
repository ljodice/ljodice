package independentstud;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Guiwithpic {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			String[] firstname= {"ben","Steve", "Cooper", "Sven", "Luke", "Ian", "Josh", "rich" ,"John"};
			String[] lastname= {"Cohen", "Hughes", "Warren", "Gonzalez","Anderson","Rodriguez", "Walker", "Hill","Davis","Williams"};
			JFrame frame = new JFrame("Randomname Gen");  
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());  
	        JLabel label = new JLabel("The random name gen");
	        JLabel firstnam = new JLabel("First Name:");
	        JTextField first = new JTextField("");
	        JLabel lastnam = new JLabel("Last name:");
	        JTextField last = new JTextField("");
	        JButton button = new JButton();  
	        button.setText("Generate");
	       
	        panel.add(label);
	        panel.add(firstnam);
	        panel.add(first);
	        panel.add(lastnam);
	        panel.add(last);
	        panel.add(button);
	        frame.add(panel);  
	        frame.setSize(300, 100);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true); 
	        button.addActionListener(new ActionListener(){  
	        	public void actionPerformed(ActionEvent e){  
	        	            first.setText(firstname[(int)(Math.random()*10)]); 
	        	            last.setText(lastname[(int)(Math.random()*10)]);
	        	          
	        		        
	        	        }  
	        	    });  

	    }  


	}
