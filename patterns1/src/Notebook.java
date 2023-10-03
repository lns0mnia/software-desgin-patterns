public class Notebook {
    private static Notebook instance;

    private Notebook() {}

    public static Notebook getInstance() {
        if (instance == null) {
            instance = new Notebook();
        }
        return instance;
    }

    public void note(String message) {
        System.out.println(message);
    }
}