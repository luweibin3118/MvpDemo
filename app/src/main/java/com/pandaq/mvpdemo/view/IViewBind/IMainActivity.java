package com.pandaq.mvpdemo.view.IViewBind;

import com.pandaq.mvpdemo.enums.ClientType;

/**
 * Created by PandaQ on 2016/11/20.
 * email : 767807368@qq.com
 */

public interface IMainActivity {
    void get12306Test(ClientType type);

    void showResult(String result);
}
