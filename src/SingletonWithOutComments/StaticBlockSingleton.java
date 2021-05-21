package SingletonWithOutComments;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() { }

    //static block initialization для обработки ошибок
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Ошибка при создании экземпляра singleton");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
