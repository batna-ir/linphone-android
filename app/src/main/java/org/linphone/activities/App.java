package org.linphone.activities;

import android.app.Application;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import org.linphone.R;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ViewPump.init(
                ViewPump.builder()
                        .addInterceptor(
                                new CalligraphyInterceptor(
                                        new CalligraphyConfig.Builder()
                                                .setDefaultFontPath(
                                                        "fonts/Roboto-RobotoRegular.ttf")
                                                .setFontAttrId(R.attr.fontPath)
                                                .build()))
                        .build());
        // ....
    }
}
