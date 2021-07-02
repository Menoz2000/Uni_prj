package com.example.uni_prj;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BookFragment b = new BookFragment();
    NavigaFragment n = new NavigaFragment();
    IngredientFragment i = new IngredientFragment();
    CocktailFragment c = new CocktailFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    @SuppressLint("NonConstantResourceId")
    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        Fragment selectedFragment;
        switch (item.getItemId()) {
            case R.id.bookFragment:
                selectedFragment = b;
                break;

            case R.id.navigaFragment:
                selectedFragment = n;
                break;

            case R.id.ingredientFragment:
                selectedFragment = i;
                break;

            case R.id.cocktailFragment:
                selectedFragment = c;
                break;

            default:
                return false;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, selectedFragment).commit();

        return true;

    };
}