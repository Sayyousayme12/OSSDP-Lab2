import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L20222118596Test{

    @Test
    public void testPeopleIndexes() {
        Solution6 solution = new Solution6();

        // 测试用例 1
        List<List<String>> favoriteCompanies1 = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("google", "microsoft"),
                Arrays.asList("google", "facebook"),
                Arrays.asList("google"),
                Arrays.asList("amazon")
        );
        List<Integer> expected1 = Arrays.asList(0, 1, 4);
        assertEquals(expected1, solution.peopleIndexes(favoriteCompanies1));

        // 测试用例 2
        List<List<String>> favoriteCompanies2 = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("leetcode", "amazon"),
                Arrays.asList("facebook", "google")
        );
        List<Integer> expected2 = Arrays.asList(0, 1);
        assertEquals(expected2, solution.peopleIndexes(favoriteCompanies2));

        // 测试用例 3
        List<List<String>> favoriteCompanies3 = Arrays.asList(
                Arrays.asList("leetcode"),
                Arrays.asList("google"),
                Arrays.asList("facebook"),
                Arrays.asList("amazon")
        );
        List<Integer> expected3 = Arrays.asList(0, 1, 2, 3);
        assertEquals(expected3, solution.peopleIndexes(favoriteCompanies3));
    }
}