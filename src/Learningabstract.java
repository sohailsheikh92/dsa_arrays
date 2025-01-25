abstract class generalBank{
    public abstract void savings();
}

class savingss extends generalBank{

    @Override
    public void savings() {
        System.out.println("Created abstract class");
    }
}

public class Learningabstract {
    public static void main(String[] args) {
            savingss obj = new savingss();
            obj.savings();
    }
}
