package WzorceProjektkowe;

public class Logger {

    private static Logger INSTANCE;
    private Logger() {
    }
    public static Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

}

/*
Zaimplementować klasę Logger która:
- Będzie singletonem
- Powinna zawierać metodę log, która jako argument przyjmuje tekst (String) oraz zapisuje go do pliku.
- Scieżka do pliku powinna byc stała z góry ustalona
 */