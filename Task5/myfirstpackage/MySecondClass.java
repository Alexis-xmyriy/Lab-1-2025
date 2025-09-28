package myfirstpackage;

public class MySecondClass {
    private int first;
    private int second;
    public MySecondClass(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public int getFirst() {
        return first;
    }
    public void setFirst(int value) {
        this.first = value;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int value) {
        this.second = value;
    }
    public int performAction() {
        return first + second;		
    }
}