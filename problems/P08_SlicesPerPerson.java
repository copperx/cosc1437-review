public class P08_SlicesPerPerson {
    public static int slicesPerPerson(int slices, int people) {
        if (slices < 0 || people <= 0) {
            throw new IllegalArgumentException("slices must be >= 0 and people > 0");
        }
        return slices / people;
    }
}
