package com.example.tp2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pizza.taghti.ma.pizzarecipes.classes.Produit;

public class PizzaRecipesActivity extends AppCompatActivity {
    private ImageView pizzaImage;
    private TextView pizzaName;
    private TextView pizzaDescription;
    private TextView pizzaIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizza_recipes);
        pizzaImage = findViewById(R.id.imagePizza);
        pizzaName = findViewById(R.id.nomPizza);
        pizzaDescription = findViewById(R.id.desc);
        pizzaIngredients = findViewById(R.id.ingreds);
        Produit selectedPizza = (Produit) getIntent().getSerializableExtra("selectedPizza");
        if (selectedPizza != null) {
            pizzaImage.setImageResource(selectedPizza.getPhoto());
            pizzaName.setText(selectedPizza.getNom());
            pizzaDescription.setText(selectedPizza.getDescription());
            pizzaIngredients.setText(selectedPizza.getDetaisIngred());
        }
    }
}
