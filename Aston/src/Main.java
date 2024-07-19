
public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"кот", "собака", "енот", "крот", "кот", "лошадь", "олень", "собака", "тигр", "лев", "енот"};
        UniqueWords arr1words = new UniqueWords();
        arr1words.getWords(arr1);
        arr1words.countWords(arr1);
        PhoneBook book1 = new PhoneBook();
        book1.add("Петров","79281461483");
        book1.add("Петров","79128348932");
        book1.add("Васичкин","79123248332");
        book1.add("Попов","79228375932");
        book1.get("Петров");
        book1.get("Васичкин");
        book1.get("Попов");
    }
}
