package cn.caber.realObject;

public class MrJ implements Person {
    @Override
    public String sing() {
        System.out.println("hey baby...");
        return "I am singing";
    }

    @Override
    public String eating() {
        System.out.println("oh delicious ...");
        return "I am eating...";
    }
}
