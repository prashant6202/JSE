
package myempmgmt.pojo;


public class EmpPojo {
   private int empNo;
   private String empName;
   private double empSal;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public EmpPojo(int empNo, String empName, double empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }
    public EmpPojo(){
    
    }
}
