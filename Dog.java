public class Dog extends Animal {

    public Dog(String name, String breed, double price) {
        super(name, "狗", breed, price);
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃狗粮。");
    }

    @Override
    public void sleep() {
        System.out.println(name + " 正在睡觉。");
    }

    @Override
    public void play() {
        System.out.println(name + " 正在玩耍。");
    }

    @Override
    public void call() {
        System.out.println(name + " 说：汪汪！");
    }
}