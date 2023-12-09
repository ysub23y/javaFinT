package Ch6;

public class Pr2 { //상속 테스트
    public static void main(String[] args) {
        ColoredRectangle c = new ColoredRectangle();
    }
}
class Shape{
    int x;
    int y;
    public Shape(){
        this.x = 0;
        this.y = 0;
        System.out.println("Shape()");
    }
}
class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(){
        width = 2;
        height = 6;
        System.out.println("Rectangle()");
    }

    double calcArea(){
        return width *height / 2;
    }

}
class ColoredRectangle extends Rectangle {
    String color;

    public ColoredRectangle (){
        color = "무색";
        System.out.println("ColoredRectangle()");
    }


}