package Logic;

public class Manager {
	private String Name;
	private String PassWord;
	public Manager(String N,String P)
	{
		Name=N;
		PassWord=P;
	}
	public String getName()
	{
		if(Name!=null)
		return Name;
		else return "";
	}
	public String PassWord()
	{
		if(PassWord!=null)
		return PassWord;
		else return "";
	}
}
