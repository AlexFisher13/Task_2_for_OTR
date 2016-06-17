import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phone {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите ФИО");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        findNumbers(name);
    }

    public static void findNumbers(String name) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap();
        phoneBook.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+89007109090", "+89707895656", "+89207891212")));
        phoneBook.put("Петров П.П.", new ArrayList<>(Arrays.asList("+89007109090", "+89707895656")));
        phoneBook.put("Сидоров С.С.", new ArrayList<>(Arrays.asList("+89007109090")));

        boolean flag = false;
        for (Map.Entry pair : phoneBook.entrySet()) {
            if (pair.getKey().equals(name)){
                flag = true;
                System.out.println(pair.getValue());
            }
        }
        if (flag == false) {
            System.out.println("ФИО в БД отстуствует");
        }
    }
}
