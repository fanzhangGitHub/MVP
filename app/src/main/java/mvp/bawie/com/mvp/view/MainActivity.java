package mvp.bawie.com.mvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import mvp.bawie.com.mvp.R;
import mvp.bawie.com.mvp.presenter.MyPresenter;

public class MainActivity extends AppCompatActivity implements  MvpView{

    private MyPresenter myPresenter;
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPresenter = new MyPresenter();
        myPresenter.setMyView(this);
        view = (TextView) findViewById(R.id.tv);
        Log.e("TAG",view+"      ======        ");
        myPresenter.getData();
    }

    @Override
    public void getSucces(String data) {

    view.setText(data);
    }

    @Override
    public void getError(String error) {

    }
}
