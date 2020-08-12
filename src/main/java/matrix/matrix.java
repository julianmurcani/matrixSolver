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
public class matrix {
    float[][] matrix;
    float[][] matrixSolved;
    int n,m;

    public matrix(float[][] matrix, int n, int m){
        this.matrix = matrix.clone();
        this.matrixSolved = matrix.clone();
        this.n = n;
        this.m = m;
    }
    
    public void solveMatrix(){
        int pivot;
        for(pivot = 0; pivot < n; pivot ++){
            generatePivot(pivot);
            mostrarMatriz();
            makeZeros(pivot);
            mostrarMatriz();
        }
    }
    
    
     private void generatePivot(int pivot){
         float factor = matrixSolved[pivot][pivot];
         for(int i = pivot; i < m; i ++){
             matrixSolved[pivot][i] /= factor;
         }
     }
     
     private void makeZeros(int pivot){
         float[] filaPivot = matrixSolved[pivot].clone();
         //System.out.println(queue[0] + " " + queue[1] + " " + queue[2]);
         for(int fila = 0; fila < n; fila++){
             if(fila == pivot) continue;
             zero(matrixSolved[fila],filaPivot,pivot);
             }
     }
    
     private void zero(float[] queueToZero, float[] filaPivot, int pivot){
         float factor = queueToZero[pivot];
         //System.out.println(queueToZero[0] + " " + queueToZero[1] + " " + queueToZero[2]);
         for(int i = pivot; i < m; i++)
             queueToZero[i] = queueToZero[i] + filaPivot[i]*factor*(-1);
     }
     
     private void mostrarMatriz(){
         for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++)
                 System.out.print(matrixSolved[i][j] + "  ");
             System.out.println();
         }
         System.out.println("\n\n");
     }
}
