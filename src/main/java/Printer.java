public class Printer {
    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume) {
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int print(int numberOfPages,int numberOfCopies){
        if(numberOfPages*numberOfCopies>this.numberOfSheets){
            return this.numberOfSheets;}
        else{
        this.reduceToner(numberOfPages,numberOfCopies);
        return this.numberOfSheets - numberOfPages*numberOfCopies;}
        }

    public int reduceToner(int numberOfPages,int numberOfCopies){
        return this.tonerVolume - numberOfPages*numberOfCopies;
    }


    }

