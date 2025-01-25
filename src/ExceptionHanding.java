public class ExceptionHanding {
    public static void main(String[] args) {
        int a,b,c;
        a=20;
        b=0;
        System.out.println("Start");
        try{
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("END");
    }
}
