public class Kraj {
    private String shortcut;
    private String name;
    private int population;

    public Kraj(String shortcut, String name, int population) {
        this.shortcut = shortcut;
        this.name = name;
        this.population = population;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Kraj{" +
                "shortcut='" + shortcut + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
