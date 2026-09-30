public class P08_SlicesPerPerson {
    public static int slicesPerPerson(int slices, int people) {
        if (slices < 0 || people <= 0) {
            throw new IllegalArgumentException("Slices cannot be negative and people must be positive.");
        }
        return slices / people;
    }
}