package hw.week1;


public class OwnDouble {
  
    private double value;


    public OwnDouble() {
        this.value = 0.0;
    }

    public OwnDouble(short num) {
        this.value = num;
    }

    public OwnDouble(OwnDouble anObject) {
        this.value = anObject.value;
    }



    public String toString() {
        return Double.toString(this.value);
    }

    public boolean equals(OwnDouble anObject) {
        return this == anObject || this.value == anObject.value;
    }



    // "+"
    public OwnDouble add(OwnDouble anObject) {

        this.value += anObject.value;

        return this;
    }

    // "-"
    public OwnDouble sub(OwnDouble anObject) {

        this.value = this.value - anObject.value;

        return this;
    }

    // "*"
    public OwnDouble inc(OwnDouble anObject) {

        this.value *= anObject.value;

        return this;
    }

    // "/"
    public OwnDouble div(OwnDouble anObject) {

        this.value = this.value / anObject.value;

        return this;
    }

}
