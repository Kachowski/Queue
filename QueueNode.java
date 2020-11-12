public class QueueNode<E> {
    private E data;
    private QueueNode rightNode;
    private QueueNode leftNode;

    public QueueNode(){}

    public void setData(E Data){
        data = Data;
    }

    public void setRightNode(QueueNode node){
        rightNode = node;
    }

    public void setLeftNode(QueueNode node){
        leftNode = node;
    }

    public E getData() {
        return data;
    }

    public QueueNode getLeftNode(){
        return leftNode;
    }

}
