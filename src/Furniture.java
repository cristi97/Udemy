public class Furniture {
    private int shelfNumber,bookNumber,bulbs;
    private String clothes;

    public Furniture(int shelfNumber, int bookNumber, int bulbs, String clothes) {
        this.shelfNumber = shelfNumber;
        this.bookNumber = bookNumber;
        this.bulbs = bulbs;
        this.clothes = clothes;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public int getBulbs() {
        return bulbs;
    }

    public String getClothes() {
        return clothes;
    }
    public void insertBulb(){
        System.out.println("Bulb inserted");
    }
}
