package Frame;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Logic.Loader;

import java.awt.*;
public class Listener implements ActionListener{
	private Object data[]=new Object[100][100];
	 private MyTableModel MY = new MyTableModel();
	 private Loader L;
	 private ArrayList <String> SpotName;
	 private ArrayList <String> Vehicle;
	 private ArrayList <String> Cost;
	 String temp[];
	public void actionPerformed(ActionEvent e) {
		if((e.getSource()==UserPanel.b))
		{
			BasicFrame.CL.first(BasicFrame.US);
		}
		if(e.getSource()==UserPanel.b9)
				{
			
			      BasicFrame.CL.first(BasicFrame.Main);
				}
		if(e.getSource()==MangerPanel.re)
		{
			BasicFrame.CL.first(BasicFrame.Main);
		}
		if(e.getSource()==BasicFrame.UserB){
			BasicFrame.CL.next(BasicFrame.Main);
			BasicFrame.tag=0;
	   }
		if(e.getSource()==BasicFrame.MangerB){
			
			BasicFrame.CL.last(BasicFrame.Main);
			
		}
		if(e.getSource()==UserPanel.b1)
		{
			this.MY.row("景点","交通","价格");
			L=new Loader(System.getProperty("user.dir")+"\\data\\Provience1");
			SpotName=new ArrayList<String>();
			Vehicle=new ArrayList<String>();
			Cost=new ArrayList<String>();
			int tag=0;
			for(String i:L.getSpotName())
				SpotName.add(i);
			for(String i:L.getVehicleName())
				Vehicle.add(i);
			for(String i:L.getCost())
				Cost.add(i);
			temp=new String[SpotName.size()+Vehicle.size()+Cost.size()];
			for(int i=0,j=0,k=0,l=0;i<temp.length;)
			{
				temp[i]=SpotName.get(j);
				i++;
				j++;
				temp[i]=Vehicle.get(k);
				i++;
				k++;
				temp[i]=Cost.get(l);
				i++;
				l++;
			}
			MY.col(3,3,temp);
		    UserPanel.jk.setModel(this.MY);
	    	//this.data=this.MY.qucol(3,4);
			BasicFrame.CL.next(BasicFrame.US);
		}
		if(e.getSource()==UserPanel.b2)
		{
			this.MY.row("景点","交通","价格");
			L=new Loader(System.getProperty("user.dir")+"\\data\\Provience2");
			SpotName=new ArrayList<String>();
			Vehicle=new ArrayList<String>();
			Cost=new ArrayList<String>();
			int tag=0;
			for(String i:L.getSpotName())
				SpotName.add(i);
			for(String i:L.getVehicleName())
				Vehicle.add(i);
			for(String i:L.getCost())
				Cost.add(i);
			temp=new String[SpotName.size()+Vehicle.size()+Cost.size()];
			for(int i=0,j=0,k=0,l=0;i<temp.length;)
			{
				temp[i]=SpotName.get(j);
				i++;
				j++;
				temp[i]=Vehicle.get(k);
				i++;
				k++;
				temp[i]=Cost.get(l);
				i++;
				l++;
			}
			MY.col(3,3,temp);
		    UserPanel.jk.setModel(this.MY);
	    	//this.data=this.MY.qucol(3,4);
			BasicFrame.CL.next(BasicFrame.US);
		}
		if(e.getSource()==UserPanel.b3)
		{
			this.MY.row("景点","交通","价格");
			L=new Loader(System.getProperty("user.dir")+"\\data\\Provience3");
			SpotName=new ArrayList<String>();
			Vehicle=new ArrayList<String>();
			Cost=new ArrayList<String>();
			int tag=0;
			for(String i:L.getSpotName())
				SpotName.add(i);
			for(String i:L.getVehicleName())
				Vehicle.add(i);
			for(String i:L.getCost())
				Cost.add(i);
			temp=new String[SpotName.size()+Vehicle.size()+Cost.size()];
			for(int i=0,j=0,k=0,l=0;i<temp.length;)
			{
				temp[i]=SpotName.get(j);
				i++;
				j++;
				temp[i]=Vehicle.get(k);
				i++;
				k++;
				temp[i]=Cost.get(l);
				i++;
				l++;
			}
			MY.col(3,3,temp);
		    UserPanel.jk.setModel(this.MY);
	    	//this.data=this.MY.qucol(3,4);
			BasicFrame.CL.next(BasicFrame.US);
		}
}
}