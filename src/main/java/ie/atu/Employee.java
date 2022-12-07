package ie.atu;

public class Employee {
    private String name;

    public Employee(String nameSize){
        if(nameSize.length() >= 5 && nameSize.length() <= 22){
            this.name = nameSize;
        }
        else{
            throw new IllegalArgumentException("Name is invalid! Must be between 5 -22 characters");
        }
    }

    public String getName(){
        return name;
    }
}
