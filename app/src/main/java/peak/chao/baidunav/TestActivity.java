package peak.chao.baidunav;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.baidu.navisdk.adapter.BaiduNaviManagerFactory;

public class TestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View map = BaiduNaviManagerFactory.getMapManager().getMapView();
        if (map != null && map.getParent() != null) {
            ((ViewGroup) map.getParent()).removeView(map);
        }
        setContentView(map);
    }
}
