package ie.atu;

public class Employee {
    private String name;
    private String pps;
    private String phone;

    public Employee(String nameSize, String ppsSize, String phoneSize){
        if(nameSize.length() >= 5 && nameSize.length() <= 22){
            this.name = nameSize;
        }
        else{
            throw new IllegalArgumentException("Name is invalid! Must be between 5 -22 characters");
        }

        if(ppsSize.length() == 6){
            this.pps = ppsSize;
        }
        else{
            throw new IllegalArgumentException("PPS ID invalid! Must be 6 characters long");
        }

        if(phoneSize.length() == 11){
            this.phone = phoneSize;
        }
        else{
            throw new IllegalArgumentException("Phone number invalid! Must be 11 characters long");
        }
    }

    public String getName(){
        return name;
    }

    public String getPPS(){
        return pps;
    }

    public String getPhone(){
        return phone;
    }
}
