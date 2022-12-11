// import java.util.List;

// public class Main {

//     private Integer sumPeople;

//     private String nameBuyer;

//     private final Integer MAX_ORDER = 10;

//     //TODO("Create List Menu Variabel - Use List into this and @MenuSpecial.java")

//     //TODO("Create List Menu Order Here")

//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//     }


//     private void setSumPeople(Integer sumPeople) {
//         this.sumPeople = sumPeople;
//     }

//     private void setNameBuyer(String nameBuyer) {
//         this.nameBuyer = nameBuyer;
//     }

//     //TODO("Initialize list default menu here")

//     //TODO("Create function to list Menu Order here, we can using looping like 'for' to input order menu")

//     //TODO("Create function to counting menu * qty")

//     //TODO("showing final output")

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AplikasiRamalan {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String NamaAnda, NamaPasangan;
        int UmurAnda, UmurPasangan;
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        
        System.out.println("Data Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda : ");
        NamaAnda = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        UmurAnda = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Data Pasangan Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        NamaPasangan = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        UmurPasangan = input.nextInt();
        System.out.println();
       
        System.out.println(NamaAnda+" ["+UmurAnda+ "] tahun" );
        System.out.println();
        final int N = 3;
        for (int i = 0; i < N; i++) {
             for (int j = 0; j < 5 * N; j++) {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));
                if (d1 < N + 0.5 || d2 < N + 0.5) {
                     System.out.print('♥');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        for (int i = 1; i <= 2 * N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
            System.out.print('♥');
            }
            System.out.print(System.lineSeparator());
        }
        System.out.println();
        System.out.println(NamaPasangan+" ["+UmurPasangan+ "] tahun" );
    
        System.out.println();
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        breakConsule();
        System.out.println();

        double kecocokan = new Random().nextDouble();
        int terendah = 50;
        int tertinggi = 100;
        double value = (terendah + (kecocokan*(tertinggi - terendah)) / 1.1);
        System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f\n", value, " %");
        System.out.println("\n");
        System.out.println("Terima Kasih anda telah menggunakan jasa Ramalan Kami.. ^^v");
        
    }
    private static void breakConsule() {
        try{
            System.in.read();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


}
