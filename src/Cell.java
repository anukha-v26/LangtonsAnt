public class Cell {
    /**
     * this is the Cell class. it is used to create new Cell objects and create Cell methods
     */
    private int x;
    private int y;
    private int size;
    private int fillColor;
    private int row;
    private int column;

    public Cell(int x, int y, int size, int row, int column) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.row = row;
        this.column = column;
        fillColor = 255;
    }

    public int getFillColor() {
        return fillColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public void display() {
        Main.app.fill(fillColor);
        Main.app.rect(x, y, size, size);
    }

    public void evolve(){

    }

    public void handleClick() {
        //puts the ant wherever we click
    }
}
