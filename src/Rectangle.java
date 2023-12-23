//The 4th problem ======>>>>>>>>>>>

public class Rectangle {
    public int _height;
    public int _base;
    public Rectangle(int height, int base) {
        _height=height;
        _base=base;
    }
    public int FindArea() {
        return _base*_height;
    }
    public int FindPerimetr() {
        return 2*(_base+_height);
    }
}
