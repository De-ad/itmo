public class lab_1{

    public double countValue_1(double x) {
        return Math.pow((Math.E), (Math.asin((x - 1.5) / 9)));
    }
    public static double countValue_2(double x){
        return Math.pow(x, 1 / 3);
    }
    public static double countValue_3(double x){
        return Math.tan(Math.log(Math.pow(Math.tan(Math.sin(Math.pow(Math.E, x))), 2)));
    }


    public static short[] arrayInit(){
        short b[] = new short[16];
        for(short i=15; i>=0; i-- ){
            b[i]=(short)(i+2);
        }
        return b;
    }
    public static float[] arrayInit_2(){
        float x[] = new float[20];
        for(int i=0; i< x.length; i++) {
            x[i] = (float) (Math.random() * 9) - 6;
        }
        return x;
    }


    public static void main(String[] args) {
        short a[] = new short[16];
        float x[] = new float[20];
        a =arrayInit();
        x= arrayInit_2();
        double [][] b = new double [16][20];
        for (int i=0;i<16;i++){
            for (int j=0; j<20; j++){
                switch (a[i]) {
                    case 13:
                        b[i][j] = countValue_1(x[j]);
                        break;
                    case 2:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                        b[i][j] = countValue_2(x[j]);
                        break;
                    default:
                        b[i][j] = countValue_3(x[j]);
                        break;
                }
                System.out.printf("%-8.3f" , b[i][j]);
            }
            System.out.println("");
        }
    }
}

