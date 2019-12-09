package rainbow;

public class RainBackground
{
    private final String BGDGREEN    = "\u001B[40m";         // dark green color
    private final String BGLGREEN    = "\u001B[42m";         // light green color
    private final String BGMGREEN    = "\u001B[100m";        // medium green color
    private final String BGDRED      = "\u001B[41m";	     // dark red color
    private final String BGLRED      = "\u001B[101m";	    // light red color
    private final String BGDORANGE   = "\u001B[43m";	    // dark orange color
    private final String BGLORANGE   = "\u001B[102m";	    // light orange color
    private final String BGLBLUE     = "\u001B[44m";		// light blue color
    private final String BGLWHITE    = "\u001B[47m";		// light white color
    private final String BGDWHITE    = "\u001B[107m";	    // dark white color
    private final String BGLEMON     = "\u001B[103m";        // lemon color
    private final String BGMPINK     = "\u001B[104m";        // medium pink color
    private final String BGDPINK     = "\u001B[105m";        // dark pink color
    private final String BGLPINK     = "\u001B[106m";        // light pink color

    /**
     * This function will return the background colors
     * BACKGROUNDS (dgreen, lgreen, mgreen, dred, lred, dorange, lorange, lblue, lwhite, dwhite, lemon, dpink, lpink, mpink)
     * @param backgroundColor
     * @return
     **/
    public String getRB(String backgroundColor){
        switch(backgroundColor){
            case "dgreen":
                return this.BGDGREEN;
            case "lgreen":
                return this.BGLGREEN;
            case "mgreen":
                return this.BGMGREEN;
            case "dred":
                return this.BGDRED;
            case "lred":
                return this.BGLRED;
            case "dorange":
                return this.BGDORANGE;
            case "lorange":
                return this.BGLORANGE;
            case "lblue":
                return this.BGLBLUE;
            case "lwhite":
                return this.BGLWHITE;
            case "dwhite":
                return this.BGDWHITE;
            case "lemon":
                return this.BGLEMON;
            case "dpink":
                return this.BGDPINK;
            case "lpink":
                return this.BGLPINK;
            case "mpink":
                return this.BGMPINK;
            default:
                return "";
        }
    }
}