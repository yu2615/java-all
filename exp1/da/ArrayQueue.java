public class ArrayQueue{
	private Object[] array;
	private int front = 0;
	private int rear = 0;
	public ArrayQueue(int arraySize){
		this.array = new Object[arraySize];
		for(int i = 0; i < arraySize; i++){
			this.array[i] = null;
		}
	}
	public void enqueue(Object data){
		this.array[this.rear] = data;
		this.rear = (this.rear + 1) % this.array.length;
	}
	public Object dequeue(){
		Object data = this.array[this.front];
		this.front = (this.front + 1) % this.array.length;
		return data;
	}
	public boolean empty(){
		return this.front == this.rear;
	}
}