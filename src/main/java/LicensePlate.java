
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // let's convert the object to a Book-object
        LicensePlate comparedLicensePlate = (LicensePlate) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.liNumber.equals(comparedLicensePlate.liNumber) &&
            this.country == comparedLicensePlate.country) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }
    
    public int hashCode() {
        return ((this.liNumber) + (this.country)).hashCode();
    }
}
