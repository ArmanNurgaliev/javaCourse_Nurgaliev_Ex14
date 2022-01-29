import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<PC> pcList = new ArrayList<>();
        pcList.add(new PC("Mac", 32, 400000));
        pcList.add(new PC("ACER", 8, 110000));
        pcList.add(new PC("HP", 8, 120000));
        pcList.add(new PC("ASUS", 16, 150000));

        //sorted by price
        System.out.println("Sorted by price:");
        System.out.println(pcList.stream().sorted((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).collect(Collectors.toList()));
        System.out.println(pcList.stream().sorted((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())).collect(Collectors.toList()));

        //filtered by RAM
        System.out.println("Filtered by RAM");
        System.out.println(pcList.stream().filter(pc -> pc.getRAM() == 8).collect(Collectors.toList()));

        // sorted and grouped
        System.out.println("Sorted and grouped by ram");
        System.out.println(pcList.stream().sorted((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).collect(Collectors.groupingBy(PC::getRAM)));

        //min and max
        System.out.println("Min and Max");
        System.out.println(pcList.stream().min((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).get());
        System.out.println(pcList.stream().max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).get());

        //AllMatch, AnyMatch, NoneMatch
        System.out.println("AllMatch, AnyMatch, NoneMatch");
        System.out.println(pcList.stream().allMatch(pc -> pc.getName().equals("Mac")));
        System.out.println(pcList.stream().anyMatch(pc -> pc.getRAM() == 8));
        System.out.println(pcList.stream().noneMatch(pc -> pc.getRAM() == 10));
    }
}