public class ArrayStack{
	private Object[] array;
	private int sp = 0;
	public ArrayStack(int arraySize){
		this.array = new Object[arraySize];
		for(int i = 0; i < arraySize; i++){
			this.array[i] = null;
		}
	}
	public void push(Object data){
		this.array[this.sp] = data;
		this.sp++;
	}
	public Object pop(){
		this.sp--;
		Object data = this.array[this.sp];
		this.array[this.sp] = null;
		return data;
	}
	public boolean empty(){
		return this.sp == 0;
	}
}