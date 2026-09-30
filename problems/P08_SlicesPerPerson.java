
public class P08_SlicesPerPerson {
    // Return how many whole slices each person gets.
    // Throw an IllegalArgumentException if slices is negative or people is not positive.
    // slicesPerPerson(8, 3) returns 2
    public static int slicesPerPerson(int x, int y) {
        int slices = x;
        int people = y;
        int amount = 0;
        
        if (slices < 0 || people < 0){
            System.out.println("IllegalArgumentException");
        }
        else {
            amount = slices / people;

        }
        return amount;
    }
}