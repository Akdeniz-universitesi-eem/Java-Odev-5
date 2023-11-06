// Parametresi ile aldığı yazının içindeki küçük harfleri büyük harfe, büyük harfleri ise küçük harfe çevirip yeni bir String ile geri dönen changeCase isimli metodu yazınız.
public class TextManipulator {
    // Metin içindeki harflerin büyük/küçük durumunu değiştiren metot
    public static String changeCase(String text) {
        // Eğer metin boş veya null ise boş bir string döndür
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder(); // Sonuç için bir StringBuilder oluştur

        // Metin içinde dolaş
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Mevcut karakteri al

            // Eğer büyük harfse, küçük harfe çevir
            if (Character.isUpperCase(currentChar)) {
                result.append(Character.toLowerCase(currentChar));
            }
            // Eğer küçük harfse, büyük harfe çevir
            else if (Character.isLowerCase(currentChar)) {
                result.append(Character.toUpperCase(currentChar));
            }
            // Harf olmayan karakterleri aynen ekle
            else {
                result.append(currentChar);
            }
        }

        return result.toString(); // Oluşturulan sonucu stringe dönüştür ve döndür
    }

    public static void main(String[] args) {
        String exampleText = "Merhaba ben Yiğit!";
        String convertedText = changeCase(exampleText);
        System.out.println("Original Text: " + exampleText);
        System.out.println("Converted Text: " + convertedText);
    }
}

