// ─────────────────────────────────────────────
// FILE 5: Librarian.java  ← FOLLOW-UP
// Zero existing files touched!
// ─────────────────────────────────────────────

public class Librarian extends Person {

    private int bookCount;

    public Librarian(String name, int age, int bookCount) {
        super(name, age);
        this.bookCount = bookCount;
    }

    @Override
    public String getRole() {
        return "I am a Librarian";
    }

    public void issueBook() {
        System.out.println("Librarian " + getName() + " issued a book");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Books Managed : " + bookCount);
        System.out.println("─────────────────────────────");
    }
}