public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.release(new Bird());
        Bird penguin = new Penguin();
        if (penguin instanceof Flyable) {
            aviary.release((Flyable) penguin);
        } else {
            System.out.println("Penguin can't be released by flying!");
        }
    }
}
