import java.util.Arrays;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    @Override
    public int compareTo(Product other) {
        return this.productId - other.productId;
    }

    @Override
    public String toString() {
        return "ID: " + productId + "\nName: " + productName + "\nCategory: " + category;
    }
}

public class SearchComparison {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] productList = {
            new Product(201, "iPhone", "Electronics"),
            new Product(202, "Bottle", "Kitchen"),
            new Product(203, "Chair", "Furniture"),
            new Product(204, "Laptop", "Electronics"),
            new Product(205, "Book", "Stationery")
        };

        // Linear Search
        Product result1 = linearSearch(productList, 203);
        if (result1 != null) {
            System.out.println("Linear Search Result:");
            System.out.println(result1);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        // Sorting Array
        Arrays.sort(productList);

        // Binary Search
        Product result2 = binarySearch(productList, 203);
        if (result2 != null) {
            System.out.println("\nBinary Search Result:");
            System.out.println(result2);
        } else {
            System.out.println("\nBinary Search: Product not found");
        }
    }
}
