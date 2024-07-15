public class Park {
    public class Attraction {
        public String info;
        public String workTime;
        public int price;
        public Attraction(String info,String workTime, int price) {
            this.info = info;
            this.workTime = workTime;
            this.price = price;
            System.out.println("\nАтракцион: " + info +"\nГрафик работы: " + workTime +"\nЦена: " + price);
        }
    }
}