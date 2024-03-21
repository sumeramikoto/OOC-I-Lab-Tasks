import java.util.*;
public class Chef {
    public String name;
    Recipe recipe;
    public ArrayList<Recipe>recipeList;

    public Chef(String name) {
        this.name = name;
        this.recipeList = new ArrayList<>(); // both are composition
        this.recipe = new Recipe();          //
    }

    void createRecipe(String recipeTitle, String recipeIngredients, String recipeProcedure) {
        recipe.title = recipeTitle;
        recipe.ingredients = recipeIngredients;
        recipe.procedure = recipeProcedure;
        recipeList.add(recipe);
    }

    private void removeRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }

    public void displayRecipeList() {
        for (int i = 0; i < recipeList.size(); i++) {
            String recipeName = recipeList.get(i).title;
            System.out.println(recipeName);
        }
    }

    public void displayInfo() {
        System.out.println("Displaying chef info");
        System.out.println("Name - " +name);
        System.out.println("List of recipes");
        System.out.println("----------------");
        displayRecipeList();
        System.out.println("\n");
    }


}
