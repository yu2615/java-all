import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Collectors;

public class E2_1{
	public static void main(String[] args){
		Path path = Paths.get(args[0]);
		
		try{
			System.out.println(count(path));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static int count(Path path)throws IOException{
		int count = 0;
		List<Path>list = Files.list(path).collect(Collectors.toList());
		
		return count;
	}
}