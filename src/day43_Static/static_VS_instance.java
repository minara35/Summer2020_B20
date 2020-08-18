package day43_Static;

public class static_VS_instance {
    static int staticVariable; // 1 copy
    int instanceVariable;// 2 copies

    public static void main(String[] args) {
        static_VS_instance obj1 = new static_VS_instance();
        static_VS_instance obj2 = new static_VS_instance();
    }
}
