class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirst(i); 
                o.setSecond(j); 
                System.out.print(o.performAction()); 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


class MySecondClass {
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
