package donguler;

public class AsalSayi {
    public static void main(String[] args) {
        for (int i = 2; i<100; i++){
            int index = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0) index++;
            }
            // 1 den ve kendinden başka tam böleni olmadığı için asal sayıların 2 tane tam böleni vardır.
            // Burada onu test ediyoruz
            if(index==2) System.out.print(i + " ");
        }
    }
}
