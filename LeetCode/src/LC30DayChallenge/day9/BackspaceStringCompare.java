package LC30DayChallenge.day9;


public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {

        StringBuffer sBuffer = new StringBuffer(S);
        StringBuffer tBuffer = new StringBuffer(T);
        sBuffer.trimToSize();
        tBuffer.trimToSize();
        while (sBuffer.indexOf("#") != -1 || tBuffer.indexOf("#") != -1) {

            int sI = sBuffer.indexOf("#");
            if (sI != -1)sBuffer.deleteCharAt(sI);
            if (sI - 1 >= 0) sBuffer.deleteCharAt(sI - 1);

            int tI = tBuffer.indexOf("#");
            if (tI != -1) tBuffer.deleteCharAt(tI);
            if (tI - 1 >= 0) tBuffer.deleteCharAt(tI - 1);
            System.out.println(sBuffer+ " "+tBuffer);

        }


        return sBuffer.compareTo(tBuffer) == 0;
    }

}
