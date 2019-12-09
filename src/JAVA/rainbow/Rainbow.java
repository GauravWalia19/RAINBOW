package rainbow;
import rainbow.raincolorbg.*;
import rainbow.rainformatbg.*;
import rainbow.rainformatcolor.*;
import rainbow.RainBackground;
import rainbow.RainColor;
import rainbow.RainFormat;

public class Rainbow
{
    /**
     * This function will return all the customizations of colors you need
     * @param format FORMATS (reset, bold, italic, underline, blink, cut, doubleline, overline)
     * @param textColor COLORS (D, Lg, Mg, Dg, Lr, Dr, Lw, Dw, Lb, Db, Lc, Dc, o, b, m, y, l, p)
     * @param backgroundColor BACKGROUNDS (dgreen, lgreen, mgreen, dred, lred, dorange, lorange, lblue, lwhite, dwhite, lemon, dpink, lpink, mpink)
     * @param str
     * @return
     **/
    public String get(String format, String textColor, String backgroundColor, String str){
        StringBuilder result = new StringBuilder("");

        if(str==null || str.equals("")){
            return "";
        }

        if(format!=null && textColor==null && backgroundColor==null){
            RainFormat rainformat = new RainFormat();
            result.append(rainformat.getRF(format));
            result.append(str);
        }
        else if(format==null && textColor!=null && backgroundColor==null){
            RainColor raincolor = new RainColor();
            result.append(raincolor.getRC(textColor));
            result.append(str);
        }
        else if(format==null && textColor==null && backgroundColor!=null){
            RainBackground rainbackground = new RainBackground();
            result.append(rainbackground.getRB(backgroundColor));
            result.append(str); 
        }
        else if(format!=null && textColor!=null && backgroundColor==null){
            RainFormatColor rainformatcolor = new RainFormatColor();
            result.append(rainformatcolor.getRFC(format, textColor));
            result.append(str);
        }
        else if(format!=null && textColor==null && backgroundColor!=null){
            RainFormatBG rainformatbg = new RainFormatBG();
            result.append(rainformatbg.getRFB(format, backgroundColor));
            result.append(str);
        }
        else if(format==null && textColor!=null && backgroundColor!=null){
            RainColorBG raincolorbg = new RainColorBG();
            result.append(raincolorbg.getRCB(textColor, backgroundColor));
            result.append(str);
        }
        else if(format!=null && textColor!=null && backgroundColor!=null){

        }
        return result.toString();
    }
}