package me.buhuan.design_pattern.decorator;

/**
 * Created by hbh on 2017/2/4.
 */
public class SideBorder extends Border{
    private char borderChar;

    protected SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
