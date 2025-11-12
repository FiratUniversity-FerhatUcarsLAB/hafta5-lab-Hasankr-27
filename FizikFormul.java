/*
 * Ad Soyad: HASAN KARA
 * Ogrenci No: 250541015
 * Tarih: 12.11.2025
 * Aciklama: GOREV 2
 */
import java.lang.Math;

public class Gorev2 {

    // Sabit Tanımlama
    public final static double GRAVITY = 9.8;

    // 1. Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2. İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // 3. Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4. İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5. Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6. Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7. Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // gravity parametresi olmasına rağmen, istenen sabit (GRAVITY) kullanılır.
        return mass * Gorev2.GRAVITY * height;
    }

    // 8. Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {

        // Temel ölçümler
        double kutle = 10.0;        // Kütle (kg)
        double mesafe = 100.0;      // Mesafe (m)
        double zaman = 5.0;         // Zaman (s)
        double hizDegisimi = 20.0;  // Hız değişimi (m/s)
        double yukseklik = 15.0;    // Yükseklik (m)

        // Hesaplamalar
        double v = calculateVelocity(mesafe, zaman);
        double a = calculateAcceleration(hizDegisimi, zaman);

        double F = calculateForce(kutle, a);
        double W = calculateWork(F, mesafe);
        double P = calculatePower(W, zaman);

        double KE = calculateKineticEnergy(kutle, v);
        double PE = calculatePotentialEnergy(kutle, GRAVITY, yukseklik);
        double toplamEnerji = KE + PE;

        double p = calculateMomentum(kutle, v);

        // ========================================
        // İstene formatta çıktı
        // ========================================

        System.out.println("=== FIZIK FORMUL ASISTANI ===");

        // Temel ölçümler
        System.out.println("\nTEMEL OLCUMLER:");
        System.out.printf("Kutle (kg): %.0f\n", kutle);
        System.out.printf("Mesafe (m): %.0f\n", mesafe);
        System.out.printf("Zaman (s): %.0f\n", zaman);
        System.out.printf("Hiz degisimi (m/s): %.0f\n", hizDegisimi);
        System.out.printf("Yukseklik (m): %.0f\n", yukseklik);

        //Çıktı
        System.out.println("\n========================================");
        System.out.println("          HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        // Hız ve Hareket
        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", v);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", a);

        // Kuvvet ve İş
        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", F);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", W);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", P);

        // Enerji
        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", KE);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", PE);
        System.out.printf("  Toplam Enerji             : %.2f J\n", toplamEnerji);

        // Momentum
        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", p);

        System.out.println("\n========================================");
    }
}
