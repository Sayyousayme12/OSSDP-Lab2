import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution6 {
    Set<String>[] s;

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int n = favoriteCompanies.size(); // 修改为直接获取数组长度
        s = new HashSet[n]; // 初始化数组s的长度为n
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            s[i] = new HashSet<>();
            for (String com : favoriteCompanies.get(i)) {
                s[i].add(com);
            }
        }

        for (int i = 0; i < n; ++i) {
            boolean isSub = false;
            for (int j = 0; j < n; ++j) {
                if (i != j && check(favoriteCompanies, i, j)) {
                    isSub = true;
                    break; // 找到子集后可以提前退出
                }
            }
            if (!isSub) {
                ans.add(i); // 如果不是子集，则添加到结果
            }
        }

        return ans; // 将返回语句移到循环外面
    }

    public boolean check(List<List<String>> favoriteCompanies, int x, int y) {
        for (String com : favoriteCompanies.get(x)) {
            if (!s[y].contains(com)) {
                return false;
            }
        }
        return true;
    }
}