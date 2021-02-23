
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        //comparing dates
        if (this.year < compared.year) {
            return true;
        }
        //if years are the same, compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        //if years are the same, months the same, then we compare the days
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;
        if (this.day > 30) {
            this.month = this.month + 1;
            this.day = 1;
        }

        if (this.month > 12) {
            this.year = this.year + 1;
            this.month = 1;
        }
    }

    public void advance(int howManyDays) {
        this.day = this.day + howManyDays;
        if(this.day > 30){
            this.month = this.month + 1;
            this.day = this.day - 30;
            
            if(this.month > 12){
                this.month = this.month - 12;
                this.year = this.year + 1;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        if (!this.equals(newDate)) {
            if (days >= 0) {
                newDate.day = newDate.day + days;
                if (newDate.day > 30) {
                    newDate.day = newDate.day - 30;
                    newDate.month = newDate.month + 1;

                    if (newDate.month > 12) {
                        newDate.month = 1;
                        newDate.year = newDate.year + 1;
                    }
                }
            }
            return newDate;
        }
        return new SimpleDate(this.day, this.month, this.year);

    }
}
