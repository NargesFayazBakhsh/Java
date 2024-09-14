package xor;
import java.util.Random;

public class Xor {
    public static void main(String[] args) {

        int n = 25000;
        double a = 0.5;


       double [] w = new double[9];
        Random random = new Random();
        for(int j=0;j<9;j++)
            w[j] = -0.5 +(0.5+0.5) * random.nextDouble();

        System.out.println("n = "+n);
        System.out.println("alfa = "+a);

        System.out.println("\n"+"befor:");
        System.out.println("v01= "+w[0]+"\t"+"v11= "+w[1]+"\t"+"v21= "+w[2]);
        System.out.println("v02= "+w[3]+"\t"+"v12= "+w[4]+"\t"+"v22= "+w[5]);
        System.out.println("w01= "+w[6]+"\t"+"w11= "+w[7]+"\t"+"w21= "+w[8]);

        for(int i = 0 ; i<=n ; i++) {
            System.out.println("\nn = "+i);
            System.out.println("\n"+"x1 = 1 , x2 = 1");
            w = MLP(1, 1, w, -1, a);
            System.out.println("v01= "+w[0]+"\t"+"v11= "+w[1]+"\t"+"v21= "+w[2]);
            System.out.println("v02= "+w[3]+"\t"+"v12= "+w[4]+"\t"+"v22= "+w[5]);
            System.out.println("w01= "+w[6]+"\t"+"w11= "+w[7]+"\t"+"w21= "+w[8]);

            System.out.println("\n"+"x1 = 1 , x2 = -1");
            w = MLP(1, -1, w, 1, a);
            System.out.println("v01= "+w[0]+"\t"+"v11= "+w[1]+"\t"+"v21= "+w[2]);
            System.out.println("v02= "+w[3]+"\t"+"v12= "+w[4]+"\t"+"v22= "+w[5]);
            System.out.println("w01= "+w[6]+"\t"+"w11= "+w[7]+"\t"+"w21= "+w[8]);

            System.out.println("\n"+"x1 = -1 , x2 = 1");
            w = MLP(-1, 1, w, 1, a);
            System.out.println("v01= "+w[0]+"\t"+"v11= "+w[1]+"\t"+"v21= "+w[2]);
            System.out.println("v02= "+w[3]+"\t"+"v12= "+w[4]+"\t"+"v22= "+w[5]);
            System.out.println("w01= "+w[6]+"\t"+"w11= "+w[7]+"\t"+"w21= "+w[8]);

            System.out.println("\n"+"x1 = -1 , x2 = -1");
            w = MLP(-1, -1, w, -1, a);
            System.out.println("v01= "+w[0]+"\t"+"v11= "+w[1]+"\t"+"v21= "+w[2]);
            System.out.println("v02= "+w[3]+"\t"+"v12= "+w[4]+"\t"+"v22= "+w[5]);
            System.out.println("w01= "+w[6]+"\t"+"w11= "+w[7]+"\t"+"w21= "+w[8]);
        }


    }
    public static double[] MLP(double x1 , double x2,double we [], int t , double a){
        // we = double v01 , double v11 , double v21,
        // double v02 , double v12 , double v22 ,
        // double w01 ,double w11 , double w21
        double z1 = feed(x1,x2,we[0],we[1],we[2]);
        double z2 = feed(x1,x2,we[3],we[4],we[5]);
        double y1 = feed(z1,z2,we[6],we[7],we[8]);
        System.out.println("y = "+y1);

        double e1 = error(t-y1,y1);
        double ez1 = error(e1*we[7],z1);
        double ez2 = error(e1*we[8],z2);

        double [] weight = new double[9];


        weight[6]=   weight(a,e1,1) + we[6];
        weight[7] = weight(a,e1,z1) + we[7];
        weight[8] = weight(a,e1,z2) + we[8];

// z1
        weight[0]=weight(a,ez1,1) + we[0];
        weight[1] = weight(a,ez1,z1) + we[1];
        weight[2] = weight(a,ez1,z2) + we[2];

// z2
        weight[3] = weight(a,ez2,1) + we[3];
        weight[4] = weight(a,ez2,z1) +we[4];
        weight[5] = weight(a,ez2,z2) + we[5];

        return weight;
    }
    public static double feed(double x1 , double x2 ,double w0 , double w1 , double w2){
        double y_in = w0 + x1*w1 + x2*w2;
        double y = (1- Math.exp(-y_in))/(1+ Math.exp(-y_in));
   //     double y = 1/(1+ Math.exp(-y_in));
        return y;
    }
    public static double error(double t , double y){
        double e1 = t*0.5*(1+y)*(1-y);
        //    double e1 = t*0.5*y*(1-y);
        return e1;
    }
    public static double weight(double a , double e , double z){
        double dw = a*e*z;
        return dw;
    }
}
