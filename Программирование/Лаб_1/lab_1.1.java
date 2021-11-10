public class lab_1{
    public static double countValue(double x){
        return Math.tan(Math.log(Math.pow(Math.tan(Math.sin(Math.pow(Math.E, x))), 2)));
    }
    public static short[] arrayInit(){
        short b[] = new short[16];
        for(short i=15; i>=0; i-- ){
            b[i]=(short)(i+2);
        }
        return b;
    }
    public static void main(String[] args) {
        short a[] = new short[16];
        a=arrayInit();
        float x[] = new float[20];
        for(int i=0; i<a.length; i++){
            x[i]=(float)(Math.random()*9) -6;
        }
        double [][] b = new double [16][20];
        for (int i=0;i<16;i++){
            for (int j=0; j<20; j++){
                switch (a[i]) {
                    case 13:
                        b[i][j] = Math.pow((Math.E), (Math.asin((x[j] - 1.5) / 9)));
                        break;
                    case 2:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                        b[i][j] = Math.pow(x[j], 1 / 3);
                        break;
                    default:
                        b[i][j] = countValue(x[j]);
                        break;
                }
                System.out.printf("%-8.3f", b[i][j]);
            }
            System.out.println("");
        }
    }
}
