public class Demo {
  /*public String MONDAY = "Monday";

    public static void main(String[] args) {
        doSomething();
        Demo d = new Demo();
        Demo d2 = new Demo();
        d.doSomething2();
    }

    public static void doSomething(){
        System.out.println("Hello world");
    }

    public void doSomething2(){
        System.out.println("Hello world");
    }*/
 /* public static void main(String[] args) {

      Person p = new Person();

      //p.name = "Ivan";                          //   3-й вариант не работает если
      //p.age = 25;                               // поля private

      Person p2 = new Person();                   //
      p2.setName("Piotor");                       //    1-й вариант
      p2.setAge(35);                              //

      System.out.println(p2);
      rename(p2, "Maria");
      System.out.println(p2);

      Person p3 = new Person("Natalia", 25);    //    2-й вариант

  }

  public static void rename(Person p, String newName){
      p.setName(newName);
  }*/
  public static void main(String[] args) {
      Person p = new Boy ("Ivan", 25);
      p.speak();
      p.age();
  }

}
