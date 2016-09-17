package degendra.com.np.aarestexample;

import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.rest.spring.annotations.RestService;
import org.androidannotations.rest.spring.api.RestErrorHandler;
import org.springframework.core.NestedRuntimeException;

/**
 * Created by degendra on 9/18/16.
 */
@EBean(scope = EBean.Scope.Singleton)
public class Request {
    protected static Request request;

    @RestService
    public Client client;

    @AfterInject
    public void initClient(){
        client.setRestErrorHandler(new RestErrorHandler() {
            @Override
            public void onRestClientExceptionThrown(NestedRuntimeException e) {
                Log.e("error", e.getMessage());
            }
        });
    }
}
