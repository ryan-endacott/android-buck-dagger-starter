package com.ryanendacott.starterapp.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ryanendacott.starterapp.R;
import com.ryanendacott.starterapp.inject.BaseFragment;

/**
 * Main fragment for the app.
 */
public class MainFragment extends BaseFragment {

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.main_fragment, container, false);
  }
}
