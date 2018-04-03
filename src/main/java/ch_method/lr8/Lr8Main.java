package ch_method.lr8;

public class Lr8Main {
    private static double x[]={-5,1,0,1,1.5,2};
    private static double y[]={6f,2.8f,1.6f,2.8f,6.0f,8.0f};
    private static double sumx;
    private static double sumy;
    private static double sumpow;
    private static double sumxy;
    private static int n=6;
    public double metodB(){
        double b=(sumy-metodA()*sumx)/n;
        return b;
    }
    public double metodA(){

        for (int i = 0; i < n; i++) {
            sumx+=x[i];
            sumy+=y[i];
            sumpow+=Math.pow(x[i],2);
            sumxy+=x[i]*y[i];
        }
        double a=(n*sumxy-sumx*sumy)/(n*sumpow+sumx*sumx);
        return a;
    }
    public double metodStepen(double X){
        double y1 = metodA()+Math.log(X)*metodB();
        double Y=Math.pow(Math.E,y1);
        return Y;
    }
    public double metodPokaz(double X){
        double y1=metodA()+X*metodB();
        double Y=Math.pow(Math.E,y1);
        return  Y;
    }
    public double metodLin(double X){
        double Y=X*metodA()+metodB();
        return  Y;
    }
    public static void main(String[] args) {
        Lr8Main main =new Lr8Main();
        for (int i = 0; i <n; i++) {System.out.print("x:  "+x[i]);
            System.out.println(" y:  "+main.metodStepen(x[i]));

        }
        for (int i = 0; i <n; i++) {System.out.print("x:  "+x[i]);
            System.out.println(" y:  "+main.metodPokaz(x[i]));

        }
        for (int i = 0; i <n; i++) {System.out.print("x:  "+x[i]);
            System.out.println(" y:  "+main.metodLin(x[i]));

        }

    }
}


