package interviewQsts;

public class SingletonClass {

    static SingletonClass singletonClass;

    private SingletonClass(){}

    private static SingletonClass getInstance() {
        if (singletonClass == null) {
            return new SingletonClass();
        }
        return null;
    }
}
