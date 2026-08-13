package dk.sdu.cbse.testlab;

public final class Entity {
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;
    private double rotation;
    private final double radius;

    public Entity(double x, double y, double radius) { this.x = x; this.y = y; this.radius = radius; }
    public double x() { return x; }
    public void setX(double x) { this.x = x; }
    public double y() { return y; }
    public void setY(double y) { this.y = y; }
    public double velocityX() { return velocityX; }
    public void setVelocityX(double velocityX) { this.velocityX = velocityX; }
    public double velocityY() { return velocityY; }
    public void setVelocityY(double velocityY) { this.velocityY = velocityY; }
    public double rotation() { return rotation; }
    public void setRotation(double rotation) { this.rotation = rotation; }
    public double radius() { return radius; }
}
