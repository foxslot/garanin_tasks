package task_7;

public class Program {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.isSquare());
    }
}

class Rectangle{
    int length, width;

    Rectangle(int length,int  width){
        this.length = length;
        this.width = width;
    }

    boolean isSquare(){
        if (this.length == this.width){
            return true;
        } else {
            return false;
        }
    }

}
