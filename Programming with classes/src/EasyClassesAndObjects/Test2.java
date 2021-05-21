package EasyClassesAndObjects;

public class Test2 {
    private int firstVariable;
    private int secondVariable;

    Test2(){
        firstVariable = 100;
        secondVariable = 200;
    }

    Test2(int firstParameter, String secondParameter){
        System.out.println("This is first parameter = " + firstParameter);
        System.out.println("This is second parameter = " + secondParameter);
    }


    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }


    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test2 test2_1 = new Test2(12, "Room");
        test2.getFirstVariable();
        test2.getSecondVariable();
        test2.setFirstVariable(123);
        test2.setSecondVariable(76);
    }
}
