
package ExerciseSorting;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Emp implements Comparable<Emp> {
   private int age;
   private String name;
   private double sal;
public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name + ", sal=" + sal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
        
    }

    @Override
    public int compareTo(Emp o) {
        return (int)(this.sal-o.sal);
    }
    
    

   
}
