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
public class Square extends Quadrilateral{
  
Square(int xy[][]){
	setcoordinate(xy);
}
int area(){
    int ar=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
    return ar*ar;
}
}
