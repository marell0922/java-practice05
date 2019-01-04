package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top=-1;
		buffer=new String[capacity];
	}

	public void push(String s) {
			
		if(top==buffer.length-1) {
			String[] temp=new String[buffer.length*2];
			System.arraycopy(buffer, 0, temp, 0, buffer.length);
			buffer=temp;
		}
		
		buffer[++top]=s;
		//System.out.println(buffer[top]);
		
	}

	public String pop() throws MyStackException {
		
		if(top==-1) {
			throw new MyStackException();
		}
		
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}