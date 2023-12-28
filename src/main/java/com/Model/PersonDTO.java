package com.Model;

import com.Model.AccountDTO;

import javax.persistence.*;

@Entity
public class PersonDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_Id;
    private String user_Name;
    private  long user_Pass;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="accountDTO")
    private AccountDTO accountDTO;

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public long getUser_Pass() {
        return user_Pass;
    }

    public void setUser_Pass(long user_Pass) {
        this.user_Pass = user_Pass;
    }

    public AccountDTO getPasswordDTO() {
        return accountDTO;
    }

    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "user_Id=" + user_Id +
                ", user_Name='" + user_Name + '\'' +
                ", user_Pass='" + user_Pass + '\'' +
                ", passwordDTO=" + accountDTO +
                '}';
    }
}
