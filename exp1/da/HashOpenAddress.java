public class HashOpenAddress{
	private int size;
	private Bucket[] table;
	public HashOpenAddress(int size){
		this.size = size;
		this.table = new Bucket[size];
		for(int i = 0; i < size; i++){
			this.table[i] = new Bucket();
		}
	}
	public int rehash(int value){
		return (value + 1) % this.size;
	}
	public void put(String key, Object data){
		int index = HashUtils.hash(this.size, key);
		for(int i = 0; i < size; i++){
			Bucket bucket = this.table[index];
			if(bucket.isUse()){
				index = this.rehash(index);
			}else{
				bucket.setKeyData(key, data);
				return;
			}
		}
	}
	public Object get(String key){
		int index = HashUtils.hash(this.size, key);
		for(int i = 0; i < this.size; i++){
			Bucket bucket = this.table[index];
			if( bucket.isUse()){
				if(key.equals(bucket.getKey() ) ){
					return bucket.getData();
				}
			}else if(bucket.isEmpty()){
				return null;
			}
			index = this.rehash(index);
		}
		return null;
	}
	public Object remove(String key){
		int index = HashUtils.hash(this.size, key);
		for(int i = 0; i < this.size; i++){
			Bucket bucket = this.table[index];
			if(bucket.isUse()){
				if(key.equals(bucket.getKey())){
					bucket.remove();
					return bucket.getData();
				}
			}else if(bucket.isEmpty()){
				return null;
			}
			index = this.rehash(index);
		}
		return null;
	}
	public void printTable(){
		for(int i = 0; i < this.table.length; i++){
			Bucket bucket = this.table[i];
			if(bucket.isUse()){
				String s = bucket.getString();
				System.out.println(i + ":USE:" + s);
			}else if(bucket.isRemoved()){
				System.out.println(i + ":REMOVED:");
			}else if (bucket.isEmpty()){
				//System.out.println(i + ":EMPTY:");
			}
		}
	}
}