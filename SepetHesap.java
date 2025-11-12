/*
 * Ad Soyad: HASAN KARA
 * Ogrenci No: 250541015
 * Tarih: 12.11.2025
 * Aciklama: GOREV 3
 */


import java.lang.Math;

public class Gorev3 {

    // GÖREV 3: SABİT TANIMLAMALARI
    public final static double VAT_RATE = 0.18;    // KDV Oranı (%18)
    public final static double SHIPPING_FEE = 29.99; // Sabit Kargo Ücreti

    // =========================================================
    // GÖREV 3: METOTLARIN TANIMLANMASI (6 Metot - if'siz)
    // =========================================================

    // 1. Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2. Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // 3. Indirim tutarini hesaplar (araToplam * (indirimYuzdesi / 100))
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100.0);
    }

    // 4. Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5. KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // 6. Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    // =========================================================
    // ANA PROGRAM (main metodu)
    // =========================================================
    public static void main(String[] args) {

        // ÖRNEK GİRDİLER
        double price1 = 100.0; int quantity1 = 2;
        double price2 = 50.0;  int quantity2 = 1;
        double price3 = 200.0; int quantity3 = 1;
        double indirimYuzdesi = 10.0;

        // 1. Ürün Toplamları
        double line1 = calculateLineTotal(price1, quantity1); // 200.00
        double line2 = calculateLineTotal(price2, quantity2); // 50.00
        double line3 = calculateLineTotal(price3, quantity3); // 200.00

        // 2. Ara Toplam
        double subtotal = calculateSubtotal(line1, line2, line3); // 450.00

        // 3. İndirim Tutarı
        double discountAmount = calculateDiscountAmount(subtotal, indirimYuzdesi); // 45.00

        // 4. İndirimli Toplam
        double discountedTotal = applyDiscount(subtotal, discountAmount); // 405.00

        // 5. KDV Tutarı (VAT_RATE sabiti kullanılır)
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE); // 72.90

        // 6. Genel Toplam (SHIPPING_FEE sabiti kullanılır)
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE); // 507.89

        // =========================================================
        // İSTENEN FORMATTA ÇIKTI
        // =========================================================

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");

        // Girdi Bilgileri
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");
        System.out.println("\nURUN 1:");
        System.out.printf("  Birim Fiyat (TL): %.0f\n", price1);
        System.out.printf("  Adet: %d\n", quantity1);
        System.out.println("\nURUN 2:");
        System.out.printf("  Birim Fiyat (TL): %.0f\n", price2);
        System.out.printf("  Adet: %d\n", quantity2);
        System.out.println("\nURUN 3:");
        System.out.printf("  Birim Fiyat (TL): %.0f\n", price3);
        System.out.printf("  Adet: %d\n", quantity3);
        System.out.printf("\nIndirim Kuponu Yuzdesi (%%): %.0f\n", indirimYuzdesi);

        // Sipariş Özeti Başlığı
        System.out.println("\n========================================");
        System.out.println("          SIPARIS OZETI");
        System.out.println("========================================");

        // Ürün Toplamları
        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, quantity1, line1);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d) : %.2f TL\n", price2, quantity2, line2);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, quantity3, line3);
        System.out.println("----------------------------------------");

        // Ara Toplam
        System.out.printf("Ara Toplam                 : %.2f TL\n", subtotal);

        // İndirim ve İndirimli Toplam
        System.out.println(); // Boş satır eklemek için
        System.out.printf("Indirim Tutari (%%%s)      : -%.2f TL\n", String.format("%.0f", indirimYuzdesi), discountAmount);
        System.out.printf("Indirimli Toplam           : %.2f TL\n", discountedTotal);

        // KDV ve Kargo
        System.out.println(); // Boş satır eklemek için
        System.out.printf("KDV Tutari (%%%s)          : +%.2f TL\n", String.format("%.0f", VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ucreti               : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");

        // GENEL TOPLAM
        System.out.printf("GENEL TOPLAM               : %.2f TL\n", grandTotal);
        System.out.println("========================================");
    }
}
