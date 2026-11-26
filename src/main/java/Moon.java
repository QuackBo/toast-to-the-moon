
import zero.Color;
import zero.GameApp;

public class Moon
{
    private double x;
    private double y;
    private final double size = 24;

    public Moon(double startX, double startY)
    {
        x = startX;
        y = startY;
    }

    public void fly(int vertical, double canvasHeight)
    {
        y -= vertical;
        y = Math.max(0, Math.min(y, canvasHeight - size));
    }

    public boolean isClicked(double mouseX, double mouseY)
    {
        return mouseX >= x && mouseX <= x + size
            && mouseY >= y && mouseY <= y + size;
    }

    public void draw(GameApp app)
    {
        app.fill(Color.rgb(255, 255, 255));
        app.rect(x, y, size, size);
    }
}
