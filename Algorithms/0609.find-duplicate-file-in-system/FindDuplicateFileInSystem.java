import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] nameCont = values[i].split("\\(");
                nameCont[1] = nameCont[1].replace(")", "");
                List<String> list = map.getOrDefault(nameCont[1], new ArrayList<>());
                list.add(values[0] + "/" + nameCont[0]);
                map.put(nameCont[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(map.get(key));
            }
        }
        return res;
    }
}