import java.util.*;
class WifiManager{
    public static WifiManager instance = new WifiManager();

    private Map<String, String> configMap = new HashMap<String, String>() {{
        put("host", "internal.db");
        put("port", "8179");
        put("user", "admin");
        put("password", "pa$$w0rD");
    }};

    private WifiManager() {

    }

    public String update(String key, String value) {
        return configMap.put(key, value);
    }

    public String get(String key) {
        return configMap.get(key);
    }

    public static WifiManager getInstance() {
        return instance;
    }
}
public class Singleton
{
    public static void main(String[] args) {
        WifiManager c=WifiManager.getInstance();
        c.update("port","123");
        WifiManager c1=WifiManager.getInstance();
        c1.update("port","1234");
        System.out.println(c.get("port"));
    }
}