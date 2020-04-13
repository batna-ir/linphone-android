package ir.batna;

import android.content.Context;
import android.content.SharedPreferences;

public class BatnaSharedPreferences {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public BatnaSharedPreferences(Context context) {
        sharedPreferences =
                context.getSharedPreferences("BatnaSharedPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveValue(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    public void saveValue(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }
}
