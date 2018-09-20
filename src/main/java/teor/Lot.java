package teor;

public class Lot {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 25; i++) {
            for (int j = 1; j <= 25; j++) {
               for (int k = 1; k <= 25; k++) {
                    for (int l = 1; l <= 25; l++) {
                        for (int m = 1; m <= 25; m++) {
                           if((i == j || i == k || i == l || i == m) ||
                                   (j == k || j == l || j == m) || (k == l || k == m) || (l == m)) {

                            }else {
                                System.out.println(i+" "+j+" "+k+" "+l+" "+m);
                                count++;
                           }
                        }

                   }
                }

            }

        }
        System.out.println("count = "+count);
        System.out.println("need satothi: "+(long)(count*500));
    }

}
