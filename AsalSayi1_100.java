public class AsalSayi1_100 {
    public static void main(String[] args) {

        int takipSayaci=0;
        int i,j;
          for (i=2;i<100;i++){
              for(j=2; j<i; j++){
                  if(i%j==0) takipSayaci++;
              }
              if (takipSayaci==0) System.out.print(i +" - ");
              takipSayaci=0;
          }

        }
    }
