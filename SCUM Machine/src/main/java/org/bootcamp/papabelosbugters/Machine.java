package org.bootcamp.papabelosbugters;

public class Machine<T>{

    public static void main(String[] args){
        Machine<String> string = new Machine<>();
        Machine<Integer> integer = new Machine<>();

        integer.doShit(((a, b) -> a + b), 1, 2);
        string.doShit(((a,b) -> a + b), "Cyka ", "Blyat"); 

    }




    public void doShit(MonoOperation<T> mo, T a){
        System.out.println(mo.doShit(a));
    }

    public void doShit(BioOperation<T> bo, T a, T b){
        System.out.println(bo.doShit(a, b));
    }

}
