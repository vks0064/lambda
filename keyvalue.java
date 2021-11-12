package keyvalue1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class keyvalue {

	public static void main(String[] args) {
		  Map<Integer, String> map = new LinkedHashMap<>();
	        map.put(33," raj ");
	        map.put(10," raju ");
	        map.put(11," raman ");


	        StringBuilder result=new StringBuilder();

	        map.forEach((k, v) -> result.append(k).append(v));
	        System.out.println("Result String is :"+result);


//	        for (Map.Entry<Integer, String> entry :map.entrySet()){
//	            Integer key = entry.getKey();
//	            String value = entry.getValue();
//	            result.append(key).append(value);
//	        }
//	        System.out.println("Result String is :"+result);
	    }
	

	}


