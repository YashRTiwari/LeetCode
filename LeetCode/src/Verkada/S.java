package Verkada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S {

    static int[] vehicleDetection(int[][] input) {

        List<Integer> answer = Arrays.stream(input[0])
                .boxed()
                .collect(Collectors.toList());

        int size = input.length - 1;

        while(size !=-1){
            List<Integer> temp = Arrays.stream(input[size])
                    .boxed()
                    .collect(Collectors.toList());
            answer.retainAll(temp);
            size = size - 1;
        }
        int[] an = new int[answer.size()];
        for (int i = 0; i < an.length; i++) {
            an[i] = answer.get(i);
        }
        return an;
    }

    static ArrayList<Integer> ne (int i, int j, int [][]image){

        ArrayList<Integer> array = new ArrayList<Integer>();

//        i-1, j-1
        if(i-1 < 0 ){

        } else {
            if(j-1 < 0){

            } else {
                array.add(image[i-1][j-1]);
            }
        }

//        i-1, j+1
        if(i-1 < 0 ){

        } else{
            if(j+1 < image[0].length) {
                array.add(image[i - 1][j + 1]);
            }
        }

//        i-1, j
        if(i-1 < 0 ){

        } else{
            array.add(image[i-1][j]);
        }

//        i,j-1
        if(j - 1 <0){

        } else {
            array.add(image[i][j-1]);
        }

//        i, j+1
        if(j+1 < image[0].length){
            array.add(image[i][j+1]);
        }

//        i+1, j-1
        if(i+1 < image.length){

            if(j-1 < 0){

            } else {
                array.add(image[i+1][j-1]);
            }
        }
//        i+1, j
        if(i+1 < image.length){
            array.add(image[i+1][j]);
        }

        if(i+1 < image.length){
            if (j+1 < image.length){
                array.add(image[i+1][j+1]);
            }
        }

        return array;
    }

    private static double average(ArrayList<Integer> list){
        double avg = 0;
        for(int item : list){
            avg += item;
        }

        return avg/list.size();
    }

    double[][] blurFaces(int[][] image) {
        double [][] answer = new double[image.length][image[0].length];

        for (int i = 0; i< image.length; i++){
            for (int j=0; j<image[0].length; j++){
                ArrayList<Integer> n = ne(i,j,image);
                double avg = average(n);
                answer[i][j] = avg;
            }

        }
        return answer;
    }

    public static void main(String [] args){
//        int [][] a = {{1,3,4,8,9,16,32,40},
//                {0,1,6,7,8,12,40,62}};
//        //double [][] answer = new double[a.length][a[0].length];
//
//        double [][] answer = new double[a.length][a[0].length];
//
//        for (int i = 0; i< a.length; i++){
//            for (int j=0; j<a[0].length; j++){
//                ArrayList<Integer> n = ne(i,j,a);
//                double avg = average(n);
//                answer[i][j] = avg;
//            }
//
//        }
//
//        for (int k = 0; k< a.length; k++){
//            for (int q=0; q<a[0].length; q++){
//                System.out.print(answer[k][q]+"         ");
//            }
//            System.out.println("");
//
//        }
        //System.out.println(vehicleDetection(a));
        ArrayList<String> r = a2("19216855");
        System.out.println(r);
    }

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

}
