import org.json.JSONObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SeleniumBadLinksTest {


    @Test
    public void countBadLinks() throws Exception {
        DeadLinks deadLinks = new SeleniumBadLinks();
        List<String> links = deadLinks.badLinks("https://android.stackexchange.com/questions/4538/can-i-emulate-a-bluetooth-keyboard-with-my-android-device");
        int result = 10;
        assertEquals(result, links.size());
    }

    @Test
    public void jsoupBadLinksTest() throws Exception {
        DeadLinks deadLinks = new JsoupBadLinks();
        List<String> links = deadLinks.badLinks("https://android.stackexchange.com/questions/4538/can-i-emulate-a-bluetooth-keyboard-with-my-android-device");
        int result = 10;
        assertEquals(result, links.size());
    }



}