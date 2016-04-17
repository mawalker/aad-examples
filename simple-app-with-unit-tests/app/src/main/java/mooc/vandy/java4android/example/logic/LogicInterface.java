package mooc.vandy.java4android.example.logic;

/**
 * This Interface exists to help simplify the interactions between the
 * UI (User Interface: [MainActivity.java] in this application) and
 * the Logic class [Logic.java].
 *
 * This Interface defines the 'void process()' method that
 * [Logic.java] will promise to implement. This allows
 * [MainActivity.java] to store an instance of [Logic.java] inside a
 * 'LogicInterface' variable (mLogic inside [MainActivity.java])
 */
public interface LogicInterface {
    /**
     * This method gets called (indirectly through
     * [MainActivity.java]) when the button labeled 'Process...' is
     * pressed.
     */
    public void process();

    /**
     * This is a method declaration that defines a method to add two ints.
     * @param a
     * @param b
     * @return the two ints added together
     */
    public int addInts (int a, int b);

    /**
     * This is a method declaration that defines a method to multiply two ints.
     * @param a
     * @param b
     * @return
     */
    public int multiplyInts (int a, int b);

    /**
     * This is a method to concatenate (concat) two strings together.
     * @param a
     * @param b
     * @return the two strings concatenated.
     */
    public String concatStrings (String a, String b);
}
