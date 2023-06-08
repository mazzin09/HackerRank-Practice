package advanced;

class Singleton{
    private Singleton(){
        //private constructor
    }
    public String str;

    static Singleton instance;

    static Singleton getSingleInstance(){
        if(instance == null){
            return new Singleton();
        }
    return instance;
    }
}

public class SingletonPattern {
}
