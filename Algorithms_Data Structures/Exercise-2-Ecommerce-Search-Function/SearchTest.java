public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 104;

        System.out.println("Linear Search:");

        Product linearResult =
                SearchAlgorithms.linearSearch(products, searchId);

        if (linearResult != null) {
            System.out.println(linearResult);
        }

        System.out.println();

        System.out.println("Binary Search:");

        Product binaryResult =
                SearchAlgorithms.binarySearch(products, searchId);

        if (binaryResult != null) {
            System.out.println(binaryResult);
        }
    }
}