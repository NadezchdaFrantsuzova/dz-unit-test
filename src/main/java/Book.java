public class Book {
    public String title;
    public String nameAuthor;
    public int year;
    public int rating;
    public String text;

    public Book(String title, String nameAuthor, int year) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.year = year;
        rating = 3;
        text = "";
    }

    public Book(int rating, String text) {
        this.rating = rating;
        this.text = text;
    }

    public int up() {
        if (rating < 5) {
            rating++;
        }
        return rating;
    }

    public int down() {
        if (rating > 0) {
            rating--;
        }
        return rating;
    }

    public String append(String moreText) {
        return text += moreText;
    }

    public String toString() {
        return "Рейтинг: " + rating +
                "; Название книги: ''" + title +
                "'' Автор: " + nameAuthor + "; " +
                year + " г.изд.";
    }
}
