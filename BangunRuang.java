/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2;

import java.util.Scanner;

/**
 *
 * @author mdiki
 */
public class BangunRuang {

    private double hasil;

    public BangunRuang(int rusuk) {
        this.hasil = Math.pow(rusuk, 3);
    }

    public BangunRuang(double panjang, double lebar, double tinggi) {
        this.hasil = panjang * lebar * tinggi;
    }

    public BangunRuang(double jari, double tinggi, String silinder) {
        if (silinder.equalsIgnoreCase("y")) {
            this.hasil = Math.PI * Math.pow(jari, 2) * tinggi;
        }
    }

    public BangunRuang(double jari, String bola) {
        if (bola.equalsIgnoreCase("y")) {
            this.hasil = (4.0 / 3.0) * Math.PI * Math.pow(jari, 3); 
        }
    }

    public double getHasil() {
        return hasil;
    }

    public double hitungLuasPermukaan(int rusuk) {
        return 6 * Math.pow(rusuk, 2);
    }

    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public double hitungLuasPermukaan(double jari, String silinder) {
        if (silinder.equalsIgnoreCase("y")) {
            return 2 * Math.PI * jari * (jari + 2);
        }
        return 0;
    }

    public double hitungLuasPermukaan(double jari, String bola, String _bola) {
        if (bola.equalsIgnoreCase("y") && _bola.equalsIgnoreCase("y")) {
            return 4 * Math.PI * Math.pow(jari, 2); 
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char repeat;
        do {
            System.out.println("== Belajar Menghitung Bangun Ruang ==");
            System.out.println("=====================================");
            System.out.println("Pilih bangun ruang yang ingin dihitung volumenya:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Silinder");
            System.out.println("4. Bola");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            int rusuk;
            double panjang, lebar, tinggi, jari;
            String silinder, bola;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang rusuk kubus: ");
                    rusuk = scanner.nextInt();
                    BangunRuang kubus = new BangunRuang(rusuk);
                    System.out.println("Volume kubus: " + kubus.getHasil());
                    System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan(rusuk));
                    break;

                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    lebar = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    tinggi = scanner.nextDouble();
                    BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);
                    System.out.println("Volume balok: " + balok.getHasil());
                    System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan(panjang, lebar, tinggi));
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari silinder: ");
                    jari = scanner.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    tinggi = scanner.nextDouble();
                    System.out.print("Apakah bangun ini silinder? (y/n): ");
                    silinder = scanner.next();
                    BangunRuang silinderObj = new BangunRuang(jari, tinggi, silinder);
                    System.out.println("Volume silinder: " + silinderObj.getHasil());
                    System.out.println("Luas permukaan silinder: " + silinderObj.hitungLuasPermukaan(jari, silinder));
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari bola: ");
                    jari = scanner.nextDouble();
                    System.out.print("Apakah bangun ini bola? (y/n): ");
                    bola = scanner.next();
                    BangunRuang bolaObj = new BangunRuang(jari, bola);
                    System.out.println("Volume bola: " + bolaObj.getHasil());
                    System.out.println("Luas permukaan bola: " + bolaObj.hitungLuasPermukaan(jari, bola, bola));
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        scanner.close();
    }
}