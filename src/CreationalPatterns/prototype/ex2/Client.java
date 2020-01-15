//https://dzone.com/articles/design-patterns-prototype
package CreationalPatterns.prototype.ex2;

public class Client {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Item myBook = registry.createBasicItem("Book");
        System.out.println(myBook.getTitle());
        myBook.setTitle("Custom Title");
        System.out.println(myBook.getTitle());

        Item myBook2 = registry.createBasicItem("Book");
        System.out.println(myBook2.getTitle());

    }
}
