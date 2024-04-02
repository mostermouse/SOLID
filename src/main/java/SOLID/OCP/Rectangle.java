package SOLID.OCP;

//개방 폐쇄의 원칙

public class Rectangle implements Shape{
    float widht;
    float height;

    float radius;

    @Override
    public float Calculator(float widht, float height) {
        return widht * height;
    }

    @Override
    public float Calculator(float radius){
        return (float) (Math.PI * radius * radius);
    }



    public static void main(String[] args) {
        Rectangle e = new Rectangle();
        e.height = 5;
        e.widht = 10;
        e.radius = 5;

        float area = e.Calculator(e.widht, e.height);
        float area2 = e.Calculator(e.radius);

        System.out.println(area);
        System.out.println(area2);
    }

}
