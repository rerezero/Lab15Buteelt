package mn.edu.must.sict.lab15;

public final class Division {
    private Division() { }

    /**
     * a-ыг b-ээр хуваах.
     * @param a хуваагч
     * @param b хуваагч
     * @return a/b үр дүн
     * @throws IllegalArgumentException b тэг бол.
     */
    public static double divide(final double a, final double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}
