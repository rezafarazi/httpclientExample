import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class main
{
    public static void main(String []args)
    {
        try
        {
            CloseableHttpClient httpClient= HttpClients.createDefault();
            HttpGet request=new HttpGet("https://rezafarazi.github.io/Online_Json_Api/user_example.json");
            CloseableHttpResponse response=httpClient.execute(request);
            HttpEntity en=response.getEntity();
            if(en!=null)
            {
                String result= EntityUtils.toString(en);
                System.out.print(result);
            }

        }
        catch (Exception E)
        {
            System.out.print(E.getMessage());
        }
    }
}
