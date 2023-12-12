public class B4_10 {
	public static void main (String[] args) {
		Book book1 = new Book("B07RR74JMS","来日記念 チェルシー特集号 (サッカーキング増刊) ","???","朝日新聞出版");
		Book book2 = new Book("B07YZDFRDP", "SOCCER KING (サッカーキング) 2019年 11月号","SOCCER KING 編集部 "," フロムワン");
		System.out.println(book1.getTitle());
		System.out.println(book2.getTitle());
		
	}
}