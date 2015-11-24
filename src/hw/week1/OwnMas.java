package hw.week1;

import java.util.Arrays;

public final class OwnMas {

    private int[] value;



    public OwnMas() {
        this.value = new int[1];
    }

    public OwnMas(int num) {
        this.value = new int[num];
    }



    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("{ ");
        for (int i : value) {
            str.append(i);
            str.append(" ");
        }
        str.append("}");

        return str.toString();

    }

    public boolean equals(OwnMas anObject) {

        if (this == anObject) {
            return true;
        }

        if (this.value.length != anObject.value.length) {
            return false;
        }

        for (int i = 0; i < this.value.length; i++) {
            if (this.value[i] != anObject.value[i]) {
                return false;
            }
        }

        return true;

    }



    public int getMin() {

        int min = this.value[0];

        for (int i = 1; i < this.value.length; i++) {

            if (min > this.value[i]) {
                min = this.value[i];
            }
        }

        return min;
    }

    public int getMax() {

        int max = this.value[0];

        for (int i = 1; i < this.value.length; i++) {

            if (max < this.value[i]) {
                max = this.value[i];
            }
        }

        return max;
    }

    public void randomFill(int rangeMin, int rangeMax) {

        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = (int) (Math.random() * (rangeMax - rangeMin) + rangeMin);
        }

    }

    public OwnMas incLengthBy(int n) {

        this.value = Arrays.copyOf(this.value, this.value.length + n);

        return this;

    }


}
