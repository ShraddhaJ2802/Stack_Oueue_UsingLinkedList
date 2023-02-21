import com.bridgelab.stack.StackProgram;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        StackProgram stack= new StackProgram();
        // insert Stack value

        stack.push(70);

        stack.push(30);

        stack.push(56);

        // print Stack elements
        stack.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n",
                stack.peek());
    }
}