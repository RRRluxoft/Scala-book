public class PetsFactory implements Pets {

    public static PetsFactory create() {
        return new PetsFactory();
    }

    @Override
    public Animal getDog() {
        return new Dog();
    }

    @Override
    public Animal getCat() {
        return new Cat();
    }
}
