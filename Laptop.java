package constructor.overloading;

public class Laptop {

    private int height, width;

    public Laptop() {
        height = 15;
        width = 30;
    }

    public Laptop(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        Laptop L2 = new Laptop(20, 40);
        Laptop L3 = new Laptop(50, 60);
        Laptop L4 = new Laptop();
        System.out.println("For Laptop-1:Height=" + L1.height + "Width=" + L1);
        System.out.println("For Laptop-1:Height=" + L2.height + "Width=" + L2);
        System.out.println("For Laptop-1:Height=" + L3.height + "Width=" + L3);
        System.out.println("For Laptop-1:Height=" + L4.height + "Width=" + L4);

    }

}
