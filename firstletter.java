import java.util.ArrayList;
import java.util.List;
public class firstletter {

	public static void main(String[] args) {
		 List<String> Names=new ArrayList<>();
	        Names.add("Radha");
	        Names.add("Shyam");
	        Names.add("Sita");
	        Names.add("Ram");

	        StringBuilder result=new StringBuilder();
	        Names.forEach(s ->result.append(s.charAt(0)));
	        System.out.println(result);
	    }
	

	}


