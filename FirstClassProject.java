class FirstClassProject {
    String name;
    int age;
    String address;

    // This is a contructor
    FirstClassProject(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // This is a function to set a name
    public void setName(String name){
        this.name = name;
    }

    // This is a functio n for setting the age
    public void  setAge(int age){
        this.age = age;
    }

    // This is a function for setting the address
    public void setAddfess(String address){
        this.address = address;
    }

    // This is a function for getting the name
    public String getName(){
        return name;
    }

    // This is a function for getting age
    public int getAge(){
        return age;
    }

    // This is a function foe getting address
    public String getAddress(){
        return address;
    }
    // This is a function for returning all properties
    @Override
    public String toString(){
        return ("\nStudent name: "+this.getName()+"\tAge: "+this.getAge()+"\tAddress: "+this.getAddress());
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating the object of class
        FirstClassProject first = new FirstClassProject("ISHIMWE Jean Claude", 25, "KN 168 ST");
        FirstClassProject second = new FirstClassProject("IRADUKUNDA UWIMANA Yvonne", 20, "Muhanga 203 ST");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println("\n");
        
    }
    
}
