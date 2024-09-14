import java.util.Random;

public class Code {
    public static void main(String[] args) {

        int n =50000;
        double a =0.05;
        double [] w = new double[522];

        Random random = new Random();
        for(int j=0;j<w.length;j++)
            w[j] = -0.5 +(0.5+0.5) * random.nextDouble();

        System.out.println("n = "+n+"  alfa = "+a);

        System.out.println("\n"+"before:");
        System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
        for(int i = 0;i<522;i++){
            System.out.printf("%f ",w[i]);
        }


        //      System.out.println(w.length);
        double [] x1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double [] x2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        double [] x3 = {0, 9, 1, 8, 2, 7, 3, 6, 4, 5};
        double [] x4 = {4, 5, 6, 3, 2, 7, 1, 8, 0, 9};
        double [] x5 = {3, 8, 2, 7, 1, 6, 0, 5, 9, 4};
        double [] x6 = {1, 6, 0, 7, 4, 8, 3, 9, 2, 5};
        double [] x7 = {2, 1, 3, 0, 4, 9, 5, 8, 6, 7};
        double [] x8 = {9, 4, 0, 5, 1, 6, 2, 7, 3, 8};



        int o ;
        for(o = 1 ; o<n ; o++) {
            System.out.println("n = " + o);
            // 1
            w = MLP(x1, w, -1, -1, a);
// 2
            w = MLP(x2, w, 1, 1, a);
// 3
            w = MLP(x3, w, -1, 1, a);
//4
            w = MLP(x4, w, 1, -1, a);
//5
            w = MLP(x5, w, 1, 1, a);
//6
            w = MLP(x6, w, 1, -1, a);
//7
            w = MLP(x7, w, -1, 1, a);
//8
            w = MLP(x8, w, -1, -1, a);
        }

        System.out.println("n = " + o);

// 1
            System.out.println("\n" + "x1:");
            w = MLP(x1, w, -1, -1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
// 2
            System.out.println("\n" + "x2:");
            w = MLP(x2, w, 1, 1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
// 3
            System.out.println("\n" + "x3:");
            w = MLP(x3, w, -1, 1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
// 4
            System.out.println("\n" + "x4:");
            w = MLP(x4, w, 1, -1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
//5
            System.out.println("\n" + "x5:");
            w = MLP(x5, w, 1, 1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
//6
            System.out.println("\n" + "x6:");
            w = MLP(x6, w, 1, -1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
//7
            System.out.println("\n" + "x7:");
            w = MLP(x7, w, -1, 1, a);
            System.out.println("\nv01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }
//8
            System.out.println("\n" + "x8:");
            w = MLP(x8, w, -1, -1, a);
            System.out.println("v01,v11,v21,..v02,v12,v22...w01,w11,...\n");
            for (int i = 0; i < 522; i++) {
                System.out.printf("%f ", w[i]);
            }

        }


        public static double[] MLP(double x [] ,double we [], int t1 , int t2 , double a){
         // we = double v01 , double v11 , double v21,
        // double v02 , double v12 , double v22 ,
        // double w01 ,double w11 , double w21
//        double [] s = {we[0],we[1],we[2],we[3],we[4],we[5],we[6],we[7],we[8],we[9],we[10]};
        double [] z = new double[40];
        double [] ws = new double[11];

        int u = 0; // u +11
        for(int ii = 0 ; ii < 40 ; ii ++) {

            for (int n = 0; n < 11; n++)
                ws[n] = we[n + u];

            u = u + 11;
            z[ii] = feed(x, ws);
        }

        u = 440;
        double [] wss = new double[41];
        for (int n = 0; n <= 40; n++)
            wss[n] = we[n + u];
        double y1 = feed(z,wss);
        System.out.println("y1 = "+y1);
        u = 481;
        for (int n = 0; n <= 40; n++) {
                wss[n] = we[n + u];
            }
        double y2 = feed(z,wss);
        System.out.println("y2 = "+y2);

        double e1 = error(t1-y1,y1);
        double e2 = error(t2-y2,y1);

        double [] ez = new double[40];
        for(int k=0 ; k<10 ; k++) {
            ez[k] = error(e1 * we[440+k] + e2 * we[481+k], z[0]);
        }
        double [] weight = new double[522];

        weight[440] = weight(a,e1,1) + we[440];
            for (  int i = 0 ; i<40 ; i++)
                weight[441+i] = weight(a,e1,z[i]) + we[441];

            // weight w (z2->y)   40
               // bayas
            weight[481] = weight(a,e2,1) + we[481];
            for (  int i = 0 ; i<40 ; i++)
                weight[482+i] = weight(a,e2,z[i]) + we[482+i];
// weight v (x -> z)
            int k = 0;
            for (int p = 0 ; p<40 ; p++) {
                // bayas
                weight[0+k] = weight(a, ez[p], 1) + we[0+k];
                for (int i = 0; i < 10; i++)
                    weight[1 + i + k] = weight(a, ez[p], z[p]) + we[1+i];
                k = k + 11;
            }

        return weight;

    }

    public static double feed( double x [], double w []){
        int i , j;
        double y_in = w[0];
        for(i = 0 ; i<x.length ; i++) {
            y_in = x[i] * w[i + 1] + y_in;
        }
 //       double y_in = w[0] + x[0]*w[1] + x[1]*w[2] + x[2]*w[3] + x[3]*w[4] + x[4]*w[5] + x[5]*w[6];
        double y = (1- Math.exp(-y_in))/(1+ Math.exp(-y_in));
        //      double y = 1/(1+ Math.exp(-y_in));
       return y;
    }
    public static double error(double t , double y){
        double e1 = t*0.5*(1+y)*(1-y);
        //      double e1 = t*0.5*y*(1-y);

        return e1;
    }
    public static double weight(double a , double e , double z){
        double dw = a*e*z;
        return dw;
    }
}
