public abstract class Magazine implements IBook{
    @Override
    public void name() {
        System.out.println("Skala");
    }

    @Override
    public void copies() {
        System.out.println("500");
    }
}
