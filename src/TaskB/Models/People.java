package TaskB.Models;

public class People {
    private int peopleId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    public People() {
    }

    public People(int peopleId, String firstName, String lastName, String dateOfBirth) {
        this.peopleId = peopleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
