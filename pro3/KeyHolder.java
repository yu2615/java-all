public class KeyHolder implements Toy {
	private String goods = "キーホルダー";
	private String character;
	public KeyHolder (String character) {
		this.character = character;
	}
	public String getGoods() {
		return this.goods;
	}
	public String getCharacter() {
		return this.character;
	}
}