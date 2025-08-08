package lab_seven_third;

public class Lab_Seven_ThirdUtil {

    public class Lab_Seven_Three_Util implements Comparable<Lab_Seven_Three_Util> {
        private int id;
        private String name;
        private double salary;
        private String designation;
        private String insuranceScheme;

        public Lab_Seven_Three_Util() {
        }

        public Lab_Seven_Three_Util(int id, String name, double salary, String designation, String insuranceScheme) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.designation = designation;
            this.insuranceScheme = insuranceScheme;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getDesignation() {
            return designation;
        }

        public String getInsuranceScheme() {
            return insuranceScheme;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public void setInsuranceScheme(String insuranceScheme) {
            this.insuranceScheme = insuranceScheme;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
                    + ", insuranceScheme=" + insuranceScheme + "]";
        }

        @Override
        public int compareTo(Lab_Seven_Three_Util o) {
            return Double.compare(this.salary, o.salary); // ascending order by salary
        }
    }
}
