/**
 * Created by bniewo on 2/12/2015.
 */
import java.awt.Point;
public class Triangle {
    public double lengthOfSideAtoB;
    public double lengthOfSideBtoC;
    public double lengthOfSideAtoC;

    public double enterPoints(double pAX,double pAY,double pBX,double pBY,double pCX,double pCY){
       return pAX;
    }


    public double giveSideA(){
        double lengthOfSideBtoC = (Math.sqrt(Math.pow((pCX - pBX), 2) + Math.pow((pCY - pBY), 2)));
        return lengthOfSideBtoC;
    }

    public double giveSideB(){
        double lengthOfSideAtoC = (Math.sqrt(Math.pow((pAX - pCX), 2) + Math.pow((pAY - pCY), 2)));
        return lengthOfSideAtoC;
    }

    public double giveSideC(){
        double lengthOfSideAtoB = (Math.sqrt(Math.pow((pAX - pBX), 2) + Math.pow((pAY - pBY), 2)));
        return lengthOfSideAtoB;
    }

    public double giveAngleOfPointA(){
        double angleOfPointA = (Math.acos((Math.pow(lengthOfSideAtoB, 2) + Math.pow(lengthOfSideAtoC, 2) - Math.pow(lengthOfSideBtoC, 2)) / (2 * lengthOfSideAtoB * lengthOfSideAtoC)) * (180 / Math.PI));
        return angleOfPointA ;
    }

    public double giveAngleOfPointB(){
        double angleOfPointB = (Math.acos((Math.pow(lengthOfSideAtoB, 2) + Math.pow(lengthOfSideBtoC, 2) - Math.pow(lengthOfSideAtoC, 2)) / (2 * lengthOfSideBtoC * lengthOfSideAtoB)) * (180 / Math.PI));
        return angleOfPointB;
    }

    public double giveAngleOfPointC(){
        double angleOfPointC = (Math.acos((Math.pow(lengthOfSideBtoC, 2) + Math.pow(lengthOfSideAtoC, 2) - Math.pow(lengthOfSideAtoB, 2)) / (2 * lengthOfSideBtoC * lengthOfSideAtoC)) * (180 / Math.PI));
        return angleOfPointC;
    }

    public double givePerimeter(){
        double perimeterOfTriangle = (lengthOfSideAtoB + lengthOfSideBtoC + lengthOfSideAtoC);
        return perimeterOfTriangle;
    }

    public double giveArea(){
        double areaOfTriangle = (((pAX * (pBY - pCY)) + pBX * (pCY - pAY) + pCX * (pAY - pBY)) / 2);
        return areaOfTriangle;
    }



}

