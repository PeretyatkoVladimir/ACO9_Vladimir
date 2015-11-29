package cw.week4;

public class TestStudent {

    private String data[];

    public TestStudent(String name, String surname) {
        this.data = new String[2];
        this.data[0] = name;
        this.data[1] = surname;
    }

    public String[] getData() {
        return data;
    }

    public String[] getDataClone() {
        return this.data.clone();
    }

    @Override
    public String toString(){
        String res = "{ ";
        for (String s : this.data) {
            res += s + " ";
        }
        return res + "}";
    }

}
