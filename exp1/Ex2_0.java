import java.util.HashMap;
import java.util.Map;
public class Ex2_0{
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Apple","���");
		map.put("Note","�m�[�g");
		map.put("Book","�u�b�N");
		
		String key = "Note";
		String value = map.get(key);
		System.out.println(value);
	}
}