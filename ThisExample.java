class Main {
    // declare variables
    int x;
    int y;

    Main(int x, int y) {
       // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(Main o){
        o.x += 2;
        o.y += 2;
    }
}

class ThisExample {
    public static void main( String[] args ) {
        Main obj = new Main(1, -2);
    }
}
