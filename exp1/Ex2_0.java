import java.util.HashMap;
import java.util.Map;
public class Ex2_0{
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Apple","りんご");
		map.put("Note","ノート");
		map.put("Book","ブック");
		
		String key = "Note";
		String value = map.get(key);
		System.out.println(value);
	}
}