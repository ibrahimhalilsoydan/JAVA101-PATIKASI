
public class DİziElemanFrekans {
    public static void main(String[] args) {

                int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

                // Dizideki her bir elemanı işlemek için döngü
                for (int i = 0; i < dizi.length; i++) {
                    int eleman = dizi[i];

                    // Eleman zaten işlenmişse, devam et
                    if (eleman == -1) {
                        continue;
                    }

                    int frekans = 0;

                    // Dizi içinde elemanın kaç kez tekrar ettiğini sayalım
                    for (int j = 0; j < dizi.length; j++) {
                        if (dizi[j] == eleman) {
                            frekans++;
                            // Elemanı işaretleyelim
                            dizi[j] = -1;
                        }
                    }

                    // Elemanın frekansını yazdıralım
                    System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");

                }
            }
        }
