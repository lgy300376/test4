public abstract class Animal {
    protected String name;
    protected String type;
    protected String breed;
    protected double price;

    public Animal(String name, String type, String breed, double price) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.price = price;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void play();

    public void call() {
        // 默认行为，可以被子类覆盖
        System.out.println(this.name + " 发出了声音。");
    }
}
