package com.huatec.edu.mobileshop.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.huatec.edu.mobileshop.R;
import com.huatec.edu.mobileshop.common.BaseActivity;
import com.huatec.edu.mobileshop.common.BaseFragment;

/**
 * Created by lantern on 2019/10/11.
 */

public class NavigationFragment extends BaseFragment implements View.OnClickListener{
    private ImageButton mIbHome;
    private ImageButton mIbCategory;
    private ImageButton mIbCart;
    private ImageButton mIbPesonal;
    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private PersonalFragment personalFragment;

    @Override
    public int getContentViewId(){
        return R.layout.fragment_navigation;
    }
    @Override
    protected void initView(View view){
        super.initView(view);
        //初始化控件
        mIbHome = (ImageButton) view.findViewById(R.id.ib_home);
        mIbCategory = (ImageButton)  view.findViewById(R.id.ib_category);
        mIbCart =  (ImageButton) view.findViewById(R.id.ib_cart);
        mIbPesonal = (ImageButton)  view.findViewById(R.id.ib_personal);

        //设置监听器，监听点击事件
        mIbHome.setOnClickListener(this);
        mIbCategory.setOnClickListener(this);
        mIbCart.setOnClickListener(this);
        mIbPesonal.setOnClickListener(this);

        select(mIbHome);
    }

    private void select(View view){
        //重制ui
        mIbHome.setImageResource(R.drawable.tab_item_home_normal);
        mIbCategory.setImageResource(R.drawable.tab_item_category_normal);
        mIbCart.setImageResource(R.drawable.tab_item_cart_normal);
        mIbPesonal.setImageResource(R.drawable.tab_item_personal_normal);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (homeFragment != null){
            fragmentTransaction.hide(homeFragment);
        }
        if (categoryFragment != null){
            fragmentTransaction.hide(categoryFragment);
        }
        if (cartFragment != null){
            fragmentTransaction.hide(cartFragment);
        }
        if (personalFragment != null){
            fragmentTransaction.hide(personalFragment);
        }

        switch (view.getId()){
            case R.id.ib_home:
                mIbHome.setImageResource(R.drawable.tab_item_home_focus);
                if (homeFragment == null){
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,homeFragment);
                }else{
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case R.id.ib_category:
                mIbCategory.setImageResource(R.drawable.tab_item_category_focus);
                if (categoryFragment == null){
                    categoryFragment = new CategoryFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,categoryFragment);
                }else{
                    fragmentTransaction.show(categoryFragment);
                }
                break;
            case R.id.ib_cart:
                mIbCart.setImageResource(R.drawable.tab_item_cart_focus);
                if (cartFragment == null){
                   cartFragment = new CartFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,cartFragment);
                }else{
                    fragmentTransaction.show(cartFragment);
                }
                break;
            case R.id.ib_personal:
                mIbPesonal.setImageResource(R.drawable.tab_item_personal_focus);
                if (personalFragment == null){
                    personalFragment = new PersonalFragment();
                    fragmentTransaction.add(R.id.fl_main_navigation,personalFragment);
                }else{
                    fragmentTransaction.show(personalFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v){
        select(v);
    };

}
