package ua.testing.model;

import ua.testing.view.TextConstant;

/**
 * <h1>Pixel (Equals HashCode)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-17
 */
public class Pixel {
    private static int count = 0;
    private int id;
    private double x;
    private double y;
    private Color color;

    public Pixel(double x, double y, Color color) {
        this.id = ++count;
        checkX(x);
        checkY(y);
        this.color = color;
    }

    public final void checkX(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException(TextConstant.X_COORDINATE + TextConstant.WRONG_INPUT_DATA);
        }
        this.x = x;
    }

    public final void checkY(double y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException(TextConstant.Y_COORDINATE + TextConstant.WRONG_INPUT_DATA);
        }
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        checkX(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        checkY(y);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + x);
        result = (int) (prime * result + y);
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!(obj instanceof Pixel)) return false;
        Pixel other = (Pixel) obj;
        if (this.color == null) {
            if (other.color != null)
                return false;
            else {
                return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0;
            }
        }
        return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0
                && color.equals(other.color);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
