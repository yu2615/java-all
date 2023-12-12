import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintFileVisitor2 extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)throws IOException{
		System.out.println("D:" + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException{
		System.out.println("F:"+ file.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc)throws IOException{
		return super.postVisitDirectory(dir, exc);
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc)throws IOException{
		return super.visitFileFailed(file, exc);
	}
}