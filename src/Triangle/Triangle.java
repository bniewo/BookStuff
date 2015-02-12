/**
 * Created by Brandon on 2/12/2015.
 */
package Triangle;
public class Triangle {
    public double lengthOfSideAtoB;
    public double lengthOfSideBtoC;
    public double lengthOfSideAtoC;
    public double pAX;
    public double pAY;
    public double pBX;
    public double pBY;
    public double pCX;
    public double pCY;


    public double giveSideA(){
        lengthOfSideBtoC = (Math.sqrt(Math.pow((pCX - pBX), 2) + Math.pow((pCY - pBY), 2)));
        return lengthOfSideBtoC;
    }

    public double giveSideB(){
        lengthOfSideAtoC = (Math.sqrt(Math.pow((pAX - pCX), 2) + Math.pow((pAY - pCY), 2)));
        return lengthOfSideAtoC;
    }

    public double giveSideC(){
        lengthOfSideAtoB = (Math.sqrt(Math.pow((pAX - pBX), 2) + Math.pow((pAY - pBY), 2)));
        return lengthOfSideAtoB;
    }

    public double giveAngleOfPointA(){
        return (Math.acos((Math.pow(lengthOfSideAtoB, 2) + Math.pow(lengthOfSideAtoC, 2) - Math.pow(lengthOfSideBtoC, 2)) / (2 * lengthOfSideAtoB * lengthOfSideAtoC)) * (180 / Math.PI));

    }

    public double giveAngleOfPointB(){
        return (Math.acos((Math.pow(lengthOfSideAtoB, 2) + Math.pow(lengthOfSideBtoC, 2) - Math.pow(lengthOfSideAtoC, 2)) / (2 * lengthOfSideBtoC * lengthOfSideAtoB)) * (180 / Math.PI));
    }

    public double giveAngleOfPointC(){
        return (Math.acos((Math.pow(lengthOfSideBtoC, 2) + Math.pow(lengthOfSideAtoC, 2) - Math.pow(lengthOfSideAtoB, 2)) / (2 * lengthOfSideBtoC * lengthOfSideAtoC)) * (180 / Math.PI));
    }

    public double givePerimeter(){
        return (lengthOfSideAtoB + lengthOfSideBtoC + lengthOfSideAtoC);
    }

    public double giveArea(){
        return(Math.abs(((pAX * (pBY - pCY)) + (pBX * (pCY - pAY)) + (pCX * (pAY - pBY))) / 2));
    }



}

