package org.linphone.activities;

import android.app.Application;
import org.linphone.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(
                new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/shabnam.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build());
    }
}
