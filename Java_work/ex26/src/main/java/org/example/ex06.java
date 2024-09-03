package org.example;

interface Viewable{
    @Deprecated
    public void showIt(String str);
}

class Viewer implements Viewable{
    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println(str+"뭐라할까");
    }
}

public class ex06 {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        viewer.showIt("경고문구나올까");

    }
}
