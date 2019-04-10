package site.recomi.studentmanagement.model;

public class UserAllInfo {
    private String id;
    private String name;
    private String class_;
    private String lib_card_id;
    private String sex;
    private String phone;

    public UserAllInfo(String id, String name, String class_, String lib_card_id, String sex, String phone) {
        this.id = id;
        this.name = name;
        this.class_ = class_;
        this.lib_card_id = lib_card_id;
        this.sex = sex;
        this.phone = phone;
    }

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

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getLib_card_id() {
        return lib_card_id;
    }

    public void setLib_card_id(String lib_card_id) {
        this.lib_card_id = lib_card_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
