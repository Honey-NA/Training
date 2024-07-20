import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public HashMap<String, ArrayList<String>> book = new HashMap<>();
    public void add(String surname, String phone){
        if (book.get(surname)!= null){
            if(!book.get(surname).contains(phone)){
                book.get(surname).add(phone);
            }
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(phone);
            book.put(surname,arr);
        }
    }
    public void get(String surname){
        System.out.println("Номера телефонов " + surname + ": " + book.get(surname));
    }
}
