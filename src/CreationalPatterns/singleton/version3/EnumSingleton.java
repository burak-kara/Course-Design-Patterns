package CreationalPatterns.singleton.version3;


public class EnumSingleton {

    public static void main(String[] args) {
        System.out.println("EnumSingleton");
        SingletonObject myFirstObj = SingletonObject.SINGLETON_OBJECT;
        myFirstObj.setMyNum(5);

        SingletonObject mySecondObj = SingletonObject.SINGLETON_OBJECT;
        mySecondObj.setMyNum(12);


        System.out.println(myFirstObj.getMyNum());

        if(myFirstObj == mySecondObj)
            System.out.println("TRUE");


    }

    public enum SingletonObject {
        SINGLETON_OBJECT, SINGLETON_OBJECT2;

        int myNum = 0;

        SingletonObject() {
        }

        public int getMyNum() {
            return myNum;
        }

        public void setMyNum(int myNum) {
            this.myNum = myNum;
        }

        @Override
        public String toString() {
            return "mySingletonEnum num is " + getMyNum();
        }
    }
}
