package problem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
interface lambda1{
	void check(String value);
}
class problem2  {

void calc(String input){

lambda1 xe=(String abcd)->
{
StringBuilder mutable = new StringBuilder();
         
for (char ch: input.toCharArray()) {
if(ch!=' ')
                     {
 mutable.append(ch); }
}
String spaceFree=mutable.toString();
if(spaceFree=="")
{
   System.out.println("no hex");
return;
}
int intValue=Integer.parseInt(spaceFree);
String hexValueString = Integer.toHexString(intValue);
 
System.out.println(intValue+"="+hexValueString);

try{

File file = new File("C:\\Users\\gurnoor.singh\\Downloads\\final3.txt");
FileWriter fr = new FileWriter(file, true);
BufferedWriter br = new BufferedWriter(fr);
br.write(intValue+"="+hexValueString);
br.newLine();
br.close();
fr.close();

}
catch (Exception e){
System.out.println(e);
}
};
xe.check(input);
}}
class newClass extends problem2 implements Runnable {

String s;
newClass(String s1){
s=s1;
}

@Override
public void run(){
calc(s);
}

}


public class problem{

public static void main(String[] args) throws IOException  {

File file= new File("C:\\Users\\gurnoor.singh\\Downloads\\prob1.txt");
System.out.println(file);
BufferedReader br = new BufferedReader(new FileReader(file));
 

ExecutorService pool = Executors.newFixedThreadPool(5);
 
String st;
 while ((st = br.readLine()) != null) {
   Runnable r=new newClass(st);
   pool.execute(r);
 
 }


br.close();
pool.shutdown();
}


}