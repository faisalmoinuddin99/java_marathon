
class Point {

    private int x ;
    private int y ;

    // modified constructor
    Point(int a, int b){
        x = a ;
        y = b ;
    }

    public void displayPoints(){
        System.out.println("x: "+ x + " y: " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20) ;
        p1.displayPoints(); // x: 10 y: 20
    }
}