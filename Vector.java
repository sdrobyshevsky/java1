public class Vector 
{
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return возвращает результат
     * @apiNote метод вычисляет длиную вектора
     */
    public Double lenVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote метод, вычисляющий скалярное произведение:
     * @param two второй вектор скалярного умножения
     * @return
     */
    public Integer scalar(Vector two) {
        return x * two.x + y * two.y + z * two.z;
    }
}