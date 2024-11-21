class Shape {

    public void area() {
        System.out.println("Print Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class equilateralTriangle extends Triangle {
    public void area(int l) {
        System.out.println(0.5 * l * l);
    }
}

class circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class inherit {
  public static void main(String[] args) {
    
  }
}
