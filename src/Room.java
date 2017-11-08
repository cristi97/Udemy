public class Room {
    Furniture furniture;
    Wall wall;

    public Room(Furniture furniture, Wall wall) {
        this.furniture = furniture;
        this.wall = wall;
    }
    public String toString(){
        return furniture.getBookNumber()+" "+wall.width;
    }
}
