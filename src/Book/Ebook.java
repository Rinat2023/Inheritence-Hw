package Book;

public class Ebook extends Book{
    private int fileSize;

    public Ebook(String title, String author, int pages, int fileSize) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

    public void download (){
        System.out.println("Скачивание книги: " + super.getTitle());
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
