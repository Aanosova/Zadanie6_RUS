import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Test6 {
    /**
     * ���� ������� ���� � ������� ����, ���������� ����� ������
     ����������:
     ��������� ����� �� �����.
     ������������� � ���������� �������.
     ��������� ������� ��� ������ ����� ����������� � �����.       ������� ���������� �� �������
     ����� ����� � ������������ ����������� ����������. ������� �� ������� ��� ����� � ������� ��� ��� ����������� � �����
     */
        public static void main(String[] args) throws IOException {
            BufferedReader reader = null;
            //try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/�����/Desktop/Wordsrus.txt"), Charset.forName("WINDOWS-1251")));
            // ArrayList line = new ArrayList();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("�������� ������ �� �����: " + line);
            }
            System.out.println();
/**
            //����������
            java.util.Collections.sort(line);
            System.out.println("���������� �� ��������: " + line);
            System.out.println("-----------------------------------------");
*/
        }
    }

