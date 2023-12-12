import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E1_1{
	public static void main(String[] args){
		String source = args[0];
		String target = args[1];
		Path sourceFile = Paths.get(source);
		Path targetFile = Paths.get(target);
		try{
			Path path = copy(sourceFile, targetFile);
			System.out.println("ÉRÉsÅ[Ç≈Ç´Ç‹ÇµÇΩ");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public static Path copy(Path sorcePath, Path targetPath) throws IOException{
		Path temp = Files.copy(sorcePath, targetPath);
		return targetPath;
	}
}