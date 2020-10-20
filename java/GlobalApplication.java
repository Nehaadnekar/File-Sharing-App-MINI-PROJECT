package easyshare;

import android.app.Application;
import android.content.Context;

public class GlobalApplication extends Application {
private static Context GlobalContext;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		if(GlobalApplication.GlobalContext == null){
			GlobalApplication.GlobalContext = getApplicationContext();
		}
	}
	
	public static Context getGlobalAppContext() {
		return GlobalApplication.GlobalContext;
	}
}
