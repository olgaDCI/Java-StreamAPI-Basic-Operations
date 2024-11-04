import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<StreamOperation> streamOperations = List.of(
                new MapOperation(),
                new FlatMapOperation(),
                new DistinctOperation(),
                new SortedOperation(),
                new CountOperation(),
                new FilterOperation(),
                new ReduceOperation()
        );

        streamOperations.forEach(StreamOperation::usageExamples);
    }

}
