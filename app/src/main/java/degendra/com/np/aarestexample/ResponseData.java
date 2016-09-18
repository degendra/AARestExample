package degendra.com.np.aarestexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by degendra on 9/18/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseData implements Serializable {
    public ArrayList<Item> items;
}
