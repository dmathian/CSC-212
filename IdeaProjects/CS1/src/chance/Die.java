package chance;

public class Die {

    //THE INSTANCE VARIABLES (STATE)
    private int order;
    private int top;

    //THE CONSTRUCTORS
    public Die() {
        order = 6;
        top = (int) ((Math.random()* 6) + 1);
    }
    public Die (int nrOfSides) {
        order = nrOfSides;
        top = (int) (( Math.random() * nrOfSides) + 1);
    }
    //THE METHODS (BEHAVIOR)
    public int top() {
        return top;
    }
    public void roll(){
        top = (int) ((Math.random() * order) + 1);
    }
}
