package petstore;

public enum PetStoreEndpoints {
  PET_UPLOAD_IMAGE("/pet/%s/uploadImage"),
  PET("/pet"),
  PET_BY_ID("/pet/%s"),
  PET_FIND_BY_STATUS("/pet/findByStatus"),

  STORE("/store/order"),
  STORE_BY_ID("/store/order/%s"),
  STORE_INVENTORY("/store/inventory"),

  USER_BY_USERNAME("/user/%s"),
  USER_CREATE_WITH_ARRAY("/user/createWithArray"),
  USER_CREATE_WITH_LIST("/user/createWithList"),
  USER_LOGIN("/user/login"),
  USER_LOGOUT("/user/logout"),
  USER("/user");

  private final String url;

  PetStoreEndpoints(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}
