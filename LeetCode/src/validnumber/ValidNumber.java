package validnumber;

//TODO
public class ValidNumber {

    public boolean isNumber2(String s, boolean nextCanBeE, boolean nextCanBePM, boolean canNextValueBeDot, boolean wasNonDigit) {
        char[] chr = s.toCharArray();
        if (s.length() == 0 && wasNonDigit){
            return false;
        }

        for (int i = 0; i < chr.length; i++) {
            int aCh = chr[i];
            String nextSubString = s.substring(i+1);
            if (isDigit(aCh)) {
                return isNumber2(nextSubString, nextSubString.length() > 0 && nextCanBeE, false , nextSubString.length() > 0 && canNextValueBeDot, false);
            } else if ((aCh == 43 || aCh == 45) && nextCanBePM){
                return isNumber2(nextSubString,  false, false, false, true);
            } else if (aCh == 101 && nextCanBeE){
                return isNumber2(nextSubString, false, nextSubString.length() > 0 && nextCanBePM, nextSubString.length() > 0 && canNextValueBeDot, true);
            } else if (aCh == 46 && canNextValueBeDot){
                return isNumber2(nextSubString,  false, false, false, true);
            } else
                return false;
        }

        return true;
    }

    public boolean isNumber(String s){
        if(s == null) return false;
        s = s.trim();
        if(s.length()> 0)
            return isNumber2(s,  false, true, true, false);
        return false;
    }

    private boolean isDigit(int digitalAscii) {
        return digitalAscii >= 48 && digitalAscii <= 57;
    }

}
