import java.util.*;

public class User {
    public String name;
    protected ArrayList<Chef>chefsFollowedList;
    protected ArrayList<Recipe>favoriteRecipesList;

    public User(String name) {
        this.name = name;
        this.chefsFollowedList = new ArrayList<>();
        this.favoriteRecipesList = new ArrayList<>();
    }

    public void followChef(Chef chef) {
        chefsFollowedList.add(chef);
    }

    public void unfollowChef(Chef chef) {
        chefsFollowedList.remove(chef);
    }

    public void favorRecipe(Recipe recipe) {
        favoriteRecipesList.add(recipe);
    }

    public void disfavorRecipe(Recipe recipe) {
        favoriteRecipesList.remove(recipe);
    }

    private void displayChefsFollowed() {
        for (int i = 0; i < chefsFollowedList.size(); i++) {
            String chefName = chefsFollowedList.get(i).name;
            System.out.println(chefName);
        }
    }

    private void displayFavoriteRecipes() {
        for (int i = 0; i < favoriteRecipesList.size(); i++) {
            String recipeName = favoriteRecipesList.get(i).title;
            System.out.println(recipeName);
        }
    }
    public void displayInfo() {
        System.out.println("Displaying user info");
        System.out.println("Name - " +name);
        System.out.println("Chefs currently followed");
        System.out.println("------------------------");
        displayChefsFollowed();
        System.out.println("Favorite Recipes");
        System.out.println("----------------");
        displayFavoriteRecipes();
        System.out.println("\n");
    }

}
