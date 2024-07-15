public class Miska {
    public static int miska = 0;
    public static void getFood(int x){
        miska+= x;
        System.out.println("В миску добавили " + x + " еды.\nВ миске теперь " + miska + " еды.");
    }
}
