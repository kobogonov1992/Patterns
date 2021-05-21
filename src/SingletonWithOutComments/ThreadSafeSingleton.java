package SingletonWithOutComments;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton (){ }

    public synchronized static ThreadSafeSingleton  getInstance(){

        if (INSTANCE == null){
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
