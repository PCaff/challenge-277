/**
 * Created by caffr on 7/26/2016.
 */

import java.util.Scanner;

public class Main {

    private static final String LIST = "4 8\n" +
            "1536 78360\n" +
            "51478 5536\n" +
            "46410 119340\n" +
            "7673 4729\n" +
            "4096 1024\n";

    //Use Euclid's algorithm to get GCD
    public static int euc_alg(int x, int y){
        int z;

        if(y > x){
            z = x;
            x = y;
            y = z;
        }

        if(y == 0)
            return x;

        if(x%y == 0)
            return y;
        else
            return euc_alg(y, x%y);

    }


    public static void main (String[] args){
        String[] tokens = LIST.split("\n");
        int x;
        int y;
        int gcd;
        for(int i=0; i<tokens.length; i++){
            String [] toks = tokens[i].split(" " );
            x = Integer.parseInt(toks[0]);
            y = Integer.parseInt(toks[1]);
            gcd = euc_alg(x, y);
            System.out.println(x/gcd +
            " " + y/gcd);
        }
    }
}
