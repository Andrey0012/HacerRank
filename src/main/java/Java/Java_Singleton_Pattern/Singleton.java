package Java.Java_Singleton_Pattern;


class Singleton{
    private Singleton() {
    }
    public String str;
    static Singleton getSingleInstance () {
        Singleton singleton = new Singleton();
        return singleton;
    }
}

