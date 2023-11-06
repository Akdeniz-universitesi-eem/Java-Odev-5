// Parametresi ile aldığı iki yazının birincisi içerisinden ikincisindeki karakterlerin silinmiş olduğu yeni bir String döndüren squeeze isimli metodu yazınız ve test ediniz.
public class SqueezeMethod {
    // İki metin arasındaki benzer karakterleri çıkartarak yeni bir string döndüren metot
    public static String squeeze(String firstText, String secondText) {
        // Gerekli doğrulamalar yapılır: Eğer metinler boş veya null ise ilk metni döndür
        if (firstText == null || secondText == null || firstText.isEmpty() || secondText.isEmpty()) {
            return firstText;
        }

        StringBuilder result = new StringBuilder(); // Yeni sonuç için bir StringBuilder oluştur

        // İlk metin üzerinde döngü
        for (int i = 0; i < firstText.length(); i++) {
            char currentChar = firstText.charAt(i); // Mevcut karakteri al

            // Eğer ikinci metinde bu karakter yoksa, sonuç metnine ekle
            if (secondText.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString(); // Oluşturulan sonucu stringe dönüştür ve döndür
    }

    public static void main(String[] args) {
        String text1 = "Benim adim";
        String text2 = "Yigit Alperen";
        String squeezedText = squeeze(text1, text2);

        // Sonuçları ekrana yazdır
        System.out.println("First Text: " + text1);
        System.out.println("Second Text: " + text2);
        System.out.println("Squeezed Text: " + squeezedText);
    }
}
