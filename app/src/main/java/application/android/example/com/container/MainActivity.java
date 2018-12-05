package application.android.example.com.container;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomnav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomnav=findViewById(R.id.bottom_nav);
        bottomnav.setOnNavigationItemSelectedListener(nav);
    }
    private  BottomNavigationView.OnNavigationItemSelectedListener nav=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragselec=null;
            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    fragselec=new Second_Activity();
                    break;
                case R.id.navigation_dashboard:
                    fragselec=new Third_Activity();
                    break;
                case R.id.navigation_notifications:
                    fragselec=new Fourth_Activity();
                    break;
                    default:
                        fragselec=new Second_Activity();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragnav,fragselec).commit();
            return true;
        }
    };
}
