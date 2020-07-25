import java.io.*;
class FileWriterDemo{
	public static void main(String args[]) throws IOException
	{
		String source="Now this is the time for all good men\n"+"to come to the aid of their country";
		char buffer[]=new char[source.length()];
		source.getChars(0,source.length(),buffer,0);

		try{
			FileWriter f0=new FileWriter("File1.txt");
			FileWriter f1=new FileWriter("File2.txt");
			FileWriter f2=new FileWriter("File3.txt");
			
			for(int i=0;i<buffer.length;i+=2)
			{
				f0.write(buffer[i]);
			}
			f1.write(buffer);
			f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
			f0.close();
			f1.close();
			f2.close();
		
		}
		catch(IOException e)
		{
			System.out.println("IO error occured");
		}
	}
}
			