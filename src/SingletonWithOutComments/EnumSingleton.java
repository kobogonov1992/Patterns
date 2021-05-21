package SingletonWithOutComments;

public class EnumSingleton {

    public static final EnumSingleton INSTANCE = new EnumSingleton();

    public enum EnumInitialization{

        INSTANCE;

    }

}
