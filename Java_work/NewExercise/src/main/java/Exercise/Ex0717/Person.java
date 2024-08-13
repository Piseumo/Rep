package Exercise.Ex0717;

public class Person {

    private String jumin;
    private String passport;

    public Person() {
    }

    public Person(String a) {
        jumin = jumin;
    }

    public Person(String jumin, String passport) {
//        this.jumin = jumin;
        this(jumin);
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void how(){
        System.out.println("jumin="+jumin);
        System.out.println("passport="+passport);

    }
}


