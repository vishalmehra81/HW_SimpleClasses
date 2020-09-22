public class Printer {

    private int pagesRemaining;
    private String errorMessage;
    private int tonerVolume;

    public Printer() {
        this.pagesRemaining = 150;
        this.errorMessage = "";
        this.tonerVolume = 500;
    }

    public int getPagesRemaining() {
        return this.pagesRemaining;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int getToner() {
        return this.tonerVolume;
    }

    public void print(int pages, int copies) {
        if (pages * copies <= this.pagesRemaining) {
            this.pagesRemaining -= pages * copies;
            this.tonerVolume -= pages * copies;
        } else {
            this.errorMessage = "Paper Out";


        }
    }
}