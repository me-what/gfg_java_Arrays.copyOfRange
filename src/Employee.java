public class Employee {
    int Eid;
    String Ename;

    public Employee(int Eid, String Ename)
    {
        this.Eid = Eid;
        this.Ename = Ename;
    }

    public String toString()
    {
        return Eid + "   " + Ename;
    }
}