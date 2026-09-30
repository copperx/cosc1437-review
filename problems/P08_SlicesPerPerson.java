public class P08_SlicesPerPerson {
    // Return how many whole slices each person gets.
    // Throw an IllegalArgumentException if slices is negative or people is not positive.
    // slicesPerPerson(8, 3) returns 2
    public static int slicesPerPerson(int slices, int people) {
        System.out.println("Inside slicesPerPerson");

        if (people <= 0 && slices <= 0) {
            throw new IllegalArgumentException("Number of people and slices must be positive");
        }

        if(people <= 0) {
            throw new IllegalArgumentException("Number of people must be positive");
        }

        if (slices <= 0) {
            throw new IllegalArgumentException ("Number of slices must be positive");
        }

        return slices / people;
    }
}
