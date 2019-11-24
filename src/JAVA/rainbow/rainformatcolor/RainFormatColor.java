package rainbow.rainformatcolor;

public class RainFormatColor
{
    /**
     * This function will return the formatted colored string
     * 
     * FORMATS (bold, italic, underline, blink, cut, doubleline, overline)
     * COLORS (Lg, Mg, Dg, Lr, Dr, Lw, Dw, Lb, Db, Lc, Dc, o, b, m, y, l, p)
     * @param format 
     * @param color 
     * @return formatted color string
     **/
    public String getRFC(String format, String color)
    {
        IRainFormatColor obj = null;
        switch(color)
        {
            case "Lg":
                obj = new LightGreenRFC();
                break;
            case "Mg":
                obj = new MediumGreenRFC();
                break;
            case "Dg":
                obj = new DarkGreenRFC();
                break;
            case "Lr":
                obj = new LightRedRFC();
                break;
            case "Dr":
                obj = new DarkRedRFC();
                break;
            case "Lw":
                obj = new LightWhiteRFC();
                break;
            case "Dw":
                obj = new DarkWhiteRFC();
                break;
            case "Lb":
                obj = new LightBlueRFC();
                break;
            case "Db":
                obj = new DarkBlueRFC();
                break;
            case "Lc":
                obj = new LightCyanRFC();
                break;
            case "Dc":
                obj = new DarkCyanRFC();
                break;
            case "o":
                obj = new OrangeRFC();
                break;
            case "b":   
                obj = new BlackRFC();
                break;
            case "m":
                obj = new MagentaRFC();
                break;
            case "y":
                obj = new YellowRFC();
                break;
            case "l":
                obj = new LemonRFC();
                break;
            case "p":
                obj = new PinkRFC();
                break;
            default:
                return "";
        }
        return getFormat(obj, format);
    }
    
    private String getFormat(IRainFormatColor obj, String format)
    {
        switch(format)
        {
            case "bold":
                return obj.getBold();
            case "italic":
                return obj.getItalic();
            case "underline":
                return obj.getUnderline();
            case "blink":
                return obj.getBlink();
            case "cut":
                return obj.getStrikeThrough();
            case "doubleline":
                return obj.getDoubleLine();
            case "overline":
                return obj.getOverLine();
            default:
                return "";
        }
    }
}