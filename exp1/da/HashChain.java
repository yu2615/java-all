public class HashChain{
	private int size;
	private LinkBucket[] table;
	public HashChain(int size){
		this.size = size;
		this.table = new LinkBucket[size];
		for(int i = 0; i < size; i++){
			this.table[i] = new LinkBucket(null, "dummy");//dummy
		}
	}
	public void put(String key, Object data){
		int index = HashUtils.hash(this.size, key);
		LinkBucket linkBucket = this.table[index];//dummy
		while(linkBucket.getNext() != null){
			linkBucket = linkBucket.getNext();
		}
		linkBucket.setNext(new LinkBucket(key, data));
	}
	public Object get(String key){
		int index = HashUtils.hash(this.size, key);
		LinkBucket dummy = this.table[index];//dummy
		LinkBucket linkBucket = dummy.getNext();
		while(linkBucket != null){
			if(key.equals(linkBucket.getKey() ) ){
				return linkBucket.getData();
			}
			linkBucket = linkBucket.getNext();
		}
		return null;
	}
	public void printTable(){
		for(int i = 0; i < this.table.length; i++){
			LinkBucket dummy = this.table[i];//dummy
			LinkBucket linkBucket = dummy.getNext();
			if(linkBucket != null){
				System.out.print(i + ":");//hash value
				linkBucket.printLink();
				System.out.println();
			}
		}
	}
}