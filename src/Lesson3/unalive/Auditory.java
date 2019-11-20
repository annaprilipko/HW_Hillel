package Lesson3.unalive;

public class Auditory {
    private int number;

    public Auditory(int number){
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return String.format("%d", this.number);
    }
}
