package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("태백 산맥 1", "조정래");
        library[1] = new Book("태백 산맥 2", "조정래");
        library[2] = new Book("태백 산맥 3", "조정래");
        library[3] = new Book("태백 산맥 4", "조정래");
        library[4] = new Book("태백 산맥 5", "조정래");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }
    }
}
