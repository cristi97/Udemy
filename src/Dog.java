public class Dog extends Animal {
    private int eyes,legs,tail,teeth;
    private String coat;
    public Dog(String name, int size, int weigth,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1,1, size, weigth);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog chews!!");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }
}
