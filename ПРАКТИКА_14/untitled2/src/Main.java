import java.util.regex.*;

public class Main {
    public static void main( String[] args ) {
        int count = 0;
// Строка для сканирования
        String s = "Цены 6.267 RUR 30.06 USD 50.30 RUR 50f32 RUR 60.12  UDD 236.908 USD 15.23 EU";
        String regex = "\\d+[.]\\d{2}\\s(USD|EU|RUR)";

        Pattern p1 = Pattern.compile(regex);

        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            count ++;
            System.out.println("Список цен: " + m1.group());
        }
        if (count==0) {
            System.out.println("СОВПАДЕНИЙ НЕ НАЙДЕНО");
        }
    }
}