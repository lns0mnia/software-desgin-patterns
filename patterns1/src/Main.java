
public class Main {
    public static void main(String[] args) {
        // Single
        Notebook notebook = Notebook.getInstance();
        // Strat
        NoteStrategy noteStrategy = new VoiceNoteStrategy();
        notebook.note("This note was written with the help of " + noteStrategy.getClass().getSimpleName() + " strategy.");
    }
}