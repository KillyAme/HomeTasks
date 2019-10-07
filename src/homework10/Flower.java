package homework10;

public class Flower {
    private String country;
    private int life, price;
    static int count = 0;

    public Flower(String country, int life, int price) {
        this.country = country;
        this.life = life;
        this.price = price;
        count++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[5];
        bouquet1[0] = new Rose();
        bouquet1[1] = new Tulip();
        bouquet1[2] = new Rose();
        bouquet1[3] = new Dianthus();
        bouquet1[4] = new Dianthus();
        int cost = 0;
        for (Flower flower : bouquet1) {
            cost += flower.getPrice();
        }
        System.out.println("Букет стоит: " + cost);
        Flower[] bouquet2 = new Flower[7];
        bouquet2[0] = new Violet();
        bouquet2[1] = new Violet();
        bouquet2[2] = new Violet();
        bouquet2[3] = new Rose();
        bouquet2[4] = new Rose();
        bouquet2[5] = new Rose();
        bouquet2[6] = new Tulip();
        cost = 0;
        for (Flower flower : bouquet2) {
            cost += flower.getPrice();
        }
        System.out.println("Букет стоит: " + cost);
        Flower[] bouquet3 = new Flower[3];
        bouquet3[0] = new Rose();
        bouquet3[1] = new Violet();
        bouquet3[2] = new Tulip();
        cost = 0;
        for (Flower flower : bouquet3) {
            cost += flower.getPrice();
        }
        System.out.println("Букет стоит: " + cost + "\n" + "Всего цветов продано: " + count);
    }
}

