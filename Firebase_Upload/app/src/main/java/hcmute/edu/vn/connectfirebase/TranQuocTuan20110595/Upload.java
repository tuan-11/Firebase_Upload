package hcmute.edu.vn.connectfirebase.TranQuocTuan20110595;

import com.google.firebase.database.Exclude;

public class Upload {
    private String name;
    private String imageUri;
    private String mKey;

    public Upload(){

    }

    public Upload(String name, String imageUri) {
        if(name.trim().equals("")){
            name= "No name";
        }
        this.name = name;
        this.imageUri = imageUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}
