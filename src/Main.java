import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {23,213,12,3,123,1,2,323};
//        array(array);
//        stars(10);
//        arrayConcat(array);
        sort(12,2,9);
    }

    public  static  void Hello (){
        System.out.println("Salam");
    }public  static  void Bye (){
        System.out.println("Poka");
    }

    public  static  void table10 (){
        for(int i = 1; i<=10; i++){
            System.out.println(i + " x " + i + " = " + i * i);
        }
    }

    public  static void stars (int count){
        for(int i = 0;i<=count;i++){
            System.out.print("*");
        }
    }

    public  static  void arrayConcat (int array []){
        for(int i : array){
            System.out.print(i);
        }
    }

    public  static  void sort (int a, int b, int c){

    }

    public static void array (int array []) {
        for(int i: array){
            System.out.println(i);
        }
    }
}