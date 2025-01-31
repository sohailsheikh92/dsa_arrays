class negativeException extends Exception{
            public String msg(){
                return "give positive values";
    }
}

class Myexception {
    public double area(double l,double b) throws negativeException{
        if(l<0 && b<0)
                throw new negativeException();

        return l*b;
    }
}

public class UserdefindExceptiom {
    public static void main(String[] args) throws negativeException{
        Myexception obj = new Myexception();
        try{
            obj.area(-1,-2);
        } catch (negativeException e) {
            System.out.println(e.msg());
        }
        System.out.println(obj.area(1,2));
    }
}
