import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {
	private String str;
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String)
		{
			str=(String)arg;
			System.out.println("Received Response :"+str);
		}

	}

}
