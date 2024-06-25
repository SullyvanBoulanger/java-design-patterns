package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.diginamic.factory.Unite;

public class ProductTest {

    @Test
    public void shouldBuildProduct() {
        String expectedName = "Barre de Chocolat";
        String expectedRank = "E";
        String expectedCategory = "Sucré";
        String expectedBrand = "brand";

        String expectedAdditiveName = "Additive";
        double expectedAdditiveValue = 25;
        Unite expectedAdditiveUnite = Unite.MICRO_GRAMS;

        String expectedAllergenName = "Allergen";
        double expectedAllergenValue = 45;
        Unite expectedAllergenUnite = Unite.MILLI_GRAMS;

        String expectedIngredientName = "Ingredient";
        double expectedIngredientValue = 50;
        Unite expectedIngredientUnite = Unite.MILLI_GRAMS;

        Product product = new Product();
        product.appendName(expectedName)
                .appendRank(expectedRank);

        assertEquals(expectedName, product.getName());
        assertEquals(expectedRank, product.getRank());

        product.appendCategory("Sucré")
                .appendBrand("brand");

        assertTrue(expectedCategory.equals(product.getCategory().getName()));
        assertTrue(expectedBrand.equals(product.getBrand().getName()));

        product.appendAdditive(expectedAdditiveName, expectedAdditiveValue, expectedAdditiveUnite)
                .appendAllergen(expectedAllergenName, expectedAllergenValue, expectedAllergenUnite)
                .appendIngredient(expectedIngredientName, expectedIngredientValue, expectedIngredientUnite);

        assertTrue(product.getAdditives().stream()
                .anyMatch(additive -> additive.getName().equals(expectedAdditiveName)
                        && additive.getValue() == expectedAdditiveValue
                        && additive.getUnite() == expectedAdditiveUnite));

        assertTrue(product.getAllergens().stream()
                .anyMatch(allergen -> allergen.getName().equals(expectedAllergenName)
                        && allergen.getValue() == expectedAllergenValue
                        && allergen.getUnite() == expectedAllergenUnite));

        assertTrue(product.getIngredients().stream()
                .anyMatch(ingredient -> ingredient.getName().equals(expectedIngredientName)
                        && ingredient.getValue() == expectedIngredientValue
                        && ingredient.getUnite() == expectedIngredientUnite));
    }
}
