package hw.week4.queue;

public class ArrayQueue implements IQueue {

    public static final int DEFAULT_QUEUE_SIZE = 10;

    private Object[] queue;
    private int head;
    private int tail;

    public ArrayQueue() {
        this.queue = new Object[DEFAULT_QUEUE_SIZE];
    }

    @Override
    public void enq(Object object) {

        if (this.head == this.queue.length && this.queue[0] != null) {
            this.head = 0;
        } else if (this.head + 1 != this.tail ) {
            this.head++;
        } else {
            throw new QueueException("Queue is overflow!");
        }

        this.queue[head] = object;

    }

    @Override
    public Object deq() {
        if (tail + 1 <= 0){

        }
        return queue[tail++];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
