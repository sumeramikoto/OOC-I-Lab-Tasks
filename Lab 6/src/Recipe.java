public class Recipe {
    public String title;
    public String ingredients;
    public String procedure;


    public Recipe() {
        this.title = "Default";
        this.ingredients = "Default";
        this.procedure = "Default";
    }
    
    public void displayInfo() {
        System.out.println("Displaying recipe information");
        System.out.println("Recipe Title: " +title);
        System.out.println("Ingredients: " +ingredients);
        System.out.println("Procedure: " +procedure);
        System.out.println("\n");
    }
}
