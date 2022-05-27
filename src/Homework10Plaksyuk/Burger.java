package Homework10Plaksyuk;

public class Burger {
    String bun;
    String meat1;
    String meat2;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat1, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Ваш бургер: " + bun + " булочка, " + meat1 + " котлета, " + greens + " зелень, " + "майонез " + mayonnaise + ".");
    }

    public Burger(String bun, String meat1, String greens) {
        this.bun = bun;
        this.meat1 = meat1;
        this.greens = greens;
        System.out.println("Ваш вегетарианский бургер: " + bun + " булочка, " + meat1 + " котлета, " + greens + " зелень.");
    }

    public Burger(String bun, String meat1, String greens, String mayonnaise, String meat2) {
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Ваш двойной бургер: " + bun + " булочка, " + meat1 + " котлета сверху, " + meat2 + " котлета снизу, " + greens + " зелень, " + "майонез " + mayonnaise + ".");
    }
}
