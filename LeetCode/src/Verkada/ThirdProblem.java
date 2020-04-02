package Verkada;

import java.util.ArrayList;

public class ThirdProblem {

    static ArrayList<String> a2(String q){
        System.out.println(q);
        ArrayList<String> answer = new ArrayList<>();

        int ioffset = 1;

        while(ioffset < 4 && ioffset<q.length()){
            int first = Integer.parseInt(q.substring(0,ioffset));
            if(first > 255){
                break;
            }

            int joffset = ioffset + 1;
            while(joffset < ioffset + 4 && joffset < q.length()){
                int second = Integer.parseInt(q.substring(ioffset,joffset));
                if(second > 255){
                    break;
                }

                int koffset = joffset + 1;
                while(koffset < joffset + 4 && koffset < q.length()){
                    int third = Integer.parseInt(q.substring(joffset,koffset));
                    if(third > 255){
                        break;
                    }

                    if(!q.substring(koffset, q.length()).equals("")) {
                        int fourth = Integer.parseInt(q.substring(koffset, q.length()));
                        String oIp = first + "" + second + "" + third + "" + fourth;

                        if (fourth < 256 && oIp.length() == q.length()) {
                            answer.add(first + "." + second + "." + third + "." + fourth);
                        }
                    }
                    koffset++;
                }
                joffset++;
            }

            ioffset++;
        }

        return answer;
    }

    public  static  void main(String [] args){
        ArrayList<String> r = a2("19216855");
        System.out.println(r);
    }

}
