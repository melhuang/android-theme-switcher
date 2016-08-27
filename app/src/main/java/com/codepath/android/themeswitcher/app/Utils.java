package com.codepath.android.themeswitcher.app;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by melissahuang on 8/25/16.
 */
public class Utils {
    private static int sTheme;

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int THEME_DUSK_POPPY = 1;
    public final static int THEME_OCEAN_BREEZE = 2;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                break;
            case THEME_DUSK_POPPY:
                activity.setTheme(R.style.Theme_Dusk_Poppy);
                break;
            case THEME_OCEAN_BREEZE:
                activity.setTheme(R.style.Theme_Ocean_Breeze);
                break;
        }
    }
}