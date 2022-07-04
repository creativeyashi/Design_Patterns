import java.util.*;
class wifimanager{
    public static wifimanager instance = new wifimanager();

    private Map<String, String> configMap = new HashMap<String, String>() {{
        put("host", "internal.db");
        put("port", "8179");
        put("user", "admin");
        put("password", "pa$$w0rD");
    }};

    private wifimanager() {

    }

    public String update(String key, String value) {
        return configMap.put(key, value);
    }

    public String get(String key) {
        return configMap.get(key);
    }

    public static wifimanager getInstance() {
        return instance;
    }
}
public class Singleton
{
    public static void main(String[] args) {
        wifimanager c=wifimanager.getInstance();
        c.update("port","123");
        wifimanager c1=wifimanager.getInstance();
        c1.update("port","1234");
        System.out.println(c.get("port"));
    }
}