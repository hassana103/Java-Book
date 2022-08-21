// Stack class
// here we can see encapsulation in java

class Stack{
    int stck[] = new int[10];
    int tos;

    Stack(){
        tos=-1;
    }

    // push an item to the stack
    void push(int i){
        if(tos == 9){
            System.out.println("Stack is full");
        }else{
            stck[++tos] = i;
        }

    }

    // pop an item from the stack
    int pop(){
        if(tos == -1) {
            System.out.println("Stack is empty.");
            return 0;
        }else{
            return stck[tos--];
        }
    }

}
class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(3);
        s1.push(7);
        s1.push(11);

        s2.push(2);
        s2.push(6);
        s2.push(8);

        System.out.println("s1 pop() "+s1.pop());
        System.out.println("s1 pop() "+s1.pop());
        System.out.println("s1 pop() "+s1.pop());
        System.out.println("s1 pop() "+s1.pop());

        System.out.println("s2 pop() "+s2.pop());
        System.out.println("s2 pop() "+s2.pop());
        System.out.println("s2 pop() "+s2.pop());
        System.out.println("s2 pop() "+s2.pop());



        // the whole point of this example is to show the power of encapsulation
        // here we are not worried about how the stack is implemented
        // we just use it through its methods

    }
}