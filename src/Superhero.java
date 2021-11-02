public class Superhero extends Person {
    private String alterEgo; //For our taxpayer name

    public SuperHero(String governmentName, String alterEgo) {
        super(governmentName);
        this.alterEgo - alterEgo;
    }
    public String getName(){
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }
        public static void manin(String[] args) {
            SuperHero theManOfSteel = new Superhero
                    ("Clark Kent", "Superman");
        }
    }
}
