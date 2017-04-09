package Frame;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MangerPanel extends JPanel{
	public MangerPanel()
	{
		setLayout(BasicFrame.CL );	
		add(re);
		re.addActionListener(new Listener());
		adda(Sign,sign,GBC,0,0,1,1);		
		adda(Sign,UsName,GBC,0,1,1,1);
		
		adda(Sign,passwd,GBC,1,0,1,1);
		adda(Sign,PaWord,GBC,1,1,1,1);	
		
		adda(Sign,sure,GBC,4,0,2,1);
	    add(Sign);

		
		
	}
	
	
	public void adda(JComponent Common1,JComponent Common2,GridBagConstraints GBC,int row,int line,int Weigth,int Height){
		GBC.gridwidth=Weigth;
		GBC.gridheight=Height;
		GBC.gridx=row;
		GBC.gridy=line;
		GBC.fill=GBC.BOTH;
		BasicFrame.GBL.setConstraints(Common2,GBC);
		Common1.add(Common2);
	}
	public GridBagConstraints GBC=new GridBagConstraints();
    private JPanel Sign =new  JPanel();
    private JPanel Update1=new JPanel();
    private JPanel Update2=new JPanel();
    private JPanel Update3=new JPanel();
    private JPanel Update4=new JPanel();
    public static JButton a1 = new JButton("update1");
    public static JButton a2 = new JButton("updete2");
    public static JButton a3 = new JButton("update3");
    public static JButton a4 = new JButton("update4");
    public static JButton a5 = new JButton("update5");
    public static JButton re = new JButton("»¶Ó­");
    
    public static JButton sure = new JButton("µÇÂ¼");
    //public static JButton not = new JButton("ÍË³ö");
    public static JLabel sign = new JLabel("ÕËºÅ");
    public static JLabel passwd = new JLabel("ÃÜÂë");
	public static JTextField UsName=new JTextField(10);
	public static JPasswordField PaWord=new JPasswordField(10);    
}
