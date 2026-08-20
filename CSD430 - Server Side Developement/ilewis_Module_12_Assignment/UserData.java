package model;

public class UserData {
    private String firstName, lastName, email, phone, gender, dob, country, profession;

    // Getters and setters for all fields
    public String getFirstName() { return firstName; }
    public void setFirstName(String fn) { firstName = fn; }

    public String getLastName() { return lastName; }
    public void setLastName(String ln) { lastName = ln; }

    public String getEmail() { return email; }
    public void setEmail(String em) { email = em; }

    public String getPhone() { return phone; }
    public void setPhone(String ph) { phone = ph; }

    public String getGender() { return gender; }
    public void setGender(String g) { gender = g; }

    public String getDob() { return dob; }
    public void setDob(String d) { dob = d; }

    public String getCountry() { return country; }
    public void setCountry(String c) { country = c; }

    public String getProfession() { return profession; }
    public void setProfession(String p) { profession = p; }
}