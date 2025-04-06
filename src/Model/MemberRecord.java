package Model;

public class MemberRecord {
    private int memberID;
    private String type;
    private String dateOfMembership;
    private int noBooksIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private String phoneNumber;

    public MemberRecord(int memberID, String type, String dateOfMembership, int maxBookLimit, String name, String address, String phoneNumber) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    public void setNoBooksIssued(int noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }


    public MemberRecord getMember() {
        return this;
    }

    public void incBookIssued() {
        noBooksIssued++;
    }

    public void decBookIssued() {
        noBooksIssued--;
    }

    public void payBill(double amount) {
        // Fatura ödeme mantığı burada
    }
}