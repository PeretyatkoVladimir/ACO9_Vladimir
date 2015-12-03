package hw.week4;

import java.util.LinkedList;

public class LinkedCell {

    private Object value;
    private LinkedCell link;

    public LinkedCell(Object value) {
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
    
    public void resetLink () {
        this.link = null;
    }

}
