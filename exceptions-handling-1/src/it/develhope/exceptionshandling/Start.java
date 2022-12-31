package it.develhope.exceptionshandling;

public class Start{
    /**
     * Method that allows you to understand how good your score is
     *
     * @param score that will be evaluated
     */
    public void checkScore(double score){
        if(0 < score && score <= 50.00) System.out.println("Average score");
        if(50.00 < score && score <= 100) System.out.println("Very good score");
        if(score <= 0 || score > 100) throw new ArithmeticException("Score is out of scale!");
    }

    public static void main(String[] args){
        Start c = new Start();
        c.checkScore(2.15);
        c.checkScore(50);
        c.checkScore(95.02);
        c.checkScore(100.01);

    }
}
