package mvp.bawie.com.mvp.presenter;

import android.util.Log;

import mvp.bawie.com.mvp.modle.ModleData;
import mvp.bawie.com.mvp.view.MainActivity;
import mvp.bawie.com.mvp.view.MvpView;


/**
 * Created by ZhangFanfan on 2016/12/2.
 */

public class MyPresenter {

   private MvpView myView;
    public void setMyView(MainActivity myView) {
        this.myView = myView;

    }
    public void  getData(){
        ModleData data = new ModleData();
        myView.getSucces(data.sendData());
        Log.e("getData",data.sendData()+"++++ ++ ++++  +++  +++++++++");
    }

}
