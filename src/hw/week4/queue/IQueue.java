package hw.week4.queue;

public interface IQueue {

    void enq(Object object);

    Object deq();

    void clear();

    int size();

    boolean isEmpty();

}
