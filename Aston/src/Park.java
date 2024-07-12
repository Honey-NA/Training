public class Park {
    public String info;
    public String workTime;
    public int price;
    public Park(String info,String workTime, int price) {
        this.info = info;
        this.workTime = workTime;
        this.price = price;
    }
    public static class Attraction extends Park {
        public Attraction(String info,String workTime, int price) {
            super(info, workTime, price);
            System.out.println("\nАтракцион: " + info +"\n" + "График работы: " + workTime +"\n" + "Цена: " + price);
        }
    }
}