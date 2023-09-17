// **Текст задачи:**
// Реализовать стэк с помощью массива. Нужно реализовать методы:

// size(), empty(), push(), peek(), pop().

public class sem17 
{

private Integer[] arr = new Integer[10];
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int item){
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length * 2];
            System.arraycopy(arr,0,arr2,0,arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    int peek(){
        return arr[size-1];
    }

    int pop(){
        return arr[--size];
    }
}


public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }

    