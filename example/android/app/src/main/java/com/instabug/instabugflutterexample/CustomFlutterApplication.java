package com.instabug.instabugflutterexample;

import io.flutter.app.FlutterApplication;
import com.instabug.instabugflutter.InstabugFlutterPlugin;

import java.util.ArrayList;

public class CustomFlutterApplication extends FlutterApplication {
  @Override
  public void onCreate() {
    super.onCreate();
    ArrayList<String> invocation_events = new ArrayList<>();
    invocation_events.add(InstabugFlutterPlugin.INVOCATION_EVENT_FLOATING_BUTTON);
    InstabugFlutterPlugin instabug = new InstabugFlutterPlugin();
    instabug.start(CustomFlutterApplication.this, "837b1e59896e2ead9422dd110379e2ce", invocation_events);
    instabug.setWelcomeMessageMode("WelcomeMessageMode.disabled");
  }
}