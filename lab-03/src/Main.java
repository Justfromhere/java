//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //A
        //A2
        double [] A = {1,2,3,4,5,6,7,8,9,10};

        //A3
        for(int i=0;i<A.length;i++) {
//            System.out.println(A[i]);
        }

        //A4
        for(int i=0;i<A.length;i++){
            if (A[i]%3==0) {
//                System.out.println(A[i]);
            }
        }

        //A5
        int [] B = new int[6];

        //A6
        for(int i=0;i<B.length;i++) {
            B[i] = (int)A[i];
        }

        //A7
        for (int i = 1; i < B.length; i+=2) {
//            System.out.println(B[i]);
        }

        //A8
        long [][] C = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,7}
        };

        //A9
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
//                System.out.print(C[i][j]+" ");
            }
//            System.out.println();
        }

        //Б
        //Б1
        short [] D = {1,2,3,4,5,6,7,8,9,10,11,12};

        //Б2
        for (int i = 0;i<D.length;i++){
            if(D[i] % 4 == 0) {
//                System.out.println(D[i]);
            }
        }

        //Б3
        float [] D1 = new float[9];

        //Б4
        for (int i = 0;i<D1.length; i++) {
            D1[i] = (float) D[i] / 2;
//            System.out.println(D1[i]);
        }

        //Б5
        for (int i = 0; i<D1.length; i+=3) {
//            System.out.println(D1[i]);
        }

        //Б6
        byte [][] E = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44},
                {51,52,53,54},
        };

        //Б7
        short [][] E1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
        };

        //Б8
        for (int i=0; i < E.length;i++) {
            for (int j=0; j< E[i].length; j++) {
                E1[i][j] = (short) (E[i][j] + E1[i][j]);
            }
        }

        //Б9
        for (int i = 0; i < E1.length; i++) {
            for (int j = 0; j < E1[i].length; j++) {
                System.out.print(E1[i][j]+ " ");
            }
            System.out.println();
        }

        //Б10
        for (int i=0; i < E.length;i++) {
            for (int j=0; j< E[i].length; j++) {
                int sum = + E[i][j];
                System.out.println(sum);
            }
        }
    }
}