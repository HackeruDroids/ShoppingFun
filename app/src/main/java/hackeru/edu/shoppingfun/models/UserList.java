package hackeru.edu.shoppingfun.models;

/**
 * User Shopping Lists: Name, owner, listID, ownerImage
 */

public class UserList {
    //Properties
    private String name; //ex: Groceries
    private String ownerID; //ex: oisdf9i23ri92rf
    private String ownerImage;//ex: https://www.images.com/1.jpg
    private String listID;//ex: odsfpokwkweklsdfkldfs

    //Constructor:
    public UserList() {
    }
    //Constructor:
    public UserList(String name, String ownerID, String ownerImage, String listID) {
        this.name = name;
        this.ownerID = ownerID;
        this.ownerImage = ownerImage;
        this.listID = listID;
    }

    //getters and setters and toString...
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
    public String getOwnerImage() {
        return ownerImage;
    }
    public void setOwnerImage(String ownerImage) {
        this.ownerImage = ownerImage;
    }
    public String getListID() {
        return listID;
    }
    public void setListID(String listID) {
        this.listID = listID;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "name='" + name + '\'' +
                ", ownerID='" + ownerID + '\'' +
                ", ownerImage='" + ownerImage + '\'' +
                ", listID='" + listID + '\'' +
                '}';
    }
}
