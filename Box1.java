package pkgdefault.constructor;

public class Box1 {

    int height;
    int width;

    public Box1() {
        System.out.println("Box created");
        this.height = 10;
        this.width = 20;
    }

    public static void main(String[] args) {
        Box1 box1 = new Box1();
        System.out.println("\nHeight of box1:" + box1.height);
        System.out.println("Width of box1:" + box1.width);
        Box1 box2 = new Box1();
        System.out.println("\nHeight of box1:" + box2.height);
        System.out.println("Width of box1:" + box2.width);

    }

}
