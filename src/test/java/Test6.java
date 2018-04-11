import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Test6 {
    /**
     * Есть входной файл с набором слов, написанных через пробел
     Необходимо:
     Прочитать слова из файла.
     Отсортировать в алфавитном порядке.
     Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
     Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
     */
        public static void main(String[] args) throws IOException {
            BufferedReader reader = null;
            //try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Игорь/Desktop/Wordsrus.txt"), Charset.forName("WINDOWS-1251")));
            // ArrayList line = new ArrayList();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Исходные данные из файла: " + line);
            }
            System.out.println();
/**
            //сортировка
            java.util.Collections.sort(line);
            System.out.println("Сортировка по алфавиту: " + line);
            System.out.println("-----------------------------------------");
*/
        }
    }

