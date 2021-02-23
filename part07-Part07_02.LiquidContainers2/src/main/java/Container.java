
public class Container {

    private int containerLevel;

    public Container() {
        this.containerLevel = 0;

    }

    public int contains() {
        return this.containerLevel;
    }

    public void add(int amount) {
        if (!(amount < 0)) {
            this.containerLevel += amount;
        }

        if (this.containerLevel > 100) {
            this.containerLevel = 100;
        }
    }

    public int revertContainerToZero() {
        return this.containerLevel = 0;

    }

    public void remove(int amount) {
        if (!(this.containerLevel < 0)) {
            if (!(amount < 0)) {
                this.containerLevel -= amount;
            }

        }

        if (this.containerLevel < 0) {
            this.containerLevel = 0;
        }

    }

    @Override
    public String toString() {
        return this.containerLevel + "/100";
    }

}
