public class SumarParImpar {
    /*Jorge Romero C*/
    public static void main(String[] args) {
            int par = 0;
            int  impar = 0;
        for (int i=0; i < 100; i++) {
            if (i % 2 == 0) {
                par = par + i;
            }else if(!(i %2 == 0)){
                impar = impar + i;
            }
        }
        System.out.println(par);
        System.out.println(impar);
    }
}
