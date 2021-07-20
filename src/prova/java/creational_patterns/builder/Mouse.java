package prova.java.creational_patterns.builder;

public class Mouse
{
    //Per esercizio aggiungere classe Mouse con MouseBuilder
    private String brand;
    private int cableLength;
    private int buttons;

    public Mouse(MouseBuilder mouseBuilder) {
        this.brand = mouseBuilder.brand;
        this.cableLength = mouseBuilder.cableLength;
        this.buttons = mouseBuilder.buttons;
    }

    public String getBrand() {
        return brand;
    }

    public int getCableLength() {
        return cableLength;
    }

    public int getButtons() {
        return buttons;
    }

    public static class MouseBuilder {
        private String brand;
        private int cableLength;
        private int buttons;

        public MouseBuilder(String brand, int cableLength, int buttons) {
            this.brand = brand;
            this.cableLength = cableLength;
            this.buttons = buttons;
        }

        public Mouse build() {
            return new Mouse(this);
        }
    }
}
