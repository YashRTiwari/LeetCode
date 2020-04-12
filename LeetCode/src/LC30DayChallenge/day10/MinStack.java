package LC30DayChallenge.day10;


/*
* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
* */
public class MinStack {

    public class Node {

        private int data;
        public Node next = null;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    Node top;
    private Node minStackTop;

    public MinStack() {
        top = null;
    }

    public void push(int x) {
        top = createHead(x, top);

        if(minStackTop != null)
            x =  (x <= minStackTop.getData()) ? x : minStackTop.getData();
        minStackTop = createHead(x, minStackTop);
    }

    public Node createHead(int x, Node top){
        Node node = new Node(x);
        node.next = top;
        top = node;

        return node;
    }

    public void pop() {
        Node node = top;
        top = node.next;

        Node minTop = minStackTop;
        minStackTop = minTop.next;
    }

    public int top() {
        return top.getData();
    }

    public int getMin() {
        return minStackTop.getData();
    }


}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */