import rainbow.RainFormat;
import rainbow.raincolorbg.*;
import rainbow.rainformatbg.RainFormatBG;
import rainbow.rainformatcolor.RainFormatColor;
public class Main
{
    public static void main(String[] args) {
        RainColorBG obj = new RainColorBG();
        RainFormat rf = new RainFormat();
        RainFormatColor rfc = new RainFormatColor();
        RainFormatBG rfb = new RainFormatBG();

        System.out.println(obj.getRCB("Lr", "lwhite")+"Hello World" + rf.RESET);
        System.out.println(rfc.getRFC("italic", "Lr") + "Hello World" + rf.RESET);
        System.out.println(rfb.getRFB("cut", "lemon") + "Hello World" + rf.RESET);
    }
}