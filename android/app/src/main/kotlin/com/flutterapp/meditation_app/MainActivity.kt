package com.flutterapp.meditation_app

import io.flutter.embedding.android.FlutterActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity: FlutterActivity() {
    AppCenter.start(getApplication(), "{Your app secret here}",
    Analytics.class, Crashes.class);
}
