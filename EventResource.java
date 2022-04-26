import java.util.Observable;
import java.io.*;
public class EventResource extends Observable implements Runnable{

	@Override
	public void run() {
		try
		 {  
	            final InputStreamReader isr = new InputStreamReader(System.in);  
	            final BufferedReader br = new BufferedReader(isr);  
	                String response = br.readLine();  
	                setChanged();  
	                notifyObservers(response);  
	             
	        }  
	        catch (IOException e) {  
	            e.printStackTrace();  
	        }
		
	}

}
