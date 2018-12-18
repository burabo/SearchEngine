package utils;

public class Pair {

    String word;
    int count;

    public Pair(String word) {
        this.word = word;
        this.count = 0;
    }

    public void increment(){
        count++;
    }


}
