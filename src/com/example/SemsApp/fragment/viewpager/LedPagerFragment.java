package com.example.SemsApp.fragment.viewpager;

import android.os.Bundle;
import android.view.*;
import com.example.SemsApp.R;
import com.example.SemsApp.application.SemsApplicationn;
import com.example.SemsApp.data.LedData;
import com.example.SemsApp.data.lab.DataLab;
import com.example.SemsApp.fragment.pager_adapter.LedPagerAdapter;

/**
 * Created by Administrator on 14. 3. 21.
 */
public class LedPagerFragment extends ViewPagerFragment<LedData> {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = super.onCreateView(inflater, container, savedInstanceState);
		viewPager.setAdapter(new LedPagerAdapter(getFragmentManager(), dataLab));
		return view;	}

	@Override
	protected int getViewPagerId() {
		return R.id.ledViewPager;
	}

	@Override
	protected int getMenuResourceId() {
		return R.menu.led_menu;
	}

	@Override
	protected int getSettingMenuItemId() {
		return R.id.ledSettingMenuItem;
	}

	@Override
	protected int getFunctionMenuItemId() {
		return R.id.ledFunctionMenuItem;
	}

	@Override
	public String getMachineName() {
		return new String(getResources().getString(R.string.led_dimmer));
	}

	@Override
	public DataLab<LedData> getDataLab() {
		return ((SemsApplicationn)getActivity().getApplication()).dataLabs.get(SemsApplicationn.LED_DIMMER);
	}
}