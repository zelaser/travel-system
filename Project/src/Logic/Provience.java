package Logic;

public class Provience {
	private String ProName;
	private Spot Sp[];
	public Provience(String Name,int Length)
	{
		ProName=Name;
		Sp=new Spot[Length];
	}
	public void setSpot(String[] Spotname,String []Vehi,String []Cost)
	{
		for(int i=0;i<Sp.length;i++)
		{
			Sp[i]=new Spot(Spotname[i],Vehi[i],Cost[i]);
		}
	}
	public String ProName()
	{
		return ProName;
	}
	public String[] SpotName()
	{
		String temp[]=new String[Sp.length];
		for(int i=0;i<Sp.length;i++)
		{
			temp[i]=Sp[i].getSpotName();
		}
		return temp;
	}
	public String[] VehicleName()
	{
		String temp[]=new String[Sp.length];
		for(int i=0;i<Sp.length;i++)
		{
			temp[i]=Sp[i].getVehicleName();
		}
		return temp;
	}
	public String[] Cost()
	{
		String temp[]=new String[Sp.length];
		for(int i=0;i<Sp.length;i++)
		{
			temp[i]=Sp[i].getCost();
		}
		return temp;
	}
}
