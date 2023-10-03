public class Notebook {
    private static Notebook instance;

    private Notebook() {
        //hidden code of creating single new inst
    }

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

//singleton pattern
