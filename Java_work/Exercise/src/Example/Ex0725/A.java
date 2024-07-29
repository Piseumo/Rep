package Exercise.src.Example.Ex0725;

class A extends Object {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public void printThis(Object obj) {
        System.out.println("this =" + this);
        System.out.println("obj =" + obj);
        System.out.println("this.name =" + this.name);
        System.out.println("((A)obj).name =" + ((A) obj).name);
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((A) o).name);
    }
}
