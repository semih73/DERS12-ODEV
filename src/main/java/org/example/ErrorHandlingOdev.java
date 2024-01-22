package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ErrorHandlingOdev {
        public static void main(String[] args) {
            // Senaryo 1: NullPointerException
            try {
                String str = null;
                int strLength = str.length();  // Bu satır NullPointerException hatası üretecek
            } catch (NullPointerException e) {
                e.getMessage();
                System.out.println("Hata: Veri okunamadı.Veri alanı boş. --> "+e);
            }

            // Senaryo 2: ArithmeticException
            try {
                int sayi = 5;
                int bolen = 0;
                int sonuc = sayi / bolen;  // Bu satır ArithmeticException hatası üretecek
            } catch (ArithmeticException e) {
                e.getMessage();
                System.out.println("Hata: Hesaplama yapılırken hata oluştu. Daha sonra tekrar deneyin. --> "+e);

            }

            // Senaryo 3: IOException
            try {
                String dosyaYolu = "dosya.txt";
                BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu));
                String satir = bufferedReader.readLine();  // Bu satır IOException hatası üretecek
            } catch (IOException e) {
                e.getMessage();
                System.out.println("Hata: Dosya bulunamadı. --> "+e);

            }
        }
    }

