class Shape {

   private String name ;
   private int length ;
   private int breadth ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
class  Rectangle extends Shape {

    int area(int length, int breadth) {
        return  length * breadth ;
    }
}
public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle() ;
        r1.setLength(10) ;
        r1.setBreadth(20) ;
        int areaOfRectangle = r1.area(r1.getLength(),r1.getBreadth()) ;
        System.out.println(areaOfRectangle); // 200
    }
}
