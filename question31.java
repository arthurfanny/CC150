//Describe how you could use a single array to implement three stacks

//push operation increases top by one and writes pushed element to storage[top]
//pop operation checks that top is not equal to -1 and decreases top variable by 1
//peek operation checks that top is not equal to -1 and returns storage[top]

public class ArrayStack<T>{
	private Object[] storage;
	private int stackSize;
	int[] top;
	public ArrayStack(int capacity, int numOfStacks){
		if(capacity <= 0){
			throw new IllegalArgumentException(
				"Stack's capacity must be positive");
		stackSize = capacity;
		storage = new Object(stackSize*numOfStacks);
		top = new int[numOfStacks];
		for (int i = 0; i< numOfStacks; i++){
			top[i] = i * stackSize - 1;
		}
	}

	public void push(T t, int numOfStack){
		storage[++top(numOfStack)] = t;
		top[numOfStack]++;
	}

	public void pop(int numOfStack){
		top[numOfStack]--;
	}

	public Object peek(int numOfStack){
		return storage[top(numOfStack)];
	}

	public String subStack(int num){
		String s = "";
		int index = top(num);
		while(index>=num*stackSize){
			s = s + "[" + storage[index--] + "]" + "->";
		}
		
		return s;
	}

	public int StackSize(int numOfStack){
		return top[numOfStack] - stackSize*numOfStack + 1;
	}

	public static void main(String []args){
		ArrayStack<String> myStack = new ArrayStack<>(10,4);
		myStack.push("arthur",1);
		myStack.push("jennifer",2);
		myStack.push("good",3);
		myStack.pop(1);
		myStack.pop(2);
		myStack.push("ben",3);
	}
}




	
