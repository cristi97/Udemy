public class Animal {
    private String name;
    protected int brain,body,size,weigth;

    public Animal(String name, int brain, int body, int size, int weigth) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigth = weigth;
    }
    public void eat(){
        System.out.println("Animal eating!");
    }

    public void move(){
        System.out.println("Animal moving!");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeigth() {
        return weigth;
    }
}
