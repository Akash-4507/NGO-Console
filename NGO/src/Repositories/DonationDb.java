package Repositories;

import model.Donation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DonationDb {
    private final List<Donation> donations=new ArrayList<Donation>();

    public String makeDonationDb(Donation donation) {
        donations.add(donation);
        return "Donation added";
    }

    public String updateDonationDb(int id, String donorName, String donationDescription, LocalDate donationDate, int amount, String forServiceName) {
        for (int i = 0; i < donations.size(); i++) {
            if (donations.get(i).getDonationID() == id) {
                donations.get(i).setDonarName(donorName);;
                donations.get(i).setDonationDescription(donationDescription);
                donations.get(i).setDonationDate(donationDate);
                donations.get(i).setAmount(amount);
                donations.get(i).setForServiceName(forServiceName);
                return "Donation updated successfully.";
            }
        }
        return "Donation not found.";
    }


    public String deleteDonationDb(int id) {
        for(Donation d:donations) {
            if(d.getDonationID() == id) {
                donations.remove(d);
                return "Donation deleted successfully.";
            }
        }
        return "Donation not found.";
    }


    public List<Donation> getDonationDb() {
        return donations;
    }
}
