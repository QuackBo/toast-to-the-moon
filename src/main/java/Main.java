
import zero.GameApp;
import zero.Color;

public class Main extends GameApp
{
    private Moon moon;

    @Override public void settings()
    {
        title("Moon Rising Game, Click the Moon");
        size(420, 240);
        padding(20);
    }

    @Override public void setup()
    {
        moon = new Moon(40, 180);
    }

    @Override public void update(double seconds)
    {
        if (mousePressed())
        {
            if (moon.isClicked(mouseX(), mouseY()))
            {
                moon.fly(20, height());
            }
        }
    }

    @Override public void draw()
    {
        background(Color.rgb(35, 33, 33));
        moon.draw(this);
    }

    

    public static void main(String[] args)
    {
        launch(args);
    }
}
