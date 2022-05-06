
package m5.uf2.pt3;

public class M5UF2PT3 {

    public static void main(String[] args) {
        int num = 2000;
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < num; i++) {
            while (cont != 2000) {
                for (int j = 0; j < num; j++) {
                    while (cont2 !=2000) {
                        for (int k = 0; k < num; k++) {
                            System.out.println("Bucle infernal");
                        }
                        cont2++;
                    }
                }
                cont++;
            }
        }
    }
}
