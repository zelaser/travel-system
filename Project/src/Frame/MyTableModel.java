package Frame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

	 public	class MyTableModel  extends AbstractTableModel{
		public  String[] coluNames ;
		public  Object[][] data ;
		public int Row;
		public  Object b[]=new Object[100]; 
		 public void row(String...temp) //��
		 {
			 coluNames=new String[temp.length];
		 for(int i=0;i<temp.length;i++)
			 {
				 coluNames[i]=temp[i];
			 }
		 }
	 public void col(int temp,int width,String...tep){ //��
		 data = new Object[temp][width];
			 for(int i=0,k=0;i<temp;i++)
			 {
			 for(int j=0;j<width;j++)
			 {
				 data[i][j]=tep[k];
				 k++;
			 }
		 }
	 }
	 public Object[] qucol(int temp,int width)
	 {   
		 for(int i=0, k=0;i<temp;i++)
		 {
			 for(int j=0;j<width;j++)
			 {
				 b[k]=data[i][j];
				 k++;
			 }
		 }
		return b;
	 }
	 public String[] qurow(String bn[])
	 {
		 String an[]= new String[100];
		 for(int i=0;i<bn.length;i++)
		 {
			 an[i]=bn[i];
		 }
		return an;
		
		 
	 }
		 @Override//����
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return coluNames.length;
		}

		@Override//����
		public int getRowCount() {
			// TODO Auto-generated method stub
			return data.length;
		}
		@Override//���ĳ����
		public String getColumnName(int col) {
			// TODO Auto-generated method stub
			return coluNames[col];
		}
		@Override//���ĳ��ĳ������
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}		
		public boolean isCellEditable(int row, int col) {
			if (BasicFrame.tag==0)
				return true;
			else return false;
		}
		//ʹ�������޸�����
				public void setValueAt(Object Value, int row, int col) {
					// TODO Auto-generated method stub
					if(data[0][col] instanceof Integer && !(Value instanceof Integer))
					{
						try{
							data[row][col]=new Integer(Value.toString());//��������
							fireTableCellUpdated(row,col);
							
						}catch(NumberFormatException e){
							//JOptionPane.showMessageDialog(MyTableModel.this, "The\""+getColumnName( col)+ "\" ����ֻ������������");
						}
						
						}
					else { data[row][col]=Value;
						fireTableCellUpdated(row,col);
					}		
		}
	

	}
