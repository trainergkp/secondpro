import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements  Observer{
	private String str;
	@Override
	public void update(Observable arg, Object arg1) {
		if(arg1 instanceof String)
		{
			str=(String)arg1;
			System.out.println("Received Response :"+str);
		}
		
	}

}
