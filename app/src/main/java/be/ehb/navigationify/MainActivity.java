package be.ehb.navigationify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        NavController myNavController = Navigation.findNavController(this, R.id.nav_container);
        AppBarConfiguration myAppBarConfiguration = new AppBarConfiguration.Builder(myNavController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, myNavController, myAppBarConfiguration);
    }
}