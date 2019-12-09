import rainbow.*;
public class Main
{
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
        String str = rainbow.get(null, "p", null, "Hello World");
        System.out.println(str);
    }
}