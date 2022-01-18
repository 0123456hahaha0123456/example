package duc;

public class Person {

    private String name;
    private int age;

    /**
     * This constructor is used for create new person with name and age
     * @param name : a String present name of person
     * @param age : int
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Get name of person
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name of person with given name
     * @param name : String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get age of person
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age of person with given age
     * @param age : int
     */
    public void setAge(int age) {
        this.age = age;
    }


}
