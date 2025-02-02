package homeWork;

public class Rectangle3 {
	int width;
    int height;

    public Rectangle3() {
        width = 1;
        height = 1;
    }

    public Rectangle3(int side) {
        width = side;
        height = side;
    }

    public Rectangle3(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle3 rect1 = new Rectangle3();
        Rectangle3 rect2 = new Rectangle3(5);
        Rectangle3 rect3 = new Rectangle3(4, 7);

        System.out.println(rect1.width + " " + rect1.height);
        System.out.println(rect2.width + " " + rect2.height);
        System.out.println(rect3.width + " " + rect3.height);
    }
}
