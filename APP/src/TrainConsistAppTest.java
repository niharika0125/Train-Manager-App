import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    private List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 54));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("First Class", 36));
        list.add(new Bogie("AC Chair", 60));
        return list;
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result = getSampleBogies().stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result = getSampleBogies().stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result = getSampleBogies().stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(3, result.keySet().size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> emptyList = new ArrayList<>();

        Map<String, List<Bogie>> result = emptyList.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 70)
        );

        Map<String, List<Bogie>> result = list.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(1, result.size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result = getSampleBogies().stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result = getSampleBogies().stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        List<Bogie> copy = new ArrayList<>(original);

        original.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(copy.size(), original.size());
        assertEquals(copy.toString(), original.toString());
    }
}