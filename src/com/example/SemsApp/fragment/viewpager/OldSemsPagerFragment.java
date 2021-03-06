package com.example.SemsApp.fragment.viewpager;

import android.os.Bundle;
import android.view.*;
import com.example.SemsApp.R;
import com.example.SemsApp.application.SemsApplicationn;
import com.example.SemsApp.data.OldSemsData;
import com.example.SemsApp.data.lab.DataLab;
import com.example.SemsApp.fragment.pager_adapter.OldSemsPagerAdapter;

/**
 * Created by Administrator on 14. 3. 21.
 */
public class OldSemsPagerFragment extends ViewPagerFragment<OldSemsData> {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = super.onCreateView(inflater, container, savedInstanceState);
		viewPager.setAdapter(new OldSemsPagerAdapter(getFragmentManager(), dataLab));
		return view;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected int getViewPagerId() {
		return R.id.oldSemsViewPager;
	}

	@Override
	protected int getMenuResourceId() {
		return R.menu.old_sems_menu;
	}

	@Override
	protected int getSettingMenuItemId() {
		return R.id.oldSemsSettingMenuItem;
	}

	@Override
	protected int getFunctionMenuItemId() {
		return R.id.oldSemsFunctionMenuItem;
	}

	@Override
	public String getMachineName() {
		return new String(getResources().getString(R.string.old_sems));
	}

	@Override
	public DataLab<OldSemsData> getDataLab() {
		return ((SemsApplicationn)getActivity().getApplication()).dataLabs.get(SemsApplicationn.OLD_SEMS);
	}
}