package Antrian-Dinas-Kesehatan;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class AntrianPasien_DinasKesehatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stackPengunjung = new Stack<String>();
        Queue<String> queueAntrian = new LinkedList<String>();

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("=== MENU DINAS KESEHATAN KAB BANTUL ===");
            System.out.println("1. Tambah Pengunjung Baru");
            System.out.println("2. Panggil Antrian Pengunjung");
            System.out.println("3. Lihat Daftar Pengunjung");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pengunjung: ");
                    String nama = input.next();
                    stackPengunjung.push(nama);
                    System.out.println("Pengunjung " + nama + " telah ditambahkan.");
                    break;
                case 2: {
                    String pengunjung = input.next();
                    stackPengunjung.push(pengunjung);
                    System.out.println("Pengunjung " + pengunjung + " dipanggil.");
                }
                    break;
                case 3:
                    if (stackPengunjung.isEmpty()) {
                        System.out.println("Tidak ada pengunjung terdaftar.");
                    } else {
                        System.out.println("Daftar Pengunjung:");
                        for (String pengunjung : stackPengunjung) {
                            System.out.println("- " + pengunjung);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih sudah menggunakan program Dinas Kesehatan Bantul.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
                    break;
            }
        }
    }
}
