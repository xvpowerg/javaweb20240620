package tw.com.tools;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tw.com.beans.Mask;
import tw.com.json.MaskJsonTools;

import java.util.List;
import java.util.function.Consumer;
public class MaskNetTools {
	private final static String MASK_URL = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
	public static void downloadMaskJson(Consumer<List<Mask>> callBack) {
	 OkHttpClient client = new OkHttpClient().newBuilder().build();
	 Request okRequest = new Request.Builder().url(MASK_URL).build();
	 Call call = client.newCall(okRequest);
	 call.enqueue(new Callback() {
		
		@Override
		public void onResponse(Call arg0, Response response) throws IOException {
			// TODO Auto-generated method stub
			String result =  response.body().string();
			MaskJsonTools.maskJsonToObj(result,list->{
				
				callBack.accept(list);
				
			});
			//System.out.println(result);
		}
		
		@Override
		public void onFailure(Call arg0, IOException ex) {
			// TODO Auto-generated method stub
			System.out.println("onFailure:"+ex);
		}
	});
	}
}
