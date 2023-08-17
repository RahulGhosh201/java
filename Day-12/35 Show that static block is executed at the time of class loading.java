class A35 {
    A35(){
        System.out.println("constructer");
    }
    {
        System.out.println("instance block");

    }
    static{
        System.out.println("static block A");
    }
    public static void main(String[] args) {
        new A35();
    }
}
