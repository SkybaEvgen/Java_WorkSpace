import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        Employee e = new Employee("Ivan", 2500);
        Employee mike = new Employee("Mike", 3500);

        Consumer<String> printable = System.out::println;             //функциональный интерфейс Consumer
        printable.accept("Hello World");                            //в интерфейс Consumer можно передавать различные
                                                                      // методы  (реализация функционального интерфейса
                                                                      //с помощью ссылки на метод т.е. с помощью метода референс)

        Consumer<String> printable2 = str -> System.out.println(str); //идентичная запись в верхней строке (реализация
                                                                      // функционального интерфейса с помощью лямбда выражения)

        //***************************************************************
        PrintableI pi = System.out::println;
        pi.print("Hello World Custom");
        //***************************************************************
        Consumer<String> printer = getPrinter();
        printer.accept("asdfdqw");
        //***************************************************************
        printSomething(System.out::println);
        printSomething(getPrinter());
        printSomething(str -> System.out.println(str));
        //***************************************************************
        int maxSalary = Employee.getMaxSalary();                       //в этой строке вызываем метод getMaxSalary()
        Supplier<Integer> getMaxSalary = Employee::getMaxSalary;       //Method reference to static method
                                                                       // в этой строке передаём ссылку на метод getMaxSalary()
                                                                       // переменной, которая называется getMaxSalary.

        Function<Employee, Integer> getSalary = Employee::getSalary;      //Method reference to non static method no instance.
        System.out.println("mike's salary is " + getSalary.apply(mike));  //переменна getSalary содержит ссылку на метод getSalary().
        //***************************************************************
        Supplier<Integer> getMikesSalary = mike::getSalary;
        System.out.println("mike's salary is " + getMikesSalary.get());
        //***************************************************************
        //***************************************************************

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> collect = list.stream().map(i -> i * 2).collect(Collectors.toList()); //каждый элемент list умножили на 2.
        System.out.println(collect);
        //***************************************************************
        List<Integer> integers = list.stream().filter(i -> i > 3).collect(Collectors.toList()); //получили список list с элементами больше 3.
        System.out.println(integers);
        //***************************************************************
        List<Employee> employees = Arrays.asList(e, mike);
        List<String> employeeNames = employees                                   // получили список имен
                .stream()
                .map(Employee::getName/*emp -> emp.getName()*/)
                .collect(Collectors.toList());
        System.out.println("Employee name's " + employeeNames);
        ///////
        List<Integer> employeeSalary = employees                                // получили список зарплат
                .stream()
                .map(Employee::getSalary)
                .collect(Collectors.toList());
        System.out.println("Employee salary " + employeeSalary);
        //////
        List<Integer> employeeSalaryFilter = employees                           // получили список зарплат > 2700
                .stream()
                .map(Employee::getSalary)
                .filter(i -> i > 2700)
                .collect(Collectors.toList());
        System.out.println("Employee salary > 2700" + employeeSalaryFilter);
        //////
        employees.forEach(System.out::println /*str -> System.out.println(str)*/);     //распечатать каждого сотрудника
        //////
        employees                                                                //распечатать зарплату каждого сотрудника
                .stream()
                .map(Employee::getSalary)
                .forEach(System.out::println);
        //////
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);               //создание стрима из элементов
        //////
        Integer reduce = integerStream.reduce(0, (a1, b1) -> a1 + b1);   //просуммировали элементы списка
        System.out.println("Reduce list of integer " + reduce);
        //////
        Stream<String> strings = Stream.of("I", "have", "a", "dream");          //просуммировали строки
        String reduce1 = strings.reduce("", (st1, st2) -> st1 + " " + st2);
        System.out.println(reduce1);
        //////
        Stream<Integer> integerStream1 = employees                                //
                .stream()
                .map(empl -> {
                    System.out.println("Employee " + empl);
                    return empl.getSalary();
                });
        integerStream1.collect(Collectors.toList());
        //////
        boolean b = employees.stream().allMatch(p -> p.getSalary() > 1000);    // проверяем все ли получают больше 1000
        System.out.println("All more than 1000? " + b);

    }




    public static Consumer<String> getPrinter(){
        return System.out::println;
    }

    public static void printSomething(Consumer<String> c){
        c.accept("dsfwefaq");
    }
}
