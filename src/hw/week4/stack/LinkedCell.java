package hw.week4.stack;

public class LinkedCell {

    private Object value;
    private LinkedCell link;

    LinkedCell(Object value) {
        this.value = value;
        this.link = null;
    }

    public void setLink (LinkedCell link) {
        this.link = link;
    }

    public Object getValue () {
        return this.value;
    }

    public LinkedCell getLink () {
        return this.link;
    }
    
    public resetLink () {
        this.link = null;
    }

}
