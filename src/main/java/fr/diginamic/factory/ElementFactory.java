package fr.diginamic.factory;

public class ElementFactory {
    public static Element create(ElementType type, String name, double value, Unite unite) {
        switch (type) {
            case ADDITIVE:
                return new Addtive(name, value, unite);

            case INGREDIENT:
                return new Ingredient(name, value, unite);

            case ALLERGEN:
                return new Allergen(name, value, unite);

            default:
                return new Ingredient(name, value, unite);
        }
    }
}