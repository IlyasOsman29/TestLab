package dk.sdu.cbse.testlab;

public final class CollisionDetector {
    private CollisionDetector() { }
    public static boolean collides(Entity first, Entity second) {
        double dx = first.x() - second.x();
        double dy = first.y() - second.y();
        double radius = first.radius() + second.radius();
        return dx * dx + dy * dy <= radius * radius;
    }
}
