package degendra.com.np.aarestexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by degendra on 9/18/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {
    public int answerCount;
    public String title;

    public Item() {}

    @Override
    public String toString() {
        return title + "\n" + "Answer Count: "+ answerCount;
    }
}
