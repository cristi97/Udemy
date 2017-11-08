public class Wall {
    private String color;
    public int width,length;

    public Wall(String color, int width, int length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }
    public void paint(){
        System.out.println("Walls painted with the color:"+color);
    }
}
