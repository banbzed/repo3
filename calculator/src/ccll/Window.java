package ccll;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Window {
	public void window() {
		JFrame frame=new JFrame();
		frame.setTitle("¼ÆËãÆ÷");
		frame.setSize(505,640);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf=new JTextField(50);
		tf.setSize(480,180);
		tf.setBounds(10,10,480,180);
		tf.setFont(new Font("ºÚÌå",Font.PLAIN,50));
		tf.setEditable(false);
		JButton btn1=new JButton("7");
		btn1.setSize(80,80);
		btn1.setBounds(10,210,80,80);
		btn1.setFont(new Font("ºÚÌå",Font.PLAIN,50));
		
	}

}
