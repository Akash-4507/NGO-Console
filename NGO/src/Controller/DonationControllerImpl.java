package Controller;

import Repositories.DonationDb;
import model.Donation;

import java.time.LocalDate;
import java.util.List;

public class DonationControllerImpl implements DonationController {
    private static final DonationDb donationDb = new DonationDb();

    @Override
    public String makeDonation(Donation donation) {
       return donationDb.makeDonationDb(donation);
    }

    @Override
    public String editDonation(int id, String donorName, String donationDescription, LocalDate donationDate, int amount, String forServiceName) {
        return donationDb.updateDonationDb(id,donorName,donationDescription,donationDate,amount,forServiceName);
    }

    @Override
    public String deleteDonation(int id) {
        return donationDb.deleteDonationDb(id);
    }

    @Override
    public List<Donation> getDonations() {
        return donationDb.getDonationDb();
    }
}
