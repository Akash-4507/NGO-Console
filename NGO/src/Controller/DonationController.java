package Controller;

import model.Donation;

import java.time.LocalDate;
import java.util.List;

public interface DonationController {
    String makeDonation(Donation donation);
    String editDonation(int id, String donorName, String donationDescription, LocalDate donationDate, int amount, String forServiceName);
    String deleteDonation(int id);
    List<Donation> getDonations();
}
