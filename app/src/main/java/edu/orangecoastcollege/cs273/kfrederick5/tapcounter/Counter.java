package edu.orangecoastcollege.cs273.kfrederick5.tapcounter;

/**
 * Created by Link on 9/11/2016.
 */
public class Counter {
    private int mCount;

    public Counter() {
        mCount = 0;
    }

    public Counter(int mCount)
    {
        this.mCount = mCount;
    }

    public void setCount(int count) {
        mCount = count;
    }

    public int getCount() {return mCount;}

    public void addOne(){mCount++;}

}
