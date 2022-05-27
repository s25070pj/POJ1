public class Author {

   private String name;
   private String surname;
   private int age;

    Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

   public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surnameParameter){
        this.surname = surnameParameter;
    }
    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Author name = "+ getName() +", surname = "+ getSurname() +", age = "+ getAge();
    }

}
