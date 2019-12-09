package rainbow;
public class RainColor
{
    private final String DEFAULT = "\u001B[99m";         // default color
    private final String LGREEN  = "\u001B[32m";         // light green color
    private final String MGREEN  = "\u001B[2m"; 		    // medium green color
    private final String DGREEN  = "\u001B[90m";         // dark green color
    private final String LRED    = "\u001B[91m";  		// light red color
    private final String DRED    = "\u001B[31m";  		// dark red color
    private final String LWHITE  = "\u001B[37m"; 		// light white color
    private final String DWHITE  = "\u001B[97m"; 		// dark white color
    private final String LBLUE   = "\u001B[94m";         // light blue color
    private final String DBLUE   = "\u001B[34m"; 		// dark blue color
    private final String LCYAN   = "\u001B[96m"; 		// light cyan color
    private final String DCYAN   = "\u001B[36m"; 		// dakr cyan color
    private final String ORANGE  = "\u001B[33m";         // orange color
    private final String BLACK   = "\u001B[30m"; 		// black color
    private final String MAGENTA = "\u001B[35m"; 	    // magenta color
    private final String YELLOW  = "\u001B[33m"; 		// yellow color
    private final String LEMON   = "\u001B[93m";         // lemon color
    private final String PINK    = "\u001B[95m";         // pink color

    /**
     * COLORS (D, Lg, Mg, Dg, Lr, Dr, Lw, Dw, Lb, Db, Lc, Dc, o, b, m, y, l, p)
     * @param textColor
     * @return
     **/
    public String getRC(String textColor){
        switch(textColor){
            case "D":
                return this.DEFAULT;
            case "Lg":
                return this.LGREEN;
            case "Mg":
                return this.MGREEN;
            case "Dg":
                return this.DGREEN;
            case "Lr":
                return this.LRED;
            case "Dr":
                return this.DRED;
            case "Lw":
                return this.LWHITE;
            case "Dw":
                return this.DWHITE;
            case "Lb":
                return this.LBLUE;
            case "Db":
                return this.DBLUE;
            case "Lc":
                return this.LCYAN;
            case "Dc":
                return this.DCYAN;
            case "o":
                return this.ORANGE;
            case "b":
                return this.BLACK;
            case "m":
                return this.MAGENTA;
            case "y":
                return this.YELLOW;
            case "l":
                return this.LEMON;
            case "p":
                return this.PINK;
            default:
                return "";
        }
    }
}