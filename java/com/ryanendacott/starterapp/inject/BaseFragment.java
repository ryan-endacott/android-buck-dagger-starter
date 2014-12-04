package com.ryanendacott.starterapp.inject;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Base fragment class that supports injected members.
 */
public abstract class BaseFragment extends Fragment {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Perform injection so that when this call returns all dependencies will be available for use.
    ((Injector) getActivity().getApplication()).inject(this);
  }
}
