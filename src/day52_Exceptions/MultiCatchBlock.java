package day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int [] arr = {10,20};

        try{
            System.out.println(arr[20]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is handled");
        }catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception");

        }catch (RuntimeException e){
        System.out.println("Run time Exception");

        }

    }
}
