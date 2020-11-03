import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class getDust {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{            
            String urlstr = "http://openapi.airkorea.or.kr/"
                    + "openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty"
                    + "?stationName=¼ö³»µ¿&dataTerm=month&pageNo=1&numOfRows=10&ServiceKey=eO8HXm7CXSi%2BP02CSvG44gs5ryzOBKit2FJnfrjEU6T7crNUr9eOXhzLXUw9Elc1ZOwswUKMF3J98w4pyrxLbw%3D%3D&ver=1.3";
            URL url = new URL(urlstr);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("GET");
            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
            String result = "";
            String line;
            while((line = br.readLine()) != null) {
                result = result + line + "\n";
            }
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

