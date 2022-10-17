public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public int area(int length, int width) {
        return length * width;
    }

    public int obwod(int length, int width) {
        int obwod = 2 * length + 2 * width;
        return obwod;
    }

    public static void main(String[] args) {
        Rectangle main = new Rectangle(1, 2);
    }
}
