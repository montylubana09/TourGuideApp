package comll.example.android.tourguideapp;

public class Word {
    private int mPlaceName;
    private int mImageResourceID;

    public Word(int placeName,int resourceId)
    {
        mPlaceName=placeName;
        mImageResourceID=resourceId;

    }

    public int getPlaceName()
    {
        return mPlaceName;
    }
    public int getImageResourceID()
    {
        return mImageResourceID;
    }

}

