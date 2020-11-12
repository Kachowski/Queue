import java.util.Scanner;

public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner s = new Scanner(System.in);

        //This adds the initial Node in the stack
        System.out.println("Enter the first number in the queue:");
        queue.Enqueue(s.next());

        //This checks to see if the Node was correctly placed at the top of the stack
        System.out.println("This should be the first number in the queue: " + queue.peek());

        //Adds a second and third node to the stack
        System.out.println("Enter a second input:");
        queue.Enqueue(s.next());

        System.out.println("Enter a third input:");
        queue.Enqueue(s.next());

        //Gets rid of the top node and returns it along with the size of the stack after the node is removed
        System.out.println("This should be the first input you entered: " + queue.deQueue());
        System.out.println("This should be the size (2): " + queue.size());

        System.out.println("This should be the second input you entered: " + queue.deQueue());
        System.out.println("This should be the size (1): " + queue.size());

        System.out.println("This should be the last input you entered: " + queue.deQueue());
        System.out.println("This should be the size (0): " + queue.size());

        //This shows that the stack is empty after all the nodes are removed
        System.out.println("This will display true to show that the queue is empty: " + queue.isEmpty());
    }
}

