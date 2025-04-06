package Model;

public class Student extends MemberRecord {
    public Student(int memberID, String type, String dateOfMembership, int maxBookLimit, String name, String address, String phoneNumber) {
        super(memberID, type, dateOfMembership, maxBookLimit, name, address, phoneNumber);
    }
}