package poo.Talleres.Taller4.ej4;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private final int areaCode, prefix, lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int result = Integer.compare(this.areaCode, o.areaCode);
        if (result == 0) {
            result = Integer.compare(this.prefix, o.prefix);
            if (result == 0) {
                result = Integer.compare(this.lineNumber, o.lineNumber);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
