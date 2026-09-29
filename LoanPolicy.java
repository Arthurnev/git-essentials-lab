package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) {
        if (type == MemberType.FACULTY) {
            return 5;
        }
        return 3;
    }

    public int maxDays() {
        return 14;
    }

    public int overdueFeePerDay() {
        return 100;
    }
}