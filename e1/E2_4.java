import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E2_4{
	public static void main(String[] args){
		try{
			copy(Paths.get(args[0]),Paths.get(args[1]));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void copy(Path sourcePath, Path targetPath)throws IOException{
		Files.walkFileTree(sorcePath, new CopyFileVisitor1(sorcePath, targetPath));
	}
}