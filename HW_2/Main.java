package HW_2;

public class Main {
    public static void main(String[] args) {
        Render render = new Render();
        Building building1 = new Building(100,19);
        Building building2 = new Building(100,66);
        Building building3 = new Building(100,95);

        Hero hero1 = new Hero(100, 37, 100, 50);
        Hero hero2 = new Hero(100, 25, 100, 22);
        Hero hero3 = new Hero(100, 74, 100, 56);

        render.render(building1);
        render.render(building2);
        render.render(building3);

        render.render(hero1);
        render.render(hero2);
        render.render(hero3);

    }
}
