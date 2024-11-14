public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("小花", "狸猫", 500.0);
        Cat cat2 = new Cat("狗蛋", "波斯猫", 600.0);

        Dog dog1 = new Dog("小红", "哈士奇", 800.0);
        Dog dog2 = new Dog("咪咪", "柯基", 700.0);

        // 调用方法
        cat1.play();
        dog1.play();
        cat2.eat();
        dog2.sleep();
    }
}