package dk.sdu.cbse.testlab;

public final class PlayerProcessor {
    public void process(Entity player, GameData data, double deltaSeconds) {
        if (data.isPressed("LEFT")) player.setRotation(player.rotation() - 180 * deltaSeconds);
        if (data.isPressed("RIGHT")) player.setRotation(player.rotation() + 180 * deltaSeconds);
        if (data.isPressed("UP")) {
            double angle = Math.toRadians(player.rotation());
            player.setVelocityX(player.velocityX() + Math.cos(angle) * 90 * deltaSeconds);
            player.setVelocityY(player.velocityY() + Math.sin(angle) * 90 * deltaSeconds);
        }
        player.setX(player.x() + player.velocityX() * deltaSeconds);
        player.setY(player.y() + player.velocityY() * deltaSeconds);
    }
}
