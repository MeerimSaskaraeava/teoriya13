public class Student {
    private String name;
    private int age;
    private int typing;


    public Student(){
    }

    public Student(String name,int age, int typing){
        if (age<16){
            this.name=name;
            System.out.println("");
        }else {this.age=age;
            this.name=name;
            this.typing=typing;
        }

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getTyping(){
        return typing;
    }
}
