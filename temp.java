package temp;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
public class temp extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myReader;
		try {
		File ab = new File("C:\\Users\\gurnoor.singh\\Downloads\\prob1.txt");
		File cb = new File("C:\\Users\\gurnoor.singh\\Downloads\\prob2.txt");
		FileOutputStream f=new FileOutputStream(cb);
		BufferedWriter b=new BufferedWriter(new OutputStreamWriter(f));
		//System.out.println("File name: " + ab.getName());
		 myReader= new Scanner(ab);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        data=data.trim();
	        int idata=0;
	        if(data!="")
	        idata=Integer.parseInt(data);
	        System.out.println(data);
	        System.out.println(idata);
	        String hdata=Integer.toHexString(idata);
	        System.out.println(hdata);
		     b.write(data+" "+hdata);
		      b.newLine();
	      }
	      b.close();
	}
		catch(FileNotFoundException e)
		{
			System.out.println("abcd");
		}
		 catch (IOException e) {
	      System.out.println("An error occurred.");
		      e.printStackTrace();
		 }
		
}
}
