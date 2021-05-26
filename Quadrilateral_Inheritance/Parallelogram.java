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
class Parallelogram extends Quadrilateral{
	private int height;
	Parallelogram(int xy[][],int height)
	{
	setcoordinate(xy);
	this.height=height;
	}
	int area()
	{
	int d1=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
	return d1*height;
	}

}
