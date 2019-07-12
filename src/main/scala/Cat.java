public class Cat implements Animal {

    @Override
    public String makeSound() {
        return miau();
    }

    private String miau() {
        return "Miau";
    }

    @Override
    public void jumpPerfoming() {
        System.out.println("I'm a lazy. NO!");
    }
}
