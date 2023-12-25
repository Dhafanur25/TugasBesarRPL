package Model;

import Controller.Database;

public class Konselor {
    private int ID;
    private String Nama_Lengkap;
    private String Email;
    private String No_Telp;
    private String Pengalaman;
    private String link_Meet;
    private String Profile_Pic_Path;
    private String Password;
    private static Konselor instance;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNama_Lengkap() {
        return Nama_Lengkap;
    }

    public void setNama_Lengkap(String Nama_Lengkap) {
        this.Nama_Lengkap = Nama_Lengkap;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }

    public String getPengalaman() {
        return Pengalaman;
    }

    public void setPengalaman(String Pengalaman) {
        this.Pengalaman = Pengalaman;
    }

    public String getLink_Meet() {
        return link_Meet;
    }

    public void setLink_Meet(String link_Meet) {
        this.link_Meet = link_Meet;
    }

    public String getProfile_Pic_Path() {
        return Profile_Pic_Path;
    }

    public void setProfile_Pic_Path(String Profile_Pic_Path) {
        this.Profile_Pic_Path = Profile_Pic_Path;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public static Konselor getInstance() {
        if (instance == null) {
            instance = new Konselor();
        }
        return instance;
    }
    
}
