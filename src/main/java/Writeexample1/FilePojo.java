package Writeexample1;

public class FilePojo {

public String id;
public String name;
public String screenNname;
public String url;
public Integer followersCount;
public Integer friendsCount;
public Integer favouritesCount;
public Integer statusesCount;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getScreenNname() {
	return screenNname;
}
public void setScreenNname(String screenNname) {
	this.screenNname = screenNname;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Integer getFollowersCount() {
	return followersCount;
}
public void setFollowersCount(Integer followersCount) {
	this.followersCount = followersCount;
}
public Integer getFriendsCount() {
	return friendsCount;
}
public void setFriendsCount(Integer friendsCount) {
	this.friendsCount = friendsCount;
}
public Integer getFavouritesCount() {
	return favouritesCount;
}
public void setFavouritesCount(Integer favouritesCount) {
	this.favouritesCount = favouritesCount;
}
public Integer getStatusesCount() {
	return statusesCount;
}
public void setStatusesCount(Integer statusesCount) {
	this.statusesCount = statusesCount;
}
@Override
public String toString() {
	return "FilePojo [id=" + id + ", name=" + name + ", screenNname=" + screenNname + ", url=" + url
			+ ", followersCount=" + followersCount + ", friendsCount=" + friendsCount + ", favouritesCount="
			+ favouritesCount + ", statusesCount=" + statusesCount + "]";
}

}