package ominext.doan.stores.requests;

import lombok.Data;

import java.util.Date;

@Data
public class UserRequest {

    private Long id;

    private String userName;

    private String password;

    private int role;

    private Date createDay;

    private String createPerson;

    private int deleted;
}
