public class Main {
    public static void main(String[] args) {
        Chef chef1 = new Chef("me, i'm a chef");
        chef1.createRecipe("Fried Noodles", "Cheap Noodles & Oil", "Set fire on your pan, pour the oil, throw your noodles, let it cook. Voila, it's ready.");
        chef1.recipeList.get(0).displayInfo();
        chef1.displayInfo();

        User user1 = new User("Random guy");
        user1.followChef(chef1);
        user1.favorRecipe(chef1.recipeList.get(0));
        user1.displayInfo();
        user1.unfollowChef(chef1);
        user1.displayInfo();
    }
}