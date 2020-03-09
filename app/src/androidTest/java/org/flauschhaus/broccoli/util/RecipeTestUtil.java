package org.flauschhaus.broccoli.util;

import org.flauschhaus.broccoli.recipes.Recipe;

public class RecipeTestUtil {

    public static Recipe createLauchkuchen() {
        Recipe recipe = new Recipe();
        recipe.setTitle("Lauchkuchen");
        recipe.setDescription("Das essen wir alle sehr gerne!");
        recipe.setIngredients("500g Mehl\n2 Stangen Lauch");
        recipe.setDirections("1. Lauch schnippeln und Teig machen.\n2. Kochen und backen.");
        return recipe;
    }

}
