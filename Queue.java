public class Queue<E> {
    public int size;
    QueueNode firstNode = new QueueNode();
    QueueNode lastNode = new QueueNode();


    public Queue(){ }

    public void Enqueue(E element){
        QueueNode temp = new QueueNode();
        temp.setData(element);
        if(size == 0){
            firstNode = temp;
            lastNode = temp;
            size++;
        }
        else{
            temp.setRightNode(lastNode);
            lastNode.setLeftNode(temp);
            lastNode = temp;
            size++;
        }
    }

    public Object deQueue(){
        QueueNode temp;
        temp = firstNode;
        firstNode = firstNode.getLeftNode();
        size--;
        return temp.getData();
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public Object peek(){
        return firstNode.getData();
    }

}
