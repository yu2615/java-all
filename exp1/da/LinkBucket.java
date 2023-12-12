public class LinkBucket{
	private String key;
	private Object data;
	private LinkBucket next = null;
	public LinkBucket(String key, Object data){
		this.key = key;
		this.data = data;
	}
	public String getKey(){
		return this.key;
	}
	public Object getData(){
		return this.data;
	}
	public void setNext(LinkBucket next){
		this.next = next;
	}
	public LinkBucket getNext(){
		return this.next;
	}
	public void printLink(){
		System.out.print(this.key + " " + this.data.toString() + ":");
		if(this.next != null){
			this.next.printLink();
		}
	}
}