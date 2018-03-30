public class Rectangulator {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle r = new Rectangle(length, width);
        String output = String.format(
                "*** Rectangle:\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %s",
                r.length, r.width, r.getArea(), r.getPerimeter());
        System.out.println(output);
    }
}
