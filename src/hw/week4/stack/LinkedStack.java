package hw.week4.stack;

public class LinkedStack implements IStack {

    private LinkedCell top;

    public LinkedStack(){
        this.top = null;
    }

    @Override
    public void push(Object object) {
        LinkedCell newCell = new LinkedCell(object);
        newCell.setLink(top);
        top = newCell;
    }

    @Override
    public Object pop() {

        if (isEmpty()) {
            throw new StackException("Stack is empty!");
        }

        Object value = this.top.getValue();
        this.top = this.top.getLink();
        return value;
    }

    @Override
    public void clear() {
        this.top = null;
    }

    @Override
    public int size() {

        if (isEmpty()) {
            return 0;
        }

        return getSize(this.top);
    }

    private int getSize(LinkedCell cell) {
        if(cell.getLink() == null){
            return 1;
        }
        return getSize(cell) + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public String toString(){
        if (isEmpty()) {
            return "{ }";
        }
        return "{" + getStackAsString(this.top) + "}";
    }

    private String getStackAsString(LinkedCell cell){
        if(cell.getLink() == null){
            return cell.getValue().toString();
        }
        return cell.getValue().toString() + " " + getStackAsString(cell.getLink());
    }
}
