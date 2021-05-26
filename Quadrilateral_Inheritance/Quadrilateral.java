/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author suraj
 */
public class Quadrilateral {
    int xy[][]=new int[4][2]; //4 end points specified
	void setcoordinate(int xy[][]){
		for(int i=0;i<4;i++)
		for(int j=0;j<2;j++)
		this.xy[i][j]=xy[i][j];
		}
    
}
