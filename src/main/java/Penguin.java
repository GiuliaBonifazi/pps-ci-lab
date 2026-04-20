package java;

/**
 * A Penguin that moves either by sliding or slowly wobbling
 *
 */
public class Penguin {
    private static final int STEPS_ON_SLIDE = 3;
    private static final int STEPS_ON_WOBBLE = 1;
    private int steps = 0;

    public void slide() {
        this.steps = this.steps + STEPS_ON_SLIDE;
    }

    public void wobble() {
        this.steps = this.steps + STEPS_ON_WOBBLE;
    }

    public int getSteps() {
        return this.steps;
    }
}