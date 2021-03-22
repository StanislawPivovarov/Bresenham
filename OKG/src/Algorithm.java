import java.awt.*;

public class Algorithm
{

    private static int sign(int x)
    {
        if (x > 0)
        {
            return 1;
        }
        else if (x < 0)
        {
            return -1;
        }
        else if (x == 0)
        {
            return 0;
        }
        return 0;
    }

    public static void drawBresenhamLine(int xStart, int yStart, int xEnd, int yEnd, Graphics g)
    {
        int x, y, deltaX, deltaY, directionX, directionY, pixelDirectionX, pixelDirectionY, error, lengthToMiddle, maxLenght;

        deltaX = xEnd - xStart;

        deltaY = yEnd - yStart;

        directionX = sign(deltaX);
        directionY = sign(deltaY);

        if (deltaX < 0)
        {
            deltaX = -deltaX;
        }
        if (deltaY < 0)
        {
            deltaY = -deltaY;
        }

        if (deltaX > deltaY)
        {
            pixelDirectionX = directionX;
            pixelDirectionY = 0;
            lengthToMiddle = deltaY;
            maxLenght = deltaX;
        }
        else
        {
            pixelDirectionX = 0;
            pixelDirectionY = directionY;
            lengthToMiddle = deltaX;
            maxLenght = deltaY;
        }

        x = xStart;
        y = yStart;
        error = maxLenght/2;
        g.drawLine (x, y, x, y);
        for (int i = 0; i < maxLenght; i++)
        {
            error = error - lengthToMiddle;
            if (error < 0)
            {
                error = error + maxLenght;
                x = x + directionX;
                y = y + directionY;
            }
            else
            {
                x = x + pixelDirectionX;
                y = y + pixelDirectionY;
            }

            g.drawLine (x, y, x, y);
        }
    }
}
