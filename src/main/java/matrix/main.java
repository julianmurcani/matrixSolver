/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Julian
 */
public class main {
    public static void main(String[] args) {
        float[][] matriz = {{5,1,3},
                            {2,0,4},
                            {1,3,2}};
        
        matrix m = new matrix(matriz,3,3);
        m.solveMatrix();
    }
}
