package models;

import java.io.*;
import java.util.*;

public class Student {
    private String id;
    private String name;
    private String email;
    private Date registrationTime;

    public Student(String id, String name, String email, Date registrationTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationTime = registrationTime;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Date getRegistrationTime() { return registrationTime; }
}
