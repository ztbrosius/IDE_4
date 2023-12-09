// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //High Schools
        HighSchool radfordHigh = new HighSchool();
        radfordHigh.setEnrollment(829);
        radfordHigh.setSchoolName("Radford High School");


        //Middle Schools
        MiddleSchool daltonMiddle = new MiddleSchool();
        daltonMiddle.setEnrollment(521);
        daltonMiddle.setSchoolName("Dalton Intermediate School");


        //Elementary Schools
        ElementarySchool mchargElementary = new ElementarySchool();
        ElementarySchool belleHethElementary = new ElementarySchool();
        mchargElementary.setEnrollment(381);
        belleHethElementary.setEnrollment(970);
        mchargElementary.setSchoolName("McHarg Elementary School");
        belleHethElementary.setSchoolName("Belle Heth Elementary School");


        //print out constants
        System.out.println("\nSchool System: " + Constants.SCHOOL_SYSTEM_NAME);
        System.out.println("Superintendent: " + Constants.SUPERINTENDENT);
        System.out.println("Phone Number: " + Constants.PHONE_NUMBER);

        //high schools output
        System.out.println("\nHigh Schools: " + radfordHigh.getSchoolName());
        System.out.println("Enrollment: " + radfordHigh.getEnrollment());
        System.out.print("Level: ");
        radfordHigh.describeLevel();

        //middle schools output
        System.out.println("\nMiddle Schools: " + daltonMiddle.getSchoolName());
        System.out.println("Enrollment: " + daltonMiddle.getEnrollment());
        System.out.print("Level: ");
        daltonMiddle.describeLevel();

        //elementary schools output
        System.out.println("\nElementary Schools: " + mchargElementary.getSchoolName() + ", " + belleHethElementary.getSchoolName());
        System.out.println("Enrollment: " + mchargElementary.getEnrollment() + ", " + belleHethElementary.getEnrollment());
        System.out.print("Level: ");
        mchargElementary.describeLevel(); // only need one even though there are two schools based on the way it is written
    }
}