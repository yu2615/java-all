import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2_1{
	public static void main(String[] args){
		List<Student>list = StudentDB.getList();
		
		Map<String, Student>map = new HashMap<String, Student>();
		for(Student student : list){
			map.put(student.getId(), student);
		}
		
		for(String key : map.keySet()){
			Student student = map.get(key);
			StudentUtils.print(student);
		}
		
		String id = args[0];
		System.out.println("search id:" + id);
		Student student = map.get(id);
		if(student == null){
			System.out.println("ˆê’v‚·‚éƒf[ƒ^‚Í‚ ‚è‚Ü‚¹‚ñ");
		}else{
			StudentUtils.print(student);
		}
	}
}