/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

/**
 *
 * @author Sorzano Torres Pablo, Wah Ortiz Yin Chew
 */
public class Metodos {

    
    private double x, y, x2, y2, xy2;

    /**
     *
     * @return
     */
    public double getX() {//regresamos la variable x
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(double x) {//establecemos la variable x
        this.x = x;
        setX2();
    }

    /**
     *
     * @return 
     */
    public double getY() {//regresamos la variable y
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(double y) {//establecemos la variable y
        this.y = y;
        setY2();
    }

    /**
     *
     * @return
     */
    public double getX2() {//regresamos la variable x^2
        return x2;
    }

    /**
     *
     */
    public void setX2() {//establecemos la variable x^2
        x2=x*x;
    }

    /**
     *
     * @return
     */
    public double getY2() {//regresamos la variable y^2
        return y2;
    }

    /**
     *
     */
    public void setY2() {//establecemos la variable y^2
        y2=y*y;
    }

    /**
     *
     * @return
     */
    public double getXy2() {//regresamos la variable 2 * x *y
        return xy2;
    }

    /**
     *
     */
    public void setXy2() {//establecemos la variable 2 * x * y
        xy2= 2*x*y;
    }

    

    
    
}
