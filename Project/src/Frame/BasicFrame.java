package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BasicFrame extends JFrame {
	public static UserPanel US;
	public static MangerPanel MP;
	public static  int tag=-1;
	public BasicFrame(String str){
		super (str);
		US=new UserPanel();
		MP=new MangerPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(720,480);		
		setResizable(false);
		Main.setLayout(CL);
		
		BasicPanel.setLayout(new GridLayout(2,1));
		BasicPanel.add(UserB);
		BasicPanel.add(MangerB);
		Main.add(BasicPanel);
		Main.add(US);
		Main.add(MP);
		
		UserB.addActionListener(new Listener());
		MangerB.addActionListener(new Listener());
        setContentPane(Main);
		setVisible(true);
	}
 
	public static JPanel SIN = new JPanel();
	public static JPanel BasicPanel = new JPanel();
	public static JPanel MangerPanel =new JPanel();
	public static JPanel Main=new JPanel();
	public GridLayout GL = new GridLayout();
	public static CardLayout CL = new CardLayout();
	public static GridBagLayout GBL = new GridBagLayout();
	public static  JButton UserB = new JButton("user");
	public static  JButton MangerB = new JButton("mangerment");
	
}
