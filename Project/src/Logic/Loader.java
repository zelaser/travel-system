package Logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Loader {
	private Manager AS;
	private Provience Pro;
	private FileReader open;
	private BufferedReader Fopen;
	public Loader(String filename)
	{
		try 
		{
			open=new FileReader(filename);
			Fopen=new BufferedReader(open);
			String Name=null;
			String PassWord=null;
			String temp=null;
			String pro=null;
			String Spot[]=null;
			String vehicle[]=null;
			String cost[]=null;
			int spotno=0;
			int tag=0;
			int a=0,b=0,c=0;
			int T=0;
			Name=null;
			PassWord=null;
			for(int i=0;(temp=Fopen.readLine())!=null;i++)
			{
				if(temp.matches("information")||T==1)
			{		
				T=1;
				if(T==1)
				{
					if(i==1)Name=temp;
					else if(i==2)
						{
							PassWord=temp;
							System.out.println(Name+" "+PassWord);
							AS=new Manager(Name,PassWord);
						}
					else ;
				}
				}
				else 
				{
					if(i==0)pro=temp;
					else if(i==1)
						{
							spotno=Integer.parseInt(temp);
							Pro=new Provience(pro,spotno);
							Spot=new String[spotno];
							vehicle=new String[spotno];
							cost=new String[spotno];
						}
					else 
					{
						if(tag==0)
							{
								Spot[b]=temp;
								a++;
								tag++;
							}
						else if(tag==1)
						{
							vehicle[b]=temp;
							b++;
							tag++;
						}
						else if(tag==2)
						{
							cost[c]=temp;
							c++;
							tag=0;
						}
						Pro.setSpot(Spot, vehicle, cost);
					}
				}
			}
			open.close();
			Fopen.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public String getPro()
	{
		return Pro.ProName();
	}
	public String[] getSpotName()
	{
		return Pro.SpotName();
	}
	public String[] getVehicleName()
	{
		return Pro.VehicleName();
	}
	public String[] getCost()
	{
		return Pro.Cost();
	}
	public String getUser()
	{
		return AS.getName();
	}
	public String getPass()
	{
		return AS.PassWord();
	}
}
