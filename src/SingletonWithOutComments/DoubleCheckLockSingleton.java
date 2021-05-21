package SingletonWithOutComments;

public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton INSTANCE;

    private DoubleCheckLockSingleton (){ }

    public static DoubleCheckLockSingleton getInstance(){

        if(INSTANCE == null){

            synchronized (DoubleCheckLockSingleton.class){

                if(INSTANCE == null){

                    INSTANCE = new DoubleCheckLockSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
