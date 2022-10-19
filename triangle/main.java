public class Main {
    public static void main(String[] args){
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);

        double triangleAArea = triangleA.findArea();

        System.out.println(triangleAArea);
        System.out.println(triangleA.sideLenThree);
    }
}