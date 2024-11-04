import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PairImpl {
    public static void main(String[] args) {

        List<Pair> pairs=new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            pairs.add(new Pair(i, i * 10));
        }

       // pairs.forEach(pair -> System.out.println("Shelf: " + pair.shelf + " Cost: " + pair.cost));

       //pairs.stream().filter(pair -> pair.shelf % 2 == 0).forEach(pair -> System.out.println("Shelf: " + pair.shelf + " Cost: " + pair.cost));

        //List<Pair> filteredPairs = pairs.stream().filter(pair -> pair.shelf % 2 == 0).collect(Collectors.toList());

        //Set<Pair>pairSet=pairs.stream().filter(pair -> pair.shelf % 2 == 0).collect(Collectors.toSet());

        //Map<Integer,Integer>map=pairs.stream().collect(Collectors.toMap(pair -> pair.shelf,pair -> pair.cost));
//        List<Pair>sortedPairs=pairs.stream().sorted(
//                (pair1,pair2)->pair1.cost-pair2.cost
//        ).collect(Collectors.toList());

//        int max=pairs.stream().max(
//                (pair1,pair2)->pair1.cost-pair2.cost
//        ).get().cost;

//        int sum=pairs.stream().map(pair -> pair.cost).reduce(0,(a,b)->a+b);
//        System.out.println(sum);

//        int min=pairs.stream().min(
//                (pair1,pair2)->pair1.cost-pair2.cost
//        ).get().cost;

        //List<Pair>filteredLimited=pairs.stream().filter(pair -> pair.shelf%2==0).limit(5).collect(Collectors.toList());

      //  List<Pair>filteredSkipped=pairs.stream().filter(pair -> pair.shelf%2==0).skip(5).collect(Collectors.toList());


    }
}
class Pair{
    int shelf;
    int cost;
    Pair(int shelf, int cost){
        this.shelf = shelf;
        this.cost = cost;
    }
}
