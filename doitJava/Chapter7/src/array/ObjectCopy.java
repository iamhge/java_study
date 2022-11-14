package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];
        Book[] bookArray3 = new Book[3];

        bookArray1[0] = new Book("태백 산맥 1", "조정래");
        bookArray1[1] = new Book("태백 산맥 2", "조정래");
        bookArray1[2] = new Book("태백 산맥 3", "조정래");

        bookArray3[0] = new Book();
        bookArray3[1] = new Book();
        bookArray3[2] = new Book();

        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        // 깊은 복사
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray3[i].setAuthor(bookArray1[i].getAuthor());
            bookArray3[i].setBookName(bookArray1[i].getBookName());
        }

        bookArray1[0].setBookName("나목");;
        bookArray1[0].setAuthor("박완서");

        System.out.println("변경 후");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("얕은 복사 결과");
        // 객체의 주소가 복사되어, 함께 변한다.
        // -> 얕은 복사
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        System.out.println("깊은 복사 결과");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray3[i].showBookInfo();
        }

        // 향상된 for 문
        String[] strArr = {"java", "android", "c"};

        for (String str: strArr) {
            System.out.println(str);
        }
    }
}
