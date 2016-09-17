package degendra.com.np.aarestexample;

import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;
import org.springframework.http.client.OkHttpClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

/**
 * Created by degendra on 9/18/16.
 */
@Rest(rootUrl = "http://api.stackexchange.com/2.2/", converters = {MappingJacksonHttpMessageConverter.class},
        requestFactory = OkHttpClientHttpRequestFactory.class)
public interface Client extends RestClientErrorHandling {

    @Get("/search?pagesize=25&order=desc&sort=activity&tagged=android-annotations&site=stackoverflow")
    ResponseData getTaggedQuestions();
}
