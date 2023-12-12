import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E1_3{
	public static void main(String[] args){
		String dir = args[0];
		try{
			print(Paths.get(dir));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void print(Path path)throws IOException{
		Files.walkFileTree(path, new PrintFileVisitor1());
	}
}