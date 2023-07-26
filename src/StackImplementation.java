import java.util.Scanner;

class Stack{
    class Node{
        int value; // data
        Node next; // address of next data
        // Node creation
        Node (int value){
            this.value = value;
        }
    }
    Node top; // head
    //Node bottom; // tail
    int height;
    void Stack(){}
    // constructor to create first element in stack
    void Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    // get peak
    void getTop(){
        System.out.println("Peak value of stack: "+top.value);
    }
    // get height of stack
    void getHeight(){
        System.out.println("Height of the Stack: "+height);
    }
    // display the stack
    void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Push operation
    void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    // Pop
    Node pop(){
        if(height == 0){
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("Stack Implementations");
        int data = 0, i = 0;
        System.out.println("Enter your linked list elements and type -1 to stop");
        while(true){
            data = scanner.nextInt();
            if(data == -1){
                break;
            }
            stack.push(data);
        }
        System.out.println("Your stack looks like...");
        stack.printStack();
        char choice = 'y';
        while(choice == 'y'){
            System.out.println("Implementations on Stack\n1 -> Display\n2 -> Push\n3 -> Pop\n4 -> Top\n5 -> Get height\n");
            System.out.print("Enter one of the following options to see its implementation: ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Display...");
                    stack.printStack();
                    break;
                case 2:
                    System.out.println("before push: ");
                    stack.printStack();
                    System.out.print("Enter the value to push: ");
                    stack.push(scanner.nextInt());
                    System.out.println("after pushing");
                    stack.printStack();
                    break;
                case 3:
                    System.out.println("before pop: ");
                    stack.printStack();
                    stack.pop();
                    System.out.println("after pop:");
                    stack.printStack();
                    break;
                case 4:
                    stack.getTop();
                    break;
                case 5:
                    stack.getHeight();
                    break;
            }
            System.out.print("You want to explore more implementation (y/n): ");
            choice = scanner.next().charAt(0);
        }
        scanner.close();
    }
}
