package week5_6;

import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Layer {
    public ArrayList<Shape> shapes = new ArrayList<>();
    public int removeCircle()
    {
        int dem =0;
        for(int i = 0;i<this.shapes.size();i++)
        {
            if(shapes.get(i) instanceof  Circle)
            {
                shapes.remove(i);
                dem++;
                i--;
            }
        }
        return  dem;
    }
    public int removeTriangle()
    {
        int dem = 0;
        for(int i =0;i<this.shapes.size();i++)
        {
            if(shapes.get(i) instanceof Triangle)
            {
                shapes.remove(i);
                dem++;
                i--;
            }
        }
        return dem;
    }


}
