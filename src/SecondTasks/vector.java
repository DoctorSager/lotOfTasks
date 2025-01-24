package SecondTasks;

import java.util.Random;

public class vector {

    private double axisX;
    private double axisY;
    private double axisZ;
    
    @Override
    public String toString() {
        return "vector [axisX=" + axisX + ", axisY=" + axisY + ", axisZ=" + axisZ + "]";
    }

    public vector(double axisX, double axisY, double axisZ) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.axisZ = axisZ;
    }
    
    public double lenghtOfVector (){

        return Math.sqrt((axisX * axisX) + (axisY * axisY) + (axisZ * axisZ));
    }
    
    public double scalar(vector vector){

        return axisX * vector.axisX + axisY * vector.axisY + axisZ * vector.axisZ;
     
    }

    public vector crossProduct (vector vector){
    
        return new vector
        (axisY * vector.axisZ - axisZ * vector.axisY,
         axisZ * vector.axisX - axisX * vector.axisZ,
         axisX * vector.axisY - axisY * vector.axisX);
    }

    public double cos(vector vector){

        return scalar(vector) / (lenghtOfVector() * vector.lenghtOfVector());

    }

    public vector sum(vector vector){

        return new vector
        (axisX + vector.axisX,
        axisY + vector.axisY,
        axisZ + vector.axisZ);
    }

    public vector dif(vector vector){

        return new vector
        (axisX - vector.axisX,
        axisY - vector.axisY,
        axisZ - vector.axisZ);

    }

    public static vector[] fill(int n){
        
        vector[] vector = new vector[n];
        Random rnd = new Random(10);

        for (int i = 0; i < vector.length; i++) {
    
            vector[i] = new vector(rnd.nextInt(n), rnd.nextInt(n), rnd.nextInt(n));     
        }
        return vector;
    }
    
    
    
}
