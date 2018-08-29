package com.example.oauthandroidexample;

import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(77, 43 + 34);
    }

    VdkApiInterface api;
    @Before
    public  void BeforeUnitTest(){
        Retrofit rf =  APIClient.getVdkTestApiClient();
        api = rf.create(VdkApiInterface.class);
    }


    @Test
    public void web_api_simple_test() throws Exception {
        Call<String> call = api.simple();
        Response<String> response = call.execute();
        String txt = response.body();
        assertEquals("data", txt);
    }
}