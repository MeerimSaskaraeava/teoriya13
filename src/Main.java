public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Missi","missMissi", (byte) 4);
        Cat cat1=new Cat();

        Dog dog=new Dog("Dig","MisterDig", (byte) 3);
        Dog dog1=new Dog();

        System.out.println(cat.getName()+" "+cat.getFullName()+" "+ cat.getAge());
        System.out.println(dog.getName()+" "+dog.getFullName()+" "+ dog.getAge());



        Course course1=new Course("Js","Ayjamal",new Student("Ayjan",30,60));
        Course course2=new Course("Java","Rahim",new Student("Azamat",15,90));
        Course course3=new Course("Java 8","Muhammed",new Student("Meerim",39,50));

        Course[] courses={course1,course2,course3};


        for (Course cou:courses) {
            System.out.println(cou.getCourseName()+" "+cou.getInstructorName()+" "+cou.getName().getName()+" "+cou.getName().getAge()+" "+cou.getName().getTyping());

        }

    }

}