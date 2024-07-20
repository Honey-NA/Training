
public class Main {
    public static void main(String[] args) {
        String[] arr = {"кот", "собака", "енот", "крот", "кот", "лошадь", "олень", "собака", "тигр", "лев", "енот"};
        UniqueWords arrWords = new UniqueWords();
        arrWords.getWords(arr);
        arrWords.countWords(arr);
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
