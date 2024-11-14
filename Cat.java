public class Cat extends Animal {

    public Cat(String name, String breed, double price) {
        super(name, "猫", breed, price);
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃猫粮。");
    }

    @Override
    public void sleep() {
        System.out.println(name + " 正在睡觉。");
    }

    @Override
    public void play() {
        System.out.println(name + " 正在刨坑");
        call(); // 当猫玩耍时会发出叫声
    }

    @Override
    public void call() {
        System.out.println(name + " 喵！");
    }
}