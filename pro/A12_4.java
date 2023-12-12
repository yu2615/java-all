import jp.tdu.util.TextFileWriter;
public class A12_4 {
	public static void main (String[] args) {
		System.out.println (args[0] + "ファイルを開きます");
		TextFileWriter writer = new TextFileWriter(args[0]);
		if (writer.open()) {
			System.out.println("ファイルが開けました");
			writer.write("abc");
			writer.close();
		} else {
			System.out.println("ファイルが開けません");
		}
	}
}