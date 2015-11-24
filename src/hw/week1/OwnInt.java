package hw.week1;


public final class OwnInt {

    private int value;



    public OwnInt() {
        this.value = 0;
    }

    public OwnInt(int num) {
        this.value = num;
    }

    public OwnInt(OwnInt anObject) {
        this.value = anObject.value;
    }



    public String toString() {
        return Integer.toString(this.value);
    }

    public boolean equals(OwnInt anObject) {
        return this == anObject || this.value == anObject.value;
    }



    // "+"
    public OwnInt add(OwnInt anObject) {

        this.value += anObject.value;

        return this;
    }

    // "-"
    public OwnInt sub(OwnInt anObject) {

        this.value = this.value - anObject.value;

        return this;
    }

    // "*"
    public OwnInt inc(OwnInt anObject) {

        this.value *= anObject.value;

        return this;
    }

    // "/"
    public OwnInt div(OwnInt anObject) {

        this.value = this.value / anObject.value;

        return this;
    }

    // "v stepin'"
    public OwnInt sqrTo(OwnInt anObject) {

        for (int i = 1; i <= anObject.value; i++) {
            this.value *= this.value;
        }

        return this;
    }

    // "factorial"
    public OwnInt factorial() {

        this.value = getFactorial(this.value);

        return this;
    }

    // fact. with recursion
    private int getFactorial(int n) {

        if (n == 1) {
            return n;
        } else {
            return n * getFactorial(n - 1);
        }
    }

}
