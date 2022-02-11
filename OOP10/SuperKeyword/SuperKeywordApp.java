package OOP10.SuperKeyword;

/**
 * Super Keyword
 * - kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override
 *   di class child
 * - untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
 * - sederhananya, super digunakan untuk mengakses class parent
 * - tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super
 */

public class SuperKeywordApp {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println(shape.getCorner());

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
