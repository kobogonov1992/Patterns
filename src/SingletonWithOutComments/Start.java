package SingletonWithOutComments;

public class Start {

    public static void main(String[] args) {

        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();

        System.out.println("Проверка объектов на Билл Пью singleton \n"+billPughSingleton1.equals(billPughSingleton2));
        System.out.println( ( billPughSingleton1 == billPughSingleton2 ) + "\n"
        +"________________________________");

        DoubleCheckLockSingleton doubleCheckLockSingleton1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton doubleCheckLockSingleton2 = DoubleCheckLockSingleton.getInstance();

        System.out.println( "Проверка объектов на Double check lock singleton \n" +(doubleCheckLockSingleton1 == doubleCheckLockSingleton2) );
        System.out.println(doubleCheckLockSingleton1.equals(doubleCheckLockSingleton2)+"\n"
                +"___________________________________");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println("Проверка объектов на EagerSingleton singleton \n"+ ( eagerSingleton1==eagerSingleton2 ) );
        System.out.println(eagerSingleton1.equals(eagerSingleton2)+"\n"
                +"__________________________________");

        EnumSingleton.EnumInitialization initialization1 = EnumSingleton.EnumInitialization.INSTANCE;
        EnumSingleton.EnumInitialization initialization2 = EnumSingleton.EnumInitialization.INSTANCE;

        System.out.println( "Проверка объектов на Enum singleton \n" + (initialization1 == initialization2) );
        System.out.println(initialization1.equals(initialization2)+"\n"
                +"___________________________________");

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println( "Проверка объектов на Lazy singleton \n" + ( lazySingleton1 == lazySingleton2 ) );
        System.out.println(lazySingleton1.equals(lazySingleton2 )+"\n"
                +"___________________________________");

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println( "Проверка объектов на ThreadSafe singleton \n" + ( threadSafeSingleton1 == threadSafeSingleton2 ) );
        System.out.println( threadSafeSingleton1.equals(threadSafeSingleton2) + "\n"
                +"___________________________________");

        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

        System.out.println( "Проверка объектов на StaticBlock singleton \n" + ( staticBlockSingleton1 == staticBlockSingleton2 ) );
        System.out.println(staticBlockSingleton1.equals( staticBlockSingleton2 ) );

    }
}
