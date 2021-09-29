// Account class with a constructor that initializes the name.

public class Account101 {
    private String name; // instance variable

    // constructor initializes with parameter name
    public Account101(String name){   // constructor name is class name
        this.name = name;
    }
    // method to set the name
    public void setName(String name){
        this.name = name;
    }

    // method to retrieve the name
    public String getName(){
        return name;
    }
}// end class account101
