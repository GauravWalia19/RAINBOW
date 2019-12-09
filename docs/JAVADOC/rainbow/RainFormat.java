package rainbow;

public class RainFormat
{   
    private final String RESET       = "\u001B[0m";      // color reseter
    private final String BOLD        = "\u001B[1m";      // bold text
    private final String ITALIC      = "\u001B[3m";  	// italic text
    private final String UNDERLINE   = "\u001B[4m";      // under line text
    private final String BLINK       = "\u001B[5m";      // blink text
    private final String HIDDEN      = "\u001B[8m";      // hidden text
    private final String CUT         = "\u001B[9m";      // strikethrough text
    private final String DOUBLELINE  = "\u001B[21m";     // double line text
    private final String OVERLINE    = "\u001B[53m";     // overline text

    /**
     * This function will return all formatted strings
     * @param format
     * @return String
     **/
    public String getRF(String format){
        switch(format){
            case "reset":
                return this.RESET;
            case "bold":
                return this.BOLD;
            case "italic":
                return this.ITALIC;
            case "underline":
                return this.UNDERLINE;
            case "blink":
                return this.BLINK;
            case "hidden":
                return this.HIDDEN;
            case "cut":
                return this.CUT;
            case "doubleline":
                return this.DOUBLELINE;
            case "overline":
                return this.OVERLINE;
            default:
                return "";
        }
    }
}