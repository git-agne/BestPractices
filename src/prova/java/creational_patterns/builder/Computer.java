package prova.java.creational_patterns.builder;

public class Computer
{
    private String ram;
    private String hd;
    private String motherboard;

    private Boolean bluetooth;
    private String mouse;

    private Mouse realMouse;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hd = computerBuilder.hd;
        this.motherboard = computerBuilder.motherboard;
        this.bluetooth = computerBuilder.bluetooth;
        this.mouse = computerBuilder.mouse;
    }

    public String getRam() {
        return ram;
    }

    public String getHd() {
        return hd;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    //In ComputerBuilder va la logica di costruzione dell'oggetto Computer
    //Se aggiungo un campo a Computer, basta aggiungere QUI SOTTO il campo con il metodo per "riempire" il campo
    public static class ComputerBuilder {
        private String ram;
        private String hd;
        private String motherboard;
        private Boolean bluetooth;
        private String mouse;

        private Mouse realMouse;

        public ComputerBuilder(String ram, String hd, String motherboard) {
            this.ram = ram;
            this.hd = hd;
            this.motherboard = motherboard;
        }

        public ComputerBuilder realMouse(Mouse m) {
            this.realMouse = m;
            return this;
        }

        public ComputerBuilder bluetooth(boolean hasBluetooth) {
            this.bluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder mouse(String n) {
            this.mouse = n;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Mouse m = new Mouse.MouseBuilder("LG", 2, 3).build();

        Computer c = new ComputerBuilder("32GB", "BTB", "XYZ")
                .bluetooth(true)
                .realMouse(m)
                .build();

        Computer c2 = new ComputerBuilder("32GB", "BTB", "XYZ")
                .bluetooth(false)
                .build();
    }
}
