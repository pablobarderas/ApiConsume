package responses.models;

public class Planet {

    private String climate;
    private String created;
    private String diameter;
    private String edited;
    private String[] films;
    private String gravity;
    private String name;
    private String orbital_period;
    private String population;
    private String[] residents;
    private String rotation_period;
    private String surface_water;
    private String terrain;
    private String url;

    public Planet(String climate, String created, String diameter, String edited, String[] films, String gravity, String name, String orbital_period, String population, String[] residents, String rotation_period, String surface_water, String terrain, String url) {
        this.climate = climate;
        this.created = created;
        this.diameter = diameter;
        this.edited = edited;
        this.films = films;
        this.gravity = gravity;
        this.name = name;
        this.orbital_period = orbital_period;
        this.population = population;
        this.residents = residents;
        this.rotation_period = rotation_period;
        this.surface_water = surface_water;
        this.terrain = terrain;
        this.url = url;
    }


    // Getters and setters
    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String[] getResidents() {
        return residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
