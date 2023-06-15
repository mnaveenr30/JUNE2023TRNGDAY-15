interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing Circle");}
}
class TestInterface1{
    public static void main(String args[]){
        Drawable d;
        d=new Circle();
        d.draw();
        d=new Rectangle();
        d.draw();
    }
}