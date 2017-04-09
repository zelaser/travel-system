package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
public class UserPanel extends JPanel {
	
    public UserPanel()
    {   
    	setLayout(BasicFrame.CL);
    	CH.setLayout(new GridLayout(3,3));
    	CH.add(b1);
    	b1.addActionListener(new Listener());
    	CH.add(b2);
    	b2.addActionListener(new Listener());
    	CH.add(b3);
    	b3.addActionListener(new Listener());
    	CH.add(b4);
    	CH.add(b5);
    	CH.add(b6);
    	CH.add(b7);
    	CH.add(b8);
    	CH.add(b9);
        b9.addActionListener(new Listener());
    	
    	temp[0]=new JPanel();
    	temp[0].setLayout(new GridLayout());
	    temp[0].add(new JScrollPane(jk));
	    temp[0].add(b);
	    b.addActionListener(new Listener());
	    temp[1]=new JPanel();
	    temp[2]=new JPanel();
    	add(CH);
    	add(temp[0]);
  	    add(temp[1]);
   	    add(temp[2]);
    }
    private JPanel CH =new  JPanel();
    private JPanel temp[]=new JPanel[9];
    public   static JTable jk=new JTable();
     public static JButton b1 = new JButton("北京");
     public static JButton b2 = new JButton("云南");
     public static JButton b3 = new JButton("上海");
     public static JButton b4 = new JButton("重庆");
     public static JButton b5 = new JButton("宁波");
     public static JButton b6 = new JButton("福州");
     public static JButton b7 = new JButton("三沙");
     public static JButton b8 = new JButton("福州");
     public static JButton b9 = new JButton("返回");
     public static JButton b = new JButton("返回");
	}
   
 
