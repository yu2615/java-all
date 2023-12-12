import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class E1_4{
	public static void main(String[] args){
		String dir = args[0];
		Path path = Paths.get(dir);
		
		LocalDateTime dateTime = null;
		try{
			FileTime fileTime = Files.getLastModifiedTime(path);
			dateTime = toLocalDateTime(fileTime);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(dateTime);
	}
	
	public static LocalDateTime toLocalDateTime(FileTime time){
		return LocalDateTime.ofInstant(time.toInstant(), ZoneId.systemDefault());
	}
}