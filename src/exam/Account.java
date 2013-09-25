package exam;

/**
 * Library contained in lib folder at project dir
 *
 */
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Daniel
 */
public final class Account {

    private String owner;
    private int number;
    private double interest_rate;

    public Account() {
    }
    
    public Account(String owner, int number, double interest_rate) {
        checkIRate(interest_rate);
        checkOwner(owner);
        this.owner = owner;
        this.number = number;
        this.interest_rate = interest_rate;
    }

    public void setOwner(String owner) {
        checkOwner(owner);
        this.owner = owner;
    }

    public void setIRate(double interest_rate) {
        checkIRate(interest_rate);
        this.interest_rate = interest_rate;
    }
    
    public void checkOwner(String owner) {
        if (StringUtils.isBlank(owner)) {
            throw new IllegalArgumentException("Illegal owner");
        }
    }
    
    public void checkIRate(double interest_rate) {
        if (interest_rate < 0.0) {
            throw new IllegalArgumentException("Illegal interest rate");
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
