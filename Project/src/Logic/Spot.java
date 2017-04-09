package Logic;

public class Spot {
	private String SpotName;
	private String VehicleName;
	private String Cost;
	public Spot(String name,String Vehi,String cost)
	{
		SpotName=name;
		VehicleName=Vehi;
		Cost=cost;
	}
	public String getSpotName()
	{
		return SpotName;
	}
	public String getVehicleName()
	{
		return VehicleName;
	}
	public String getCost()
	{
		return Cost;
	}
}
