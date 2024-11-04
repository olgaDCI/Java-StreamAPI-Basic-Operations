public class StreamOperation {
    String name;
    protected String exercise;
    private static int exerciseCounter = 1;

    public StreamOperation()
    {
        this.exercise = exercise;
        this.name = "Exercise " + exerciseCounter++;
    }


    public String toString() {
        return this.name + " operation examples";
    }

    public void usageExamples()
    {
        System.out.println("\n" + this.exercise + ": " + this.toString());
    }
}
