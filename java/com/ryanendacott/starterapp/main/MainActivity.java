package com.ryanendacott.starterapp.main;

import android.os.Bundle;
import com.ryanendacott.starterapp.R;
import com.ryanendacott.starterapp.inject.BaseActivity;

/**
 * Main activity for the app.
 */
public class MainActivity extends BaseActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.main_activity);
  }
}
