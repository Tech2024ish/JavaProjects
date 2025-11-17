class Student{
    private String name;
    // This is a function for getting name
    String getName(){
        return name;
    }
    // This is a function for setting the value of  name
    void setName(String name){
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){
        Student st = new Student();
        st.setName("Goslish");
        System.out.println("\nMy name is: "+st.getName());
    }
}
