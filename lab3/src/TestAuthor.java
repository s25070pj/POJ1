public class TestAuthor {
    public static void main(String[] args) {


        Author author = new Author("Fryderyk", "Chopin", 44);
        System.out.println(author.toString());
        Author author2 = new Author("Juliusz", "Słowacki", 63);
        System.out.println(author2.toString());
        Author author3 = new Author("Bolesław","", 67);
        author3.setSurname("Prus");
        System.out.println(author3.toString());

    }

}
