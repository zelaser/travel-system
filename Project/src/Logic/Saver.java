package Logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Saver {
	private FileWriter write;
	private BufferedWriter Fwriter;
	public Saver(String Path,String...data)
	{
		try 
		{
			write=new FileWriter(Path);
			Fwriter=new BufferedWriter(write);
			for(String i:data)
			{
				Fwriter.write(i+"\n");
				Fwriter.flush();
			}
			write.close();
			Fwriter.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
