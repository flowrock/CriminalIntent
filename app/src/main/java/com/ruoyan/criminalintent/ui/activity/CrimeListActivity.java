package com.ruoyan.criminalintent.ui.activity;

import android.support.v4.app.Fragment;

import com.ruoyan.criminalintent.ui.fragment.CrimeListFragment;

/**
 * Created by ruoyan on 12/18/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}