import java.util.Scanner;
import java.io.IOException;

public class MenuSpecial {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int
            JumlahPesanan,
            PorsiNasi,
            PorsiAyam,
            PorsiSteak,
            PorsiKwetiaw,
            PorsiKambing
        ;
        String NamaPemesan;

        System.out.println("Aplikasi Resto");
        System.out.println("===============================\n");
        System.out.println("\t Selamat Siang...\n");
        System.out.print("\t Pesan untuk berapa orang \t: ");
        JumlahPesanan = input.nextInt();
        System.out.println();
        System.out.print("\t Pesanan atas nama \t\t: ");
        NamaPemesan = input.nextLine();
        input.nextLine();
        System.out.println("\n");

        System.out.println("\t Menu Spesial Hari ini");
        System.out.println("\t ===============================\n");
        System.out.println("\t\t 1. Nasi Goreng Spesial \t\t @ Rp. 9999.99");
        System.out.println("\t\t 2. Ayam Bakar Spesial \t\t\t @ Rp. 12345.67");
        System.out.println("\t\t 3. Steak Sirloin Spesial \t\t @ Rp. 21108.40");
        System.out.println("\t\t 4. Nasi Goreng Spesial \t\t @ Rp. 13579.13");
        System.out.println("\t\t 5. Nasi Goreng Spesial \t\t @ Rp. 98765.43");

        System.out.println("");
        System.out.println("Pesanan Anda (Batas Pesanan 0 - 10 porsi");
        System.out.print("Nasi Goreng Spesial \t= ");
        PorsiNasi = input.nextInt();
        System.out.print("Ayam Bakar Spesial \t= ");
        PorsiAyam = input.nextInt();
        System.out.print("Steak Sirloin Spesial \t= ");
        PorsiSteak = input.nextInt();
        System.out.print("Kwetiaw Siram Spesial \t= ");
        PorsiKwetiaw = input.nextInt();
        System.out.print("Kambing Guling Spesial \t= ");
        PorsiKambing = input.nextInt();
        System.out.println("\n\n");

        System.out.println("Selamat menikmati pesanan anda...");
        System.out.println("");
        
        double NasiGoreng = PorsiNasi*9999.99;
        double AyamBakar = PorsiAyam*12345.67;
        double SteakSirloin = PorsiSteak*21108.40;
        double KwetiawSiram = PorsiKwetiaw*13579.13;
        double KambingGuling = PorsiKambing*98765.43;
        double TotalPembelian = NasiGoreng+AyamBakar+SteakSirloin+KwetiawSiram+KambingGuling;
        double DiskonPembelian = TotalPembelian*0.1;

        System.out.println("Pembelian :\n");
        System.out.printf("1. Nasi Goreng Spesial \t\t" +PorsiNasi+ " porsi* Rp. 9999,99 = \t Rp. %.2f\n",NasiGoreng);
        System.out.printf("2. Ayam Bakar Spesial \t\t" +PorsiAyam+ " porsi* Rp. 9999,99 = \t Rp. %.2f\n",AyamBakar);
        System.out.printf("3. Steak Sirloin Spesial \t" +PorsiSteak+ " porsi* Rp. 9999,99 = \t Rp. %.2f\n",SteakSirloin);
        System.out.printf("4. Kwetiaw Siram Spesial \t" +PorsiKwetiaw+ " porsi* Rp. 9999,99 = \t Rp. %.2f\n",KwetiawSiram);
        System.out.printf("5. Kambing Guling Spesial \t" +PorsiKambing+ " porsi* Rp. 9999,99 = \t Rp. %.2f\n",KambingGuling," +");
        System.out.println("======================================================================");
        System.out.printf("Total Pembelian \t\t\t\t\t =  Rp. "+ TotalPembelian);
        System.out.printf("Disc. 10% (Masa Promosi) \t\t =  ");
        System.out.println("======================================================================");
    }
}