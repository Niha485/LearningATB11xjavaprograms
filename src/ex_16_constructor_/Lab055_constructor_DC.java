package ex_16_constructor_;
public class Lab055_constructor_DC {
    public static void main(String[] args) {
        Baby b1 = new Baby();         // First object created -> Constructor runs
        new Baby(); // Second object created -> Constructor runs
        Baby b2; //No object created, just a reference declared (constructor does NOT run)
    }
}
class Baby{
    // Attribute | Instance Variable |  Member variables, data members

    String name;

    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Cry!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

    // Default Constructor!
    Baby(){
        System.out.println("I am called, Default Constructor!");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)


    }
}

