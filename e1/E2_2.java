import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Collectors;

public class E2_2{
	public static void main(String[] args){
		Path path = Paths.get(args[0]);
		
		try{
			System.out.println(size(path));
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public static long size(Path path)throws IOException{
		long size = 0;
		List<Path>list = Files.list(path).collect(Collectors.toList());
		
		return size;
	}
}