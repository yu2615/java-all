import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E1_2{
	public static void main(String[] args){
		String source = args[0];
		Path dir = Paths.get(source);
		try{
			Path createPath = createDirectories(dir);
			System.out.println("ディレクトリを作成できました");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static Path createDirectories(Path dir)throws IOException{
		return Files.createDirectories(dir);
	}
}