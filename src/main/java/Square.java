import com.jogamp.opengl.GL2;

import javax.vecmath.Vector2d;

/**
 * Created by Aaron on 3/9/2018.
 */
public class Square extends Shape {
    private int sideLength;
    private Color color = Color.WHITE;

    public Square(int x, int y, int size){
        this.x = x;
        this.y = y;
        sideLength = size;
        this.movement = new Vector2d(0,0);
    }

    public Square(int x, int y, int size, Vector2d movement){
        this.x = x;
        this.y = y;
        this.movement = movement;
        sideLength = size;
    }

    public void draw(GL2 gl){
        int halfSide = sideLength/2;
        gl.glColor4f(color.getR(), color.getG(), color.getB(), color.getA());
        gl.glBegin(GL2.GL_POLYGON);
        gl.glVertex2f(x +halfSide, y+halfSide);
        gl.glVertex2f(x + halfSide, y-halfSide);
        gl.glVertex2f(x - halfSide, y-halfSide);
        gl.glVertex2f(x - halfSide, y+halfSide );
        gl.glEnd();
    }

    public float getLeftPoint() {
        return x-sideLength/2;
    }

    public float getTopPoint() {
        return y-sideLength/2;
    }

    public float getRightPoint() {
        return x+sideLength/2;
    }

    public float getBottomPoint() {
        return y+sideLength/2;
    }

    public void setColor(Color color){
        this.color = color;
    }

}
