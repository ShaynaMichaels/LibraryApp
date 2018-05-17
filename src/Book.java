public class Book {
    String title;
    String author;
    int type;
    int daysBorrowed = 7;

    public static class Builder {
        Book b = new Book();

        public Builder title(String title) {
            b.title = title;
            return this;
        }

        public Builder author(String author) {
            b.author = author;
            return this;
        }

        public Builder type(int type) {
            b.type = type;
            return this;
        }

        public Book build() {
            return b;
        }
    }

    public int getDaysBorrowed(){
        return daysBorrowed;
    }
}

//to add a new book
//Book b = new Book.Builder()
//.title("Harry Potter")
//.author("JK Rowling")
//and if its a reference book .type("reference")
