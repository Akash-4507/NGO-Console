package model;

import java.time.LocalDate;
import java.util.Date;

public class Donation {
    private static int counter=0;
    private int donationID;
    private String donarName;
    private String donationDescription;
    private LocalDate donationDate;
    private int amount;
    private String forServiceName;

    public Donation(String donorName, String donationDescription, LocalDate donationDate, int amount, String forServiceName) {
        donationID = ++counter;
        this.donarName = donorName;
        this.donationDescription = donationDescription;
        this.donationDate = donationDate;
        this.amount = amount;
        this.forServiceName = forServiceName;
    }

    public int getDonationID() {
        return donationID;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
    }

    public String getDonationDescription() {
        return donationDescription;
    }

    public void setDonationDescription(String donationDescription) {
        this.donationDescription = donationDescription;
    }

    public LocalDate getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDate donationDate) {
        this.donationDate = donationDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getForServiceName() {
        return forServiceName;
    }

    public void setForServiceName(String forServiceName) {
        this.forServiceName = forServiceName;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donationID=" + donationID +
                ", donarName='" + donarName + '\'' +
                ", donationDescription='" + donationDescription + '\'' +
                ", donationDate=" + donationDate +
                ", amount=" + amount +
                ", forServiceName='" + forServiceName + '\'' +
                '}';
    }
}
