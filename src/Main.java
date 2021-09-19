import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //*********************
        // Methods:
        // filter
        // map//
        // collect
        // forEach
        // sort


        // simple Stream iterator
        // Stream<Integer> numbers = Stream.iterate(1, n-> + 1);
        // System.out.println(numbers);
//*************************************************************************

        List<String> names = Arrays.asList("Pawel", "Wika", "Roman", "Karol", "Andrzej");

        //Stream<String> stream1 = names.stream().filter(new Predicate<String>() {
        // @Override
        //   public boolean test(String s) {
        //         return (!(s.endsWith("a")));
        //       }
        //     });
        //       stream1.forEach(a -> System.out.println(a));


        //}
//}
//*********************************************************************
        // names.stream()
        //       .filter(n -> n.endsWith("a"))
        //     .forEach(System.out::println)
        // ************************************************************************************
        //Stream<String> stream1 = names.stream();
        //Stream<String> stream2 = stream1.filter(n -> n.endsWith("a"));
        //List<String> list = stream2.collect(Collectors.toList());
        //System.out.println(list);

        //*********************************************************************************************
        //List<User> users = names.stream()
        //  .filter(n->n.endsWith("a"))
        //  .map(String -> new User(String, new Random().nextInt(40)))
        //   .collect(Collectors.toList());
        //System.out.println(users);

        //**************************************************************************************************

        List<User> users = names.stream()
               // .filter(n -> n.endsWith("a"))
                .map(String -> new User(String, new Random().nextInt(40)))
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(users);


    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


