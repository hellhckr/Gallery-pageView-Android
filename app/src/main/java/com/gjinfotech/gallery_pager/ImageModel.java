package com.gjinfotech.gallery_pager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Abhinay M Unnikrishnan on 29-Jun-16.
 * Contact Number : +918289968332
 * EmailId :: Abhinaymu@gmail.com
 */
public class ImageModel {
    String name, url;

    public ImageModel() {

    }

    protected ImageModel(Parcel in) {
        name = in.readString();
        url = in.readString();
    }

    public static final Parcelable.Creator<ImageModel> CREATOR = new Parcelable.Creator<ImageModel>() {
        @Override
        public ImageModel createFromParcel(Parcel in) {
            return new ImageModel(in);
        }

        @Override
        public ImageModel[] newArray(int size) {
            return new ImageModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

  /*  @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(url);
    }*/

}
