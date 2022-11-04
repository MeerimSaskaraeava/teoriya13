public class Cat {
    private String name;
    private String fullName;
    private byte age;

    public Cat(String name,String fullName,byte age){
      this.name=name;
      this.fullName=fullName;
      this.age=age;
    }
    public Cat(){

    }public String getName(){
        return name;
    }
    public String getFullName(){
        return fullName;
    }
    public byte getAge(){
        return age;
    }
}
