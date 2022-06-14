import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, Integer> missedCalls = new TreeMap<>();

    public Map<LocalDateTime, Integer> addMissedCalls(LocalDateTime time, Integer tel) {
        missedCalls.put(time, tel);
        return missedCalls;
    }

    public void printAllMissedCalls(PhoneBook phoneBook) {
        for (Map.Entry<LocalDateTime, Integer> kv : missedCalls.entrySet()) {
            Contacts c = phoneBook.printByTel(kv.getValue());
            if (c == null) {
                System.out.println(kv.getKey() + " --> " + kv.getValue());
            } else {
                System.out.println(kv.getKey() + " --> " + c.getName());

            }
        }

    }
}

