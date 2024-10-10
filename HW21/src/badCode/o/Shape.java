package badCode.o;

class Shape {
    private String type;
    private double radius;
    private double width;
    private double height;

    public Shape() {
    }

    public Shape(String type, double radius, double width, double height) {
        this.type = type;
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        if (type.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            return width * height;
        }
        return 0;
    }
}
