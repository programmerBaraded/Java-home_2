// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex_2_2 {
    public static void main(String[] args) throws Exception {
        FileReader fread = new FileReader("pupil.txt");
        Scanner scan = new Scanner(fread);
        String result = scan.nextLine();
        fread.close();
        scan.close();
        StringBuilder new_result = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '"'){
                if (result.charAt(i) == ':')
                    new_result.append(',');
                else
                    new_result.append(result.charAt(i));
            }
        }
        String [] arra = new_result.toString().split(",");
        System.out.println("Студент " + arra[1] + "получил " + arra[3] + "по предмету" + arra[5] + ".");
    }
}
