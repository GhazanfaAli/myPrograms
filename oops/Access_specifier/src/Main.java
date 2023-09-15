//Note: A class cannot be private or protected except nested clas

import all.*;

class Main extends C {
    public static void main(String[] args) {
    C ob1 = new C();
    ob1.msg();  // ==> //cannot be accessed from outside package

        // protected
        Main o = new Main();
        o.pr();
    }


}