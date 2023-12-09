abstract public class School
{
    private int enrollment;
    public abstract void describeLevel();
    private String schoolName;
    public void setEnrollment(int students)
    {
        enrollment = students;
    }
    public int getEnrollment()
    {
        return enrollment;
    }
    public void setSchoolName(String nameOfSchool)
    {
        schoolName = nameOfSchool;
    }
    public String getSchoolName()
    {
        return schoolName;
    }
}