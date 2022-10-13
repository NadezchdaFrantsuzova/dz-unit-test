import org.junit.jupiter.api.*;

@DisplayName("Тестирование класса Book")

public class BookTest {
    protected Book book;

    @BeforeEach
    void setUp() {
        book = new Book(4, "Шла Саша ");
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @Test
    @DisplayName("Тестирование метода up()")
    void up() {
        Assertions.assertEquals(5, book.up());
    }

    @Test
    @DisplayName("Тестирование метода down()")
    void down() {
        Assertions.assertEquals(3, book.down());
    }

    @Test
    @DisplayName("Тестирование метода append()")
    void append() {
        final String expected = "Шла Саша по шоссе";
        Assertions.assertEquals(expected, book.append("по шоссе"));
    }
}
