package hw.week1;


import java.util.Arrays;

public final class OwnString {

    private char value[];
    
    
    
    public OwnString() {
        this.value = new char[0];
    }
    
    public OwnString(char[] anObject) {
        this.value = Arrays.copyOf(anObject, anObject.length);
    }
    
    public OwnString(String str) {
        this.value = str.toCharArray();
    }
    
    
    
    public boolean equals(OwnString anObject) {

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

    public String toString() {

        StringBuilder str = new StringBuilder();

        for (char c : value) {
            str.append(c);
        }

        return str.toString();

    }
    
    
    public OwnString concat(OwnString anObject) {

        int oldSize = this.value.length;
        int newSize = oldSize + anObject.value.length;
        
        this.value = Arrays.copyOf(this.value, newSize);

        for (int i = oldSize; i < newSize; i++) {
            this.value[i] = anObject.value[i - oldSize];
        }

        return this;
        
    }
    
    public OwnString toUpperCase() {
        
        for (int i = 0; i < this.value.length; i++) {
            if (Character.isLowerCase(this.value[i])) {
                this.value[i] = Character.toUpperCase(this.value[i]);
            }
        }
        
        return this;
    }
    
    public OwnString toLowerCase() {

        for (int i = 0; i < this.value.length; i++) {
            if (Character.isUpperCase(this.value[i])) {
                this.value[i] = Character.toLowerCase(this.value[i]);
            }
        }
        
        return this;
    }
    
}
