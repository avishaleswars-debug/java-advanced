package Designpatterns.creationalpattern;

public class Builder {
   static class Main{
        public Main prin(){
            System.out.print("heelo");
            return this;
        }
    }
    public static void main(String[] args) {
      Main m=new Builder.Main().prin();
    }
}
