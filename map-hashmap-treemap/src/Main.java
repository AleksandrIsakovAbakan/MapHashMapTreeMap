import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ivan");
        hashMap.put(2, "Oleg");
        hashMap.put(3, "Tatiana");
        hashMap.put(4, "Igor");
        hashMap.put(5, "Sergei");
        hashMap.put(6, "Ira");

        System.out.println(returnsSetKeysContainedInMap(hashMap));
        System.out.println(returnsMapConsistingOfElementsOfOriginal(hashMap));
    }

    /*
    Создайте HashMap c ключами Integer, значениями – String.
    Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
    */
    public static Set<Integer> returnsSetKeysContainedInMap(Map<Integer, String> hashMap){
        return hashMap.keySet();
    }

    /*
    Создайте HashMap c ключами Integer, значениями – String.
    Напишите метод, который возвращает ассоциативный массив, состоящий из элементов исходного map, при условии,
    что туда войдут элементы с длиной строки более 3.
    Т.е. исходный map: [1="Red",2="Green",3="Black"].
    Новый map: [2="Green",3="Black"].
    */
    public static Map<Integer, String> returnsMapConsistingOfElementsOfOriginal(Map<Integer, String> hashMap){
        Map<Integer, String> map = new HashMap<>();
        for (Map.Entry<Integer, String> i: hashMap.entrySet()){
            if (i.getValue().length() > 3) map.put(i.getKey(), hashMap.get(i.getKey()));
        }
        return map;
    }
}
