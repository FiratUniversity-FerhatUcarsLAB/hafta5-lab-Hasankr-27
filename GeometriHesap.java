/*
 * Ad Soyad: HASAN KARA
 * Ogrenci No: 250541015
 * Tarih: 12.11.2025
 * Aciklama: GOREV 1
 */
public class Gorev1 {
    static double calculateSquareArea(double kenar){

    return kenar*kenar;
    }
    static double calculateSquarePerimeter(double kenar){

    return 4*kenar;
    }
    static double calculateRectangleArea(double genislik,double yukseklik){

        return genislik*yukseklik;

    }
    static double calculateRectanglePerimeter(double genislik,double yukseklik) {

        return (genislik + yukseklik) * 2;
    }
    static double calculateCircleArea(double yaricap){

        return  Math.PI*yaricap*yaricap;
    }
    static double calculateCirclePerimeter(double yaricap){

        return Math.PI*yaricap*2;
    }
    static double calculateTriangleArea(double taban, double yyukseklik){

        return (taban*yyukseklik)/2.0;
    }
    static double calculateTrianglePerimeter(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args){

        System.out.println("========================================");
        System.out.println("          HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        System.out.println();

        //Kare ile hesaplamalar
        System.out.println("KARE:");

        double kenarUzunlugu = 5 ;
        System.out.println("Kenar uzunlugu (cm): "+kenarUzunlugu);

        double kareAlani = calculateSquareArea(kenarUzunlugu);

        double kareCevresi = calculateSquarePerimeter(kenarUzunlugu);

        System.out.printf("  Alan: %.2f cm²%n ",kareAlani);

        System.out.printf(" Cevre: %.2f cm%n ",kareCevresi);
        System.out.println();

        //Dikdörtgen ile hesaplamalar

        System.out.println("DIKDORTGEN:");

        double kisaKenar = 3;

        System.out.println("Kisa kenar (cm): "+ kisaKenar );

        double uzunKenar = 7;

        System.out.println("Uzun kenar (cm): "+ uzunKenar);

        double dikdortgenAlani = calculateRectangleArea(kisaKenar,uzunKenar);

        double dikdortgenCevresi = calculateRectanglePerimeter(kisaKenar,uzunKenar);

        System.out.printf("  Alan: %.2f cm²%n",dikdortgenAlani);

        System.out.printf("  Cevre: %.2f cm%n",dikdortgenCevresi);
        System.out.println();


        //Daire ile hesaplamalar

        System.out.println("DAIRE (yaricap: 4.0 cm):" );

        double yaricap = 4;

        double daireAlani = calculateCircleArea(yaricap);

        double daireCevresi = calculateCirclePerimeter(yaricap);

        System.out.printf("  Alan: %.2f cm²%n",daireAlani);

        System.out.printf("  Cevre: %.2f cm%n",daireCevresi);

        System.out.println();

        //Ucgen ile Hesaplamalar

        System.out.println("UCGEN (taban: 6.0, yukseklik: 8.0 cm):");


        double taban = 6;

        double yyukseklik = 8;

        double a=6,b=8,c=10;

        double ucgenAlani = calculateTriangleArea(taban,yyukseklik);

        double ucgenCevresi = calculateTrianglePerimeter(a,b,c);

        System.out.printf("  Alan: %.2f cm²%n",ucgenAlani);

        System.out.printf("  Cevre: %.2f cm%n",ucgenCevresi);

    }
}
